package com.example.myproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.MyViewHolder> {

    Context context;
    ArrayList<Articles> NewArrayList;

    public NewAdapter(Context context,ArrayList<Articles> newArrayList){

        this.context=context;
        this.NewArrayList=newArrayList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Articles articles=NewArrayList.get(position);
        holder.shapeableImageView.setImageResource(articles.img);
        holder.title.setText(articles.title);
        holder.body.setText(articles.body);
    }

    @Override
    public int getItemCount() {
        return NewArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        CircleImageView shapeableImageView;
        TextView title,body;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            shapeableImageView=itemView.findViewById(R.id.imgarticle);
            title=itemView.findViewById(R.id.titlearticle);
            body=itemView.findViewById(R.id.bodyarticle);
        }
    }
}
