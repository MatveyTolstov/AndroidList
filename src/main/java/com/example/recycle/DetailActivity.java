package com.example.recycle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String catName = intent.getStringExtra("name");
        String catCharacter = intent.getStringExtra("character");
        int catImage = intent.getIntExtra("image", R.drawable.smile);

        TextView nameTextView = findViewById(R.id.cat_name);
        TextView characterTextView = findViewById(R.id.cat_character);
        ImageView imageView = findViewById(R.id.cat_image);
        Button backButton = findViewById(R.id.back_button);

        nameTextView.setText(catName);
        characterTextView.setText(catCharacter);
        imageView.setImageResource(catImage);

        backButton.setOnClickListener(v -> finish());
    }

}
