package org.altervista.paolomazzoleni.rainbowsixsiegeoperators;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class menu_sq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sq);
    }

    public void vis_op(View view) {
        String squadra_scelta = view.getTag().toString();
        switch (squadra_scelta){
            case "sq_altro":{

            };break;

            case "sq_sas":{

            };break;

            case "sq_fbiswat":{

            };break;

            case "sq_gign":{

            };break;

            case "sq_spetznaz":{

            };break;

            case "sq_gsg9":{

            };break;

            case "sq_jtf2":{

            };break;

            case "sq_navyseal":{

            };break;

            case "sq_bope":{

            };break;

            case "sq_sat":{

            };break;

            case "sq_geo":{

            };break;

            case "sq_sdu":{

            };break;

            case "sq_grom":{

            };break;

            case "sq_707th":{

            };break;
        }
    }
}
