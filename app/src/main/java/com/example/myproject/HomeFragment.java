package com.example.myproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myproject.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    ActivityMainBinding binding;
    private ArrayList<Articles> newArrayList;
    private String[] articletitle;
    private String[] articlebody;
    private int[] articleimg;
    private RecyclerView recylcleview;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialze();
        recylcleview= view.findViewById(R.id.list_view);
        recylcleview.setLayoutManager(new LinearLayoutManager(getContext()));
        recylcleview.setHasFixedSize(true);
        NewAdapter newAdapter=new NewAdapter(getContext(),newArrayList);
        recylcleview.setAdapter(newAdapter);
        newAdapter.notifyDataSetChanged();

    }

    private void dataInitialze() {
        newArrayList=new ArrayList<>();
        
        articletitle=new String[]{
                getString(R.string.app_name),
                getString(R.string.hello_blank_fragment),
                getString(R.string.first_fragment_label),
                getString(R.string.hello_blank_fragment),
                getString(R.string.app_name),
                getString(R.string.app_name),

        };
        
        articlebody=new String[]{
                getString(R.string.app_name),
                getString(R.string.hello_blank_fragment),
                getString(R.string.hello_blank_fragment),
                getString(R.string.app_name),
                getString(R.string.app_name),
                getString(R.string.app_name),

        };
        
        articleimg=new int[]{
                R.drawable.splashimg,
                R.drawable.splashimg,
                R.drawable.splashimg,
                R.drawable.splashimg,
                R.drawable.splashimg,
                R.drawable.splashimg,


        };
        for (int i = 0; i < articletitle.length; i++) {
            Articles articles=new Articles(articletitle[i],articlebody[i],articleimg[i]);
            newArrayList.add(articles);
            
        }
    }
}