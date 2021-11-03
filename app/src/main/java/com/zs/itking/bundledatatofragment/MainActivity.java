package com.zs.itking.bundledatatofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (EditText) findViewById(R.id.edit);
    }


    public void button(View view) {
        ArgFragment arg = ArgFragment.getInstance("data",edit.getText().toString());
        getFragmentManager().beginTransaction().replace(R.id.layout_fragment,arg).commit();
    }
}
