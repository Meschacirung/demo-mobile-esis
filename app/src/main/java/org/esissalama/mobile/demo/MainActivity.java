package org.esissalama.mobile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();

        ImageView imageView = findViewById(R.id.ic_dice);

        Button button = findViewById(R.id.play_btn);
        int[] dices = {
                R.drawable.dice_1,
                R.drawable.dice_2,
                R.drawable.dice_3,
                R.drawable.dice_4,
                R.drawable.dice_5,
                R.drawable.dice_6
        };
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = random.nextInt(6);
                imageView.setImageResource(dices[i]);
            }
        });

    }
}