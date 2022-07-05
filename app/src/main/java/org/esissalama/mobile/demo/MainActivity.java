package org.esissalama.mobile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
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
        ImageView dice = (ImageView) findViewById(R.id.dice);
        View jouer = (Button) findViewById(R.id.jouer);
        jouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rand =  new Random().nextInt(6)+1;
                int imageListe[] = {
                        R.drawable.dice_1,
                        R.drawable.dice_2,
                        R.drawable.dice_3,
                        R.drawable.dice_4,
                        R.drawable.dice_5,
                        R.drawable.dice_6
                };
                int r ;
                switch (rand)
                {
                    case 1:
                        r =  imageListe[0];
                        break;
                    case 2:
                        r =  imageListe[1];
                        break;
                    case 3:
                        r =  imageListe[2];
                        break;
                    case 4:
                        r =  imageListe[3];
                        break;
                    case 5:
                        r =  imageListe[4];
                        break;
                    case 6:
                        r =  imageListe[5];
                        break;
                    default:
                        r= imageListe[1];;
                        break;
                }

                dice.setImageResource(r);

            }
        });

    }


}