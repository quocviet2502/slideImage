package com.example.nextprevimage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.activity.result.ActivityResultLauncher;


import android.content.Intent;

import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper viewFlipper;
    Button next;
    Button previous;
    private static final int REQUEST_CODE = 22;
    Button btnpicture;
    ImageView imageView;
    ActivityResultLauncher<Intent> activityResultLauncher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = findViewById(R.id.viewFlipper);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == next) {
            viewFlipper.showNext();
        }
        else if (v == previous) {
            viewFlipper.showPrevious();
        }
    }
}