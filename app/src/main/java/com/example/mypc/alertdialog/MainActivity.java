package com.example.mypc.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btn;
    AlertDialog.Builder ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ab = new AlertDialog.Builder(MainActivity.this);
                ab.setTitle("Data");
                ab.setMessage("Do you want to continue?");
                ab.setIcon(R.mipmap.ic_launcher);
                ab.setCancelable(false);

                ab.setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(MainActivity.this,"Yes",Toast.LENGTH_SHORT).show();
                    }
                });

                ab.setNegativeButton("No", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.dismiss();
                    }
                });

                ab.show();
            }
        });
    }
}
