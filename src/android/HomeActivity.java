package com.commontime.plugin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class HomeActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent serviceIntent = new Intent(this, KioskActivity.class);
        startActivity(serviceIntent);
        finish();
    }
}