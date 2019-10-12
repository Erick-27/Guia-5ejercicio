package com.example.guia5ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {

            case R.id.btnlogin:
            {
                Intent hola = new Intent(this, login.class);
                startActivity(hola);
                break;
            }


            case R.id.btncalculadora:
            {
                Intent hola = new Intent(this, calculadora.class);
                startActivity(hola);
                break;
            }

            case R.id.btnconversation:
            {
                Intent hola = new Intent(this, conversation.class);
                startActivity(hola);
                break;
            }

        }
    }
}
