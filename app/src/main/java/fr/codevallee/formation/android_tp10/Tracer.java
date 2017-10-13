package fr.codevallee.formation.android_tp10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by tgoudouneix on 12/10/2017.
 */

public abstract class Tracer extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Info", this.getClass().toString() + " onCreate()");
    }

    protected void onStart() {
        super.onStart();
        Log.d("Info", this.getClass().toString() + " onStart()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("Info", this.getClass().toString() + " onRestart()");
    }

    protected void onResume() {
        super.onResume();
        Log.d("Info", this.getClass().toString() + " onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.d("Info", this.getClass().toString() + " onPause()");
    }

    protected void onStop() {
        super.onStop();
        Log.d("Info", this.getClass().toString() + " onStop()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("Info", this.getClass().toString() + " onDestroy()");
    }
}