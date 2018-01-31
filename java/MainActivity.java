package org.altervista.paolomazzoleni.rainbowsixsiegeoperators;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //come creare una notifica
        /*NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this).setSmallIcon(R.drawable.ash).setContentTitle("My notification").setContentText("Hello World!");
        NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(1,mBuilder.build());*/
    }

    public void vis_sq(View view) {
        Intent intento = new Intent(this,menu_sq.class);
        startActivity(intento);
    }

    public void op_rand(View view) {
        Intent intento = new Intent(this,menu_ra.class);
        startActivity(intento);
    }

    public void r6_stats(View view) {
        Intent intento = new Intent(this,menu_st.class);
        startActivity(intento);
    }
}
