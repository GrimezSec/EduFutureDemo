package com.example.edufuturedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;


public class info_page extends AppCompatActivity {
    DrawerLayout drawerSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);

        drawerSlider=findViewById(R.id.drawer);
    }
    public  void drawer_button(View view){
        Homepage.openSlider(drawerSlider);
    }
    public void click_pp(View view){
        Homepage.closeSlider(drawerSlider);
    }

    public void click_homepage(View view){
        Intent homepage = new Intent(info_page.this,Homepage.class);
        startActivity(homepage);
    }
    public void click_myprofile(View view){
        Intent myprofile = new Intent(info_page.this,MyProfile.class);
        startActivity(myprofile);
    }
    public void click_forum(View view){
        Intent forum = new Intent(info_page.this,Forum.class);
        startActivity(forum);
    }
    public void click_schedule (View view){
        Intent schedule = new Intent(info_page.this,CourseSchedule.class);
        startActivity(schedule);
    }
}