package com.firstopenglproject.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class FirstOpenGLProjectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_open_glproject);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_open_glproject, menu);
        return true;
    }
}
