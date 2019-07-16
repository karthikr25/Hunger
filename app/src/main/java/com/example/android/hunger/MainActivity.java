package com.example.android.hunger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void afterEating(View view )
    {
        displayImage();
      display();
    }

    public void display()
    {
        TextView objTextView = findViewById(R.id.hunger_view);
        objTextView.setText("I'm so full");
    }

    public void displayImage()
    {
        ImageView objImageView = findViewById(R.id.cookie);
        objImageView.setImageResource(R.drawable.after_cookie);
    }
}
