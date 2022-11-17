package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        ImageView img=findViewById(R.id.imageView);
        TextView title=findViewById(R.id.articlehead);
        TextView body=findViewById(R.id.articlebody);

        String title1="not set yet";
        String body1="not set yet";

        Bundle extras=getIntent().getExtras();
        if(extras!= null){
            title1=extras.getString("articletitle");
            body1=extras.getString("articlebody");


        }
        title.setText(title1);
        body.setText(body1);
    }
}