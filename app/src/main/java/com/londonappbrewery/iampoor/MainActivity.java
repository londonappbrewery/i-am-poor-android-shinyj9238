package com.londonappbrewery.iampoor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void coalClicked(View view){
        Toast.makeText(view.getContext(), R.string.clicked, Toast.LENGTH_SHORT).show();
    }
}
