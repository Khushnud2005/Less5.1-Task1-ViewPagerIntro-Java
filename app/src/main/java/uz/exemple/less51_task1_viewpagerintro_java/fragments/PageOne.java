package uz.exemple.less51_task1_viewpagerintro_java.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import uz.exemple.less51_task1_viewpagerintro_java.MainActivity;
import uz.exemple.less51_task1_viewpagerintro_java.R;


public class PageOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_page_one, container, false);
        initViews(view);
        return view;

    }
    void  initViews( View view){
        TextView tv_title = view.findViewById(R.id.tv_title_f1);
        TextView tv_desc = view.findViewById(R.id.tv_desc_f1);
        TextView tv_skip = view.findViewById(R.id.tv_skip_f1);
        tv_title.setText("Say Hello to Global Top - Up");
        tv_desc.setText("Send mobile top-up to more then 500 networks in over 140 countries.");

        tv_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    void openMainActivity(){
        Intent intent = new Intent(getActivity(),MainActivity.class);
        startActivity(intent);
        getActivity().finish();

    }
}