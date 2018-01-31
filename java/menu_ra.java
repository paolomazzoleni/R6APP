package org.altervista.paolomazzoleni.rainbowsixsiegeoperators;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class menu_ra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ra);
    }

    public void att_ran(View view) {
        Intent intento = new Intent(this,menu_ra_ad.class);
        intento.putExtra("a_d","a");
        startActivity(intento);
    }

    public void def_ran(View view) {
        Intent intento = new Intent(this,menu_ra_ad.class);
        intento.putExtra("a_d","d");
        startActivity(intento);
    }
}
