package com.zs.itking.bundledatatofragment;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText edit;

    private String mTitle;

    public String getData() {
        return mTitle;
    }

    public void setData(String title) {
        this.mTitle = title;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (EditText) findViewById(R.id.edit);
    }

    public void button(View view) {
        //点击加载ArgFragment到FrameLayout碎片布局中，并使用单例模式来把输入框输入，传到Fragment中
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_fragment, ArgFragment.getInstance("data", edit.getText().toString())).commit();
    }
}
