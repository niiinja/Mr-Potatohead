// mr Potato Head - Unit1
// Minor Programmeren
// Nina Boelsums, 10742670


package com.example.s156543.unit1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        String box = checkbox.getText().toString();

        // makes images visible when their boxes are checked
        if (checkbox.isChecked()) {

            if (box.equals("arms")) {
                ImageView image = findViewById(R.id.arms);
                image.setVisibility(View.VISIBLE);
            } else if (box.equals("body")) {
                ImageView image = findViewById(R.id.body);
                image.setVisibility(View.VISIBLE);
            } else if (box.equals("ears")) {
                ImageView image = findViewById(R.id.ears);
                image.setVisibility(View.VISIBLE);
            } else if (box.equals("eyebrows")) {
                ImageView image = findViewById(R.id.eyebrows);
                image.setVisibility(View.VISIBLE);
            } else if (box.equals("eyes")) {
                ImageView image = findViewById(R.id.eyes);
                image.setVisibility(View.VISIBLE);
            } else if (box.equals("glasses")) {
                ImageView image = findViewById(R.id.glasses);
                image.setVisibility(View.VISIBLE);
            } else if (box.equals("hat")) {
                ImageView image = findViewById(R.id.hat);
                image.setVisibility(View.VISIBLE);
            } else if (box.equals("mouth")) {
                ImageView image = findViewById(R.id.mouth);
                image.setVisibility(View.VISIBLE);
            } else if (box.equals("mustache")) {
                ImageView image = findViewById(R.id.mustache);
                image.setVisibility(View.VISIBLE);
            } else if (box.equals("nose")) {
                ImageView image = findViewById(R.id.nose);
                image.setVisibility(View.VISIBLE);
            } else if (box.equals("shoes")) {
                ImageView image = findViewById(R.id.shoes);
                image.setVisibility(View.VISIBLE);
            }


        } else {

            // makes images invisible when their boxes are unchecked
            if (box.equals("arms")) {
                ImageView image = findViewById(R.id.arms);
                image.setVisibility(View.INVISIBLE);

            } else if (box.equals("body")) {
                ImageView image = findViewById(R.id.body);
                image.setVisibility(View.INVISIBLE);

            } else if (box.equals("ears")) {
                ImageView image = findViewById(R.id.ears);
                image.setVisibility(View.INVISIBLE);

            } else if (box.equals("eyebrows")) {
                ImageView image = findViewById(R.id.eyebrows);
                image.setVisibility(View.INVISIBLE);

            } else if (box.equals("eyes")) {
                ImageView image = findViewById(R.id.eyes);
                image.setVisibility(View.INVISIBLE);

            } else if (box.equals("glasses")) {
                ImageView image = findViewById(R.id.glasses);
                image.setVisibility(View.INVISIBLE);

            } else if (box.equals("hat")) {
                ImageView image = findViewById(R.id.hat);
                image.setVisibility(View.INVISIBLE);

            } else if (box.equals("mouth")) {
                ImageView image = findViewById(R.id.mouth);
                image.setVisibility(View.INVISIBLE);

            } else if (box.equals("mustache")) {
                ImageView image = findViewById(R.id.mustache);
                image.setVisibility(View.INVISIBLE);

            } else if (box.equals("nose")) {
                ImageView image = findViewById(R.id.nose);
                image.setVisibility(View.INVISIBLE);

            } else if (box.equals("shoes")) {
                ImageView image = findViewById(R.id.shoes);
                image.setVisibility(View.INVISIBLE);

            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // restores visibility values after restoration
    public void onRestoreInstanceState(Bundle inState) {
        findViewById(R.id.body).setVisibility(inState.getInt("body"));
        findViewById(R.id.arms).setVisibility(inState.getInt("arms"));
        findViewById(R.id.ears).setVisibility(inState.getInt("ears"));
        findViewById(R.id.eyes).setVisibility(inState.getInt("eyes"));
        findViewById(R.id.eyebrows).setVisibility(inState.getInt("eyebrows"));
        findViewById(R.id.mouth).setVisibility(inState.getInt("mouth"));
        findViewById(R.id.mustache).setVisibility(inState.getInt("mustache"));
        findViewById(R.id.nose).setVisibility(inState.getInt("nose"));
        findViewById(R.id.shoes).setVisibility(inState.getInt("shoes"));
    }

    // saves visibility state
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super
        outState.putInt("body", findViewById(R.id.body).getVisibility());
        outState.putInt("arms", findViewById(R.id.arms).getVisibility());
        outState.putInt("ears", findViewById(R.id.ears).getVisibility());
        outState.putInt("eyes", findViewById(R.id.eyes).getVisibility());
        outState.putInt("eyebrows", findViewById(R.id.eyebrows).getVisibility());
        outState.putInt("glasses", findViewById(R.id.glasses).getVisibility());
        outState.putInt("mouth", findViewById(R.id.mouth).getVisibility());
        outState.putInt("mustache", findViewById(R.id.mustache).getVisibility());
        outState.putInt("nose", findViewById(R.id.nose).getVisibility());
        outState.putInt("shoes", findViewById(R.id.shoes).getVisibility());
    }
}