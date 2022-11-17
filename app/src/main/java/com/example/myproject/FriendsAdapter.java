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

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.MyViewHolder> {

    Context context;
    ArrayList<Friends> NewArrayList;
    RecyclerViewListener listener;

    public FriendsAdapter(Context context, ArrayList<Friends> newArrayList, FriendsAdapter.RecyclerViewListener listener){

        this.context=context;
        this.NewArrayList=newArrayList;
        this.listener=listener;

    }
    @NonNull
    @Override
    public FriendsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.friends_list_item,parent,false);
        return new FriendsAdapter.MyViewHolder(v,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsAdapter.MyViewHolder holder, int position) {
        Friends friends=NewArrayList.get(position);
        holder.shapeableImageView.setImageResource(friends.img);
        holder.friendname.setText(friends.friendname);
    }



    @Override
    public int getItemCount() {
        return NewArrayList.size();
    }
    public interface RecyclerViewListener {
        void onClick(View v,int position);
    }
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        CircleImageView shapeableImageView;
        TextView friendname;


        public MyViewHolder(@NonNull View itemView, FriendsAdapter.RecyclerViewListener listener) {
            super(itemView);
            shapeableImageView=itemView.findViewById(R.id.friendimg);
            friendname=itemView.findViewById(R.id.friendname);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            listener.onClick(v,getAdapterPosition());
        }
    }
}
