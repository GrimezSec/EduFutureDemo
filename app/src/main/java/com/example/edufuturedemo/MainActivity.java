package com.example.edufuturedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.edufuturedemo.databinding.ActivityMainBinding;
import com.example.edufuturedemo.databinding.ActivitySignUpScreenBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.auth.User;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        FirebaseUser kullanici = auth.getCurrentUser();

        if(kullanici != null){
            Intent intent = new Intent(MainActivity.this, Flow.class);
            startActivity(intent);

        }
    }
    public void login(View view) {
        String email = binding.LoginMail.getText().toString();
        String sifre = binding.LoginPassword.getText().toString();

        if (email.equals("") || sifre.equals("")) {
            Toast.makeText(this, "Email or password required", Toast.LENGTH_LONG).show();


        } else {
            auth.signInWithEmailAndPassword(email, sifre).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent intent = new Intent(MainActivity.this, Flow.class);
                    startActivity(intent);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
    public void signUp (View view){
        Intent intent = new Intent(MainActivity.this, signUpScreen.class);
        startActivity(intent);
    }

}