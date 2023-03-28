package com.example.edufuturedemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.edufuturedemo.databinding.ActivitySignUpScreenBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import kotlinx.coroutines.MainCoroutineDispatcher;

public class signUpScreen extends AppCompatActivity {
    private ActivitySignUpScreenBinding binding;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);
        binding = ActivitySignUpScreenBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        auth = FirebaseAuth.getInstance();

    }

    public void Homepage(View view) {
        Intent intent = new Intent(signUpScreen.this, MainActivity.class);
        startActivity(intent);
    }

    public void SignUp2(View view) {
        String email = binding.signUpMail.getText().toString();
        String sifre = binding.signUpPassword.getText().toString();


        if (email.equals("") || sifre.equals("")) {
            Toast.makeText(this, "Email or password must be filled", Toast.LENGTH_SHORT).show();

        } else {
            auth.createUserWithEmailAndPassword(email, sifre).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Toast.makeText(signUpScreen.this, "Succesful", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(signUpScreen.this, MainActivity.class);
                    startActivity(intent);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(signUpScreen.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
