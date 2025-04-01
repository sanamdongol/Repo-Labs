package com.unit.app.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.unit.app.R;

public class LIstDemoActivity extends AppCompatActivity {
    String[] topers = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_demo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //ListView listView = findViewById(R.id.list_view);
        GridView listView = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(LIstDemoActivity.this,
                android.R.layout.simple_list_item_1, topers);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String text = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(LIstDemoActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}