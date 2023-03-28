package com.example.edufuturedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.firebase.auth.FirebaseAuth;
public class Homepage extends AppCompatActivity {

    DrawerLayout drawerSlider;
    Button sliderlogout;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        drawerSlider=findViewById(R.id.drawer);
    }
    public  void drawer_button(View view){
        openSlider(drawerSlider);
    }

    public static void openSlider(DrawerLayout drawerSlider) {
        drawerSlider.openDrawer(GravityCompat.START);
    }
    public void click_pp(View view){
        closeSlider(drawerSlider);
    }

    public static void closeSlider(DrawerLayout drawerSlider) {
        if(drawerSlider.isDrawerOpen(GravityCompat.START)){
            drawerSlider.closeDrawer(GravityCompat.START);
        }
    }
    public void click_homepage(View view){
        recreate();
    }
    public void click_schedule (View view){
        Intent schedule = new Intent(Homepage.this,CourseSchedule.class);
        startActivity(schedule);
    }
    public void click_myprofile(View view){
        Intent myprofile = new Intent(Homepage.this,MyProfile.class);
        startActivity(myprofile);
    }
    public void click_forum(View view){
        Intent forum = new Intent(Homepage.this,Forum.class);
        startActivity(forum);
    }
}