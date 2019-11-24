package com.blueradix.android.jetpack_2_livedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blueradix.android.jetpack_2_livedata.ui.main.MainFragment;
import com.blueradix.android.jetpack_2_livedata.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}
