package com.example.myproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignupFragment extends Fragment {
    EditText username,email,password,confirmpassword;
    Button signup;
    float v=0;
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
         ViewGroup root=(ViewGroup) inflater.inflate(R.layout.sign_up_fragment,container,false);
         username=root.findViewById(R.id.usernamesignup);
         email=root.findViewById(R.id.emailsignup);
         password=root.findViewById(R.id.passwordsignup);
         confirmpassword=root.findViewById(R.id.confirm_passwordsignup);
         signup=root.findViewById(R.id.signup);

         username.setTranslationY(300);
         email.setTranslationY(300);
         password.setTranslationY(300);
         confirmpassword.setTranslationY(300);
         signup.setTranslationY(300);

         username.setAlpha(v);
         email.setAlpha(v);
         password.setAlpha(v);
         confirmpassword.setAlpha(v);
         signup.setAlpha(v);

         username.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
         email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
         password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
         confirmpassword.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
         signup.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();

         return root;

     }
}
