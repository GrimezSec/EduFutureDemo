package com.example.edufuturedemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MyProfile extends AppCompatActivity {
    DrawerLayout drawerSlider;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        drawerSlider=findViewById(R.id.drawer);
    }
    public  void drawer_button(View view){
        Homepage.openSlider(drawerSlider);
    }
    public void click_pp(View view){
        Homepage.closeSlider(drawerSlider);
    }
    public void click_homepage(View view){
        Intent homepage = new Intent(MyProfile.this,Homepage.class);
        startActivity(homepage);
    }
    public void click_schedule (View view){
        Intent schedule = new Intent(MyProfile.this,CourseSchedule.class);
        startActivity(schedule);
    }
    public void click_forum(View view){
        Intent forum = new Intent(MyProfile.this,Forum.class);
        startActivity(forum);
    }
}