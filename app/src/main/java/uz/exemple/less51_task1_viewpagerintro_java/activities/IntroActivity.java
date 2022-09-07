package uz.exemple.less51_task1_viewpagerintro_java.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import uz.exemple.less51_task1_viewpagerintro_java.R;
import uz.exemple.less51_task1_viewpagerintro_java.adapters.VPagerAdapter;
import uz.exemple.less51_task1_viewpagerintro_java.fragments.PageOne;
import uz.exemple.less51_task1_viewpagerintro_java.fragments.PageThree;
import uz.exemple.less51_task1_viewpagerintro_java.fragments.PageTwo;

public class IntroActivity extends AppCompatActivity {
     VPagerAdapter myVPAdapter;
     ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        initViews();
    }

    void initViews(){
        viewPager = findViewById(R.id.view_pager);
        myVPAdapter = new VPagerAdapter(getSupportFragmentManager(),getLifecycle());

        myVPAdapter.add(new PageOne(), "FirstPage");
        myVPAdapter.add(new PageTwo(), "SecondPage");
        myVPAdapter.add(new PageThree(), "ThirdPage");

        viewPager.setAdapter(myVPAdapter);
    }
}















