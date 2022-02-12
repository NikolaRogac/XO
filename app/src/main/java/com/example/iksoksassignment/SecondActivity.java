package com.example.iksoksassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    TextView aboutgame1;
    TextView aboutgame2;
    TextView aboutgame3;
    TextView aboutgame4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        aboutgame1 = (TextView) findViewById(R.id.tvaboutgame1);
        aboutgame2 = (TextView) findViewById(R.id.tvaboutgame2);
        aboutgame3 = (TextView) findViewById(R.id.tvaboutgame3);
        aboutgame4 = (TextView) findViewById(R.id.tvaboutgame4);
    }
}
