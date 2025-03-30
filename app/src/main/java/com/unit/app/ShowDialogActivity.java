package com.unit.app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShowDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_show_dialog);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnDialogFragment = findViewById(R.id.btn_dialog_fragment);
        btnDialogFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // DialogDemo.show(getSupportFragmentManager(), "abc");
            }
        });
    }

    public void displayDialog(View view) {
        System.out.println("Hello I  am button");

        AlertDialog.Builder dialog = new AlertDialog.Builder(ShowDialogActivity.this);

        dialog.setTitle("Exit App?");
        dialog.setMessage("Are you sure you want to exit this app? You will lose all fo your data");
        dialog.setCancelable(false);

        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //TODO: Do whateveryoy like
                dialogInterface.dismiss();
            }
        });

        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        dialog.setNeutralButton("I don't know", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });


        dialog.create();
        dialog.show();

    }
}