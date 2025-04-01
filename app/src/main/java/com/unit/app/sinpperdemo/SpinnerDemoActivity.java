package com.unit.app.sinpperdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.unit.app.R;

public class SpinnerDemoActivity extends AppCompatActivity {

    String[] foods = {"Rice", "Dal", "Tarkari",
            "Farsi", "Jerry", "Cauli",
            "Banda"};

    // int[] age = {1,235,6,7,8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner_demo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayAdapter adapter = new ArrayAdapter<String>(
                SpinnerDemoActivity.this,
                android.R.layout.simple_list_item_1,
                foods
        );
        Spinner foodSpinner = findViewById(R.id.food_spinner);
        foodSpinner.setAdapter(adapter);

        ListView foodList = findViewById(R.id.food_list);
        foodList.setAdapter(adapter);

        GridView foodGrid = findViewById(R.id.food_grid);
        foodGrid.setAdapter(adapter);


    }
}