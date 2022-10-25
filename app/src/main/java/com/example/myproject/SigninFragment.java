package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SigninFragment extends Fragment {
    EditText email,password;
    Button login;
    TextView forgetpw;
    float v=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root=(ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);

        email=root.findViewById(R.id.email);
        password=root.findViewById(R.id.password);
        login=root.findViewById(R.id.Loginbtn);
        forgetpw=root.findViewById(R.id.forgetpw);

        email.setTranslationY(300);
        password.setTranslationY(300);
        login.setTranslationY(300);
        forgetpw.setTranslationY(300);

        email.setAlpha(v);
        password.setAlpha(v);
        login.setAlpha(v);
        forgetpw.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgetpw.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SigninFragment.this.getActivity(), MainActivity.class));
            }
        });

        return root;

    }
}
