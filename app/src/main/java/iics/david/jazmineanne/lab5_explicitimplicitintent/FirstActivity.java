package iics.david.jazmineanne.lab5_explicitimplicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button act1 = (Button) findViewById(R.id.act1);
        Button map_button1 = (Button) findViewById(R.id.map_button1);

        Uri gmmIntentUri = Uri.parse("geo:14.5796775,120.9818597");
        final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");

        map_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }
            }
        });

        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(first);
            }
        });
/*
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }
    public void showProcess(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.act1) {
            i = new Intent(this, SecondActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.map_button1) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("geo:" + 14.5796775 + "," + 120.9818597));
            chooser = Intent.createChooser(i, "Map");
            startActivity(chooser);
        }*/

    }
}



















     /*
        Button act1 = (Button) findViewById(R.id.act1);
        Button map_button1 = (Button) findViewById(R.id.map_button1);

        Uri gmmIntentUri = Uri.parse("geo:14.5796775,120.9818597");
        final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");

        map_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }
            }
        });

        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first = new Intent(getApplicationContext(),FirstActivity.class);
                startActivity(first);
            }
        });*/



