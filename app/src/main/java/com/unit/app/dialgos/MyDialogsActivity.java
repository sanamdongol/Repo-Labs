package com.unit.app.dialgos;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.unit.app.FoodListener;
import com.unit.app.R;

public class MyDialogsActivity extends AppCompatActivity implements FoodListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_dialogs);

        Button btn = findViewById(R.id.btn_show_dialog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MyDialogsActivity.this);
                builder.setTitle("I am title");
                builder.setMessage("This is the dialog messagew");
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //TODO: Write your negative logic here
                        dialogInterface.dismiss();
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //TODO: Write logic here
                        finish();
                    }
                });
                builder.create();
                builder.show();
            }
        });
    }

    @Override
    public void cookFood() {

    }

    @Override
    public int serverFood() {
        return 0;
    }

    @Override
    public void fryFood() {

    }
}