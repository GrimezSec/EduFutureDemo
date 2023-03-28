package com.example.edufuturedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Chose extends AppCompatActivity {

    Button video, enter, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose);

        enter = (Button) findViewById(R.id.enter_quiz);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Chose.this, quiz.class));
            }
        });

        back = (Button) findViewById(R.id.go_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Chose.this, CourseSchedule.class));
            }
        });

        video = (Button) findViewById(R.id.video_play);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoplay = new Intent(getApplicationContext(), preview.class);
                startActivity(videoplay);
            }
        });

    }
}
