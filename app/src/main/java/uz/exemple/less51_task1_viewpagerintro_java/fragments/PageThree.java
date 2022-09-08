package uz.exemple.less51_task1_viewpagerintro_java.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import uz.exemple.less51_task1_viewpagerintro_java.MainActivity;
import uz.exemple.less51_task1_viewpagerintro_java.R;


public class PageThree extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_page_three, container, false);
        initViews(view);
        return view;

    }
    void  initViews( View view){
        TextView tv_title = view.findViewById(R.id.tv_title_f3);
        TextView tv_desc = view.findViewById(R.id.tv_desc_f3);

        tv_title.setText("Easy To Use");
        tv_desc.setText("Pick a number, choose an amount, send your Top-up. Simple");


    }

    void openMainActivity(){
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);

    }
}