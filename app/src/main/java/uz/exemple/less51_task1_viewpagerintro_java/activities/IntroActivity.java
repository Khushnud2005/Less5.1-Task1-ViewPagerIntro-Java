package uz.exemple.less51_task1_viewpagerintro_java.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import uz.exemple.less51_task1_viewpagerintro_java.MainActivity;
import uz.exemple.less51_task1_viewpagerintro_java.R;
import uz.exemple.less51_task1_viewpagerintro_java.adapters.VPagerAdapter;
import uz.exemple.less51_task1_viewpagerintro_java.fragments.PageOne;
import uz.exemple.less51_task1_viewpagerintro_java.fragments.PageThree;
import uz.exemple.less51_task1_viewpagerintro_java.fragments.PageTwo;

public class IntroActivity extends AppCompatActivity {
     VPagerAdapter myVPAdapter;
     ViewPager2 viewPager;
    private TabLayout tabLayout;
    private TextView tv_skip;
    private Button btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        initViews();
    }

    void initViews(){
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);
        tv_skip = findViewById(R.id.tv_skip);
        btn_start = findViewById(R.id.btn_start);

        myVPAdapter = new VPagerAdapter(getSupportFragmentManager(),getLifecycle());

        myVPAdapter.add(new PageOne(), "FirstPage");
        myVPAdapter.add(new PageTwo(), "SecondPage");
        myVPAdapter.add(new PageThree(), "ThirdPage");

        viewPager.setAdapter(myVPAdapter);

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if (viewPager.getCurrentItem() == 2){
                    btn_start.setVisibility(View.VISIBLE);
                    tv_skip.setVisibility( View.GONE);
                }else{
                    btn_start.setVisibility( View.GONE);
                    tv_skip.setVisibility( View.VISIBLE);
                }
            }
        });
        tv_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2,true);
            }
        });
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        ViewGroup tabs = (ViewGroup) tabLayout.getChildAt(0);
        new TabLayoutMediator(tabLayout, viewPager, true,
                new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(TabLayout.Tab tab, int position) {
                // position of the current tab and that tab
                for (int i = 0;i<tabs.getChildCount();i++) {
                    View v = tabs.getChildAt(i);
                    ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
                    params.rightMargin = 25;
                }
            }
        }).attach();

    }

    void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}















