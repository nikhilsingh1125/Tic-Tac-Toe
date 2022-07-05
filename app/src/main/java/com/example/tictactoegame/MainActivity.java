package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;

    int count = 0;
    int flag = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
    }


    public void click(View view) {

        ImageView iv = (ImageView) view;


        if (iv.getTag().toString().equals("0")) {
            count++;

            if (flag == 0) {
                iv.setImageResource(R.drawable.ironman);
                iv.setTag("IronMan");
                flag = 1;
            } else {
                iv.setImageResource(R.drawable.captainamerica);
                iv.setTag("CaptainAmerica");
                flag = 0;
            }


            iv.animate().alpha(1).setDuration(500);


            if (count > 4) {

                b1 = img1.getTag().toString();
                b2 = img2.getTag().toString();
                b3 = img3.getTag().toString();
                b4 = img4.getTag().toString();
                b5 = img5.getTag().toString();
                b6 = img6.getTag().toString();
                b7 = img7.getTag().toString();
                b8 = img8.getTag().toString();
                b9 = img9.getTag().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b3.equals("0")) {
                    newGame(b1, false);
                } else if (b4.equals(b5) && b5.equals(b6) && !b6.equals("0")) {
                    newGame(b4, false);
                } else if (b7.equals(b8) && b8.equals(b9) && !b9.equals("0")) {
                    newGame(b7, false);
                } else if (b1.equals(b4) && b4.equals(b7) && !b7.equals("0")) {
                    newGame(b1, false);
                } else if (b2.equals(b5) && b5.equals(b8) && !b8.equals("0")) {
                    newGame(b2, false);
                } else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("0")) {
                    newGame(b3, false);
                } else if (b1.equals(b5) && b5.equals(b9) && !b9.equals("0")) {
                    newGame(b1, false);
                } else if (b3.equals(b5) && b5.equals(b7) && !b7.equals("0")) {
                    newGame(b3, false);
                } else if (count == 9) {
                    newGame("", true);
                }


            }
        }


    }

    public void newGame(String winner, boolean isDraw) {

        String toastMsg ="";

        if (isDraw) {
            toastMsg = "Match is Draw.";

        } else {
            toastMsg = "Winner is: "+winner;

        }

        Toast.makeText(this,toastMsg,Toast.LENGTH_LONG).show();

        img1.setTag("0");
        img1.setImageResource(0);
        img2.setTag("0");
        img2.setImageResource(0);
        img3.setTag("0");
        img3.setImageResource(0);
        img4.setTag("0");
        img4.setImageResource(0);
        img5.setTag("0");
        img5.setImageResource(0);
        img6.setTag("0");
        img6.setImageResource(0);
        img7.setTag("0");
        img7.setImageResource(0);
        img8.setTag("0");
        img8.setImageResource(0);
        img9.setTag("0");
        img9.setImageResource(0);

        count = 0;


    }

    }
