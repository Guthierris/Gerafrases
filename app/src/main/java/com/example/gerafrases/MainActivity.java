package com.example.gerafrases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void geraFrases (View v){
        String vetFrases[] = {"Com grandes poderes vem grandes responsabilidades.",
                "Você não vai ser hackeado por gringos se utilizar (ç) nas senhas.",
                "Passe para frente tudo aquilo que você aprendeu.",
                "Para todo game over existe um play again.",
                "Aquilo que não me mata me da XP.",
                "I Am Groot."
        };

        int numero = new Random().nextInt(6);
        TextView texto = findViewById(R.id.gerador);
        texto.setText(vetFrases[numero]);
    }

}