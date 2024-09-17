package com.example.recycle;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Cat> cats = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list);

        CatAdapter catAdapter = new CatAdapter(this, cats);

        recyclerView.setAdapter(catAdapter);
        }
    private void setInitialData(){
            cats.add(new Cat("Milya", "Cute", R.drawable.pretty));
            cats.add(new Cat("Sonaya", "Tired", R.drawable.why_i_wake_up));
            cats.add(new Cat("Smilevoya", "Joyful", R.drawable.smile));
        }
    }

