package uz.exemple.less51_task1_viewpagerintro_java.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import uz.exemple.less51_task1_viewpagerintro_java.MainActivity;
import uz.exemple.less51_task1_viewpagerintro_java.R;


public class PageTwo extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_page_two, container, false);
        initViews(view);
        return view;

    }
    void  initViews( View view){
        TextView tv_title = view.findViewById(R.id.tv_title_f2);
        TextView tv_desc = view.findViewById(R.id.tv_desc_f2);

        tv_title.setText("Safe, Trusted & Fully Secure");
        tv_desc.setText("Encrypted transactions mean your payments & Privacy and protected.");


    }

    void openMainActivity(){
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);

    }
}