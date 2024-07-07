package com.example.assignment2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class CoursesListFragment extends Fragment {

    View view;
    Button androidBtn, iOSBtn, fullStackBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_courses_list, container, false);

        androidBtn = view.findViewById(R.id.android_btn);
        iOSBtn = view.findViewById(R.id.iOS_btn);
        fullStackBtn = view.findViewById(R.id.full_stack_btn);
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();



        androidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AndroidCourseFragment androidCourseFragment = new AndroidCourseFragment();
                fragmentTransaction.replace(R.id.frame_layout, androidCourseFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        iOSBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iosCourseFragment ios_course_fragment = new iosCourseFragment();
                fragmentTransaction.replace(R.id.frame_layout, ios_course_fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        fullStackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FullStackFragment fullStackFragment = new FullStackFragment();
                fragmentTransaction.replace(R.id.frame_layout, fullStackFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}