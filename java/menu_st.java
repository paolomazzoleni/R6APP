package org.altervista.paolomazzoleni.rainbowsixsiegeoperators;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Objects;

public class menu_st extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_st);
        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner1);
        String[] items = new String[]{"uplay","ps4","xone"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        //set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);
    }

    public void check_search(View view) {
        EditText username = (EditText)findViewById(R.id.username);
        Spinner platform = (Spinner)findViewById(R.id.spinner1);

        if(Objects.equals(username.getText().toString(),"")){
            Context context = getApplicationContext();
            CharSequence text = "Insert username!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else{
            Intent intento = new Intent(this,menu_st_fi.class);
            intento.putExtra("username",username.getText().toString());
            intento.putExtra("platform",platform.getSelectedItem().toString());
            startActivity(intento);
        }
    }
}
