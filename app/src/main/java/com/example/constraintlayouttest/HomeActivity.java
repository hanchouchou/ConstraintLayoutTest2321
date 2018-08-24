package com.example.constraintlayouttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(HomeActivity.this, Main2Activity.class));
                break;
            case R.id.button5:
                startActivity(new Intent(HomeActivity.this, Main3Activity.class));
                break;
            case R.id.button6:
                startActivity(new Intent(HomeActivity.this, Main4Activity.class));
                break;
        }
    }
}
