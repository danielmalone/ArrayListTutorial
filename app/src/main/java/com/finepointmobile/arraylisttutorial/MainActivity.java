package com.finepointmobile.arraylisttutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        people = new ArrayList<>();

        people.add("Daniel");
        people.add("Melody");
        people.add("Bob");
        people.add("Scott");

        for (int i = 0; i < people.size(); i++) {
            Log.d("asdf", "onCreate: name: " + people.get(i));
        }
    }
}
