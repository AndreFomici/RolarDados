package com.example.rolardados;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    private ImageView roll;
    private ImageView roll2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll = findViewById(R.id.dado);
        roll2 = findViewById(R.id.dado1);
    }
    public void button (View v){
        int numero = random.nextInt(6) + 1;
        int numero1 = random.nextInt(6) + 1;
        if (numero == 1){
            roll.setImageResource(R.drawable.dado1);
        }
        else if (numero == 2){
            roll.setImageResource(R.drawable.dado2);
        }
        else if (numero == 3){
            roll.setImageResource(R.drawable.dado3);
        }
        else if (numero == 4){
            roll.setImageResource(R.drawable.dado4);
        }
        else if (numero == 5){
            roll.setImageResource(R.drawable.dado5);
        }
        else if (numero == 6){
            roll.setImageResource(R.drawable.dado6);
        }
        if (numero1 == 1){
            roll2.setImageResource(R.drawable.dado1);
        }
        else if (numero1 == 2){
            roll2.setImageResource(R.drawable.dado2);
        }
        else if (numero1 == 3){
            roll2.setImageResource(R.drawable.dado3);
        }
        else if (numero1 == 4){
            roll2.setImageResource(R.drawable.dado4);
        }
        else if (numero1 == 5){
            roll2.setImageResource(R.drawable.dado5);
        }
        else if (numero1 == 6){
            roll2.setImageResource(R.drawable.dado6);
        }
    }
}
