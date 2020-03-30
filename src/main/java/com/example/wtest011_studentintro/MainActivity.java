package com.example.wtest011_studentintro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // resembles public static void main
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = findViewById(R.id.tv1);
        String str = tv1.getText().toString();

    }

    public void btnMakeItFridayClick(View view) {
        Intent intentFriday = new Intent(this,FridayActivity.class);
        startActivity(intentFriday);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Ordiliga góð koda.....
    }
}
