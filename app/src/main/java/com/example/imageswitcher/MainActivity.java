package com.example.imageswitcher;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageModi, imageRahul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageModi = findViewById(R.id.imageModi);
        imageRahul = findViewById(R.id.imageRahul);

        // Click Modi
        imageModi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageModi.animate().alpha(0f).setDuration(2000); // fade out 2s
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageModi.setVisibility(View.GONE);
                        imageModi.setAlpha(1f); // reset alpha
                        imageRahul.setVisibility(View.VISIBLE);
                    }
                }, 2000);
            }
        });

        // Click Rahul
        imageRahul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageRahul.animate().alpha(0f).setDuration(2000); // fade out 2s
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageRahul.setVisibility(View.GONE);
                        imageRahul.setAlpha(1f); // reset alpha
                        imageModi.setVisibility(View.VISIBLE);
                    }
                }, 2000);
            }
        });
    }
}