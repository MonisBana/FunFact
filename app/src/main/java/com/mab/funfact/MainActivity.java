package com.mab.funfact;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout mRelativeLayout;
    private Button mNextBtn;
    private TextView mFact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        final String[] mColors = {

                "#39add1", // light blue

                "#3079ab", // dark blue

                "#c25975", // mauve

                "#e15258", // red

                "#f9845b", // orange

                "#838cc7", // lavender

                "#7d669e", // purple

                "#53bbb4", // aqua

                "#51b46d", // green

                "#e0ab18", // mustard

                "#637a91", // dark gray

                "#f092b0", // pink

                "#b7c0c7"  // light gray

        };
        final String[] mFacts = {

                "Ants stretch when they wake up in the morning.",

                "Ostriches can run faster than horses.",

                "Olympic gold medals are actually made mostly of silver.",

                "You are born with 300 bones; by the time you are an adult you will have 206.",

                "It takes about 8 minutes for light from the Sun to reach Earth.",

                "Some bamboo plants can grow almost a meter in just one day.",

                "The state of Florida is bigger than England.",

                "Some penguins can leap 2-3 meters out of the water.",

                "On average, it takes 66 days to form a new habit.",

                "Mammoths still walked the earth when the Great Pyramid was being built.",

                "A group of crows is called a murder." };
        mRelativeLayout = findViewById(R.id.realativeLayout);
        mNextBtn = findViewById(R.id.newFact);
        mFact = findViewById(R.id.fact);

        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int randomNo = r.nextInt(mFacts.length);
                int color = Color.parseColor(mColors[randomNo]);
                String fact = mFacts[randomNo];
                mFact.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mNextBtn.setTextColor(color);
            }
        });

    }
}
