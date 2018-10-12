package iics.david.jazmineanne.lab5_explicitimplicitintent;

import android.content.Intent;
import android.app.IntentService;
import android.support.annotation.Nullable;
import android.util.Log;


public class CustomService extends IntentService {
    public CustomService() {
        super("CustomService");
    }

    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITI","CustomService is running on the background!");
    }
}