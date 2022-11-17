package com.example.myproject;

import android.content.Intent;
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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FriendsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FriendsFragment extends Fragment {
    private ArrayList<Friends> newArrayList;
    private String[] articletitle;
    private String[] articlebody;
    private int[] articleimg;
    ActivityMainBinding binding;
    private RecyclerView recylcleview;
    private FriendsAdapter.RecyclerViewListener listener;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FriendsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FriendsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FriendsFragment newInstance(String param1, String param2) {
        FriendsFragment fragment = new FriendsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friends, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialze();
        recylcleview= view.findViewById(R.id.friends_list_view);
        recylcleview.setLayoutManager(new LinearLayoutManager(getContext()));
        recylcleview.setHasFixedSize(true);
        setOnClickListner();

        FriendsAdapter friendsAdapter=new FriendsAdapter(getContext(),newArrayList,listener);
        recylcleview.setAdapter(friendsAdapter);
        friendsAdapter.notifyDataSetChanged();
    }

    private void setOnClickListner() {
        listener=new FriendsAdapter.RecyclerViewListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent=new Intent(FriendsFragment.this.getActivity(),friendprofile.class);
                intent.putExtra("articleimage",newArrayList.get(position).getImg());
                intent.putExtra("friendname",newArrayList.get(position).getFriendname());
                v.getContext().startActivity(intent);
            }
        };
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
            Friends friends=new Friends(articletitle[i],articleimg[i]);
            newArrayList.add(friends);

        }
    }
}