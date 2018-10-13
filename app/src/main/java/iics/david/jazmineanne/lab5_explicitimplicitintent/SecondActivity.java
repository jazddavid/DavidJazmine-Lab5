package iics.david.jazmineanne.lab5_explicitimplicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button act2 = (Button) findViewById(R.id.act2);
        Button map_button2 = (Button) findViewById(R.id.map_button2);

        map_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:" + 14.6071721 + "," + 120.9808277);
                final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }
            }
        });

        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second = new Intent(getApplicationContext(),FirstActivity.class);
                startActivity(second);
            }
        });

        /*
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }

    public void showProcess(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.act2) {
            i = new Intent(this, FirstActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.map_button2) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("geo:" + 14.6071721 + "," + 120.9808277));
            chooser = Intent.createChooser(i, "Map");
            startActivity(chooser);
        }*/



    }
}




























        /*Button act2 = (Button) findViewById(R.id.act2);
        Button map_button2 = (Button) findViewById(R.id.map_button2);

        Uri gmmIntentUri = Uri.parse("geo:14.6071721,120.9808277");
        final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");

        map_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }
            }
        });

        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(second);
            }
        });*/
