package com.crash.kevin.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.crash.kevin.R;


public class MainActivity extends BaseActivity {

    public static final String PREF_FIRST_USE = "first_use";
    public static final String PREF_SECOND_USE = "first_use";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        if (sp.getBoolean(PREF_FIRST_USE, true)) {
            openWelcomeScreen();
        } else if (sp.getBoolean(PREF_SECOND_USE, true)) {

        }

    }
    private void openWelcomeScreen() {
        startActivity(new Intent(this, WelcomeActivity.class));
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
