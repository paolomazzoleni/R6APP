package org.altervista.paolomazzoleni.rainbowsixsiegeoperators;

import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class menu_st_fi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_st_fi);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        final TextView tv = (TextView)findViewById(R.id.url_def);
        URL url = null;
        HttpURLConnection connection;
        StringBuffer output = new StringBuffer();
        String line = null;
        BufferedReader reader = null;

        Intent intento= getIntent();
        String username = intento.getStringExtra("username");
        String platform = intento.getStringExtra("platform");

        Context context = getApplicationContext();
        CharSequence text = username+"-"+platform;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        try{
            url = new URL("https://api.r6stats.com/api/v1/players/"+username+"?platform="+platform);
        }
        catch(MalformedURLException ex){
            tv.setText("ERRORE" + ex.toString());
        }

        try {
            connection  = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            while((line = reader.readLine())!= null){
                output.append(line + "\n");
            }

            tv.setText(output.toString());
            reader.close();
        }
        catch(Exception e){
            tv.setText("ERRORE: " + e.toString());
        }
    }
}
