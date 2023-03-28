package com.example.edufuturedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;

public class CourseSchedule extends AppCompatActivity {
    DrawerLayout drawerSlider;
    Button preview, info_page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_schedule);
        drawerSlider=findViewById(R.id.drawer);
        info_page = ( Button) findViewById(R.id.infopage);
        info_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CourseSchedule.this, info_page.class));
            }
        });
        preview = (Button) findViewById(R.id.network_fundamentals);
        preview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CourseSchedule.this, Chose.class));
            }
        });


    }
    public  void drawer_button(View view){
        Homepage.openSlider(drawerSlider);
    }
    public void click_pp(View view){
        Homepage.closeSlider(drawerSlider);
    }
    public void click_homepage(View view){
        Intent homepage = new Intent(CourseSchedule.this,Homepage.class);
        startActivity(homepage);
    }
    public void click_myprofile(View view){
        Intent myprofile = new Intent(CourseSchedule.this,MyProfile.class);
        startActivity(myprofile);
    }
    public void click_forum(View view){
        Intent forum = new Intent(CourseSchedule.this,Forum.class);
        startActivity(forum);
    }
}