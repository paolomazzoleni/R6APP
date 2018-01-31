package org.altervista.paolomazzoleni.rainbowsixsiegeoperators;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class menu_ra_ad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ra_ad);

        final TextView op = (TextView)findViewById(R.id.op);
        final TextView pw = (TextView)findViewById(R.id.pr_we);
        final TextView sw = (TextView)findViewById(R.id.se_we);
        final TextView ga = (TextView)findViewById(R.id.ga);
        final ImageView im = (ImageView)findViewById(R.id.icon_ra_ad);
        final ImageView im_pw = (ImageView)findViewById(R.id.im_pw);
        final ImageView im_sw = (ImageView)findViewById(R.id.im_sw);

        String s = getIntent().getStringExtra("a_d");
        String[] array = getResources().getStringArray(R.array.ops);
        Random r = new Random();
        int caso;

        if(s.equals("a")){
            caso = r.nextInt(18);
        }
        else{
            caso = r.nextInt(18)+18;
        }

        //preparo variabili per contenere prodotto finale
        String f_pw = "",f_sw = "",f_ga = "";
        //setto a lower case il nome dell'operatore per poter prendere successivamente l'immagine
        String f_op = array[caso].toLowerCase();
        //ottengo l'identificatore alla risorsa
        int path = getResources().getIdentifier(f_op,"array","org.altervista.paolomazzoleni.rainbowsixsiegeoperators");
        //ottengo l'array con le caratteristiche dell'operatore
        String[] operatore = getResources().getStringArray(path);

        //random arma primaria
        int n = Integer.parseInt(operatore[0]);
        if(n==1)
            f_pw = operatore[1];
        else{
            caso = r.nextInt(100);
            if(n==2){
                if(caso<50)
                    f_pw = operatore[1];
                else
                    f_pw = operatore[2];
            }
            else{
                if(caso>=0&&caso<33)
                    f_pw = operatore[1];
                else if (caso>=33&&caso<66)
                    f_pw = operatore[2];
                else
                    f_pw = operatore[3];
            }
        }

        //random arma secondaria
        n = Integer.parseInt(operatore[4]);
        if(n==1)
            f_sw = operatore[5];
        else{
            caso = r.nextInt(100);
            if(n==2){
                if(caso<50)
                    f_sw = operatore[5];
                else
                    f_sw = operatore[6];
            }
        }

        //random gadget
        n = Integer.parseInt(operatore[7]);
        if(n==1)
            f_ga = operatore[8];
        else{
            caso = r.nextInt(100);
            if(n==2){
                if(caso<50)
                    f_ga = operatore[8];
                else
                    f_ga = operatore[9];
            }
        }

        //stampo i risultati
        op.setText(f_op.toUpperCase());
        pw.setText(f_pw);
        sw.setText(f_sw);
        ga.setText(f_ga);

        //IMMAGINE operatore
        path = getResources().getIdentifier(f_op,"drawable","org.altervista.paolomazzoleni.rainbowsixsiegeoperators");
        im.setImageResource(path);

        //IMMAGINE arma primaria
        String f_im_pw = "";
        switch (f_pw){
            case "G36C":{f_im_pw = "pw_g36c";}break;
            case "R4-C":{f_im_pw = "pw_r4c";}break;
            case "Mk17 CQB":{f_im_pw = "pw_def";}break;
            case "SR-25":{f_im_pw = "pw_def";}break;
            case "Flash Shield":{f_im_pw = "pw_flashshield";}break;
            case "C8-SFW":{f_im_pw = "pw_def";}break;
            case "CAMRS":{f_im_pw = "pw_def";}break;
            case "PARA-308":{f_im_pw = "pw_def";}break;
            case "M249":{f_im_pw = "pw_def";}break;
            case "Mk 14 EBR":{f_im_pw = "pw_def";}break;
            case "BOSG.12.2":{f_im_pw = "pw_def";}break;
            case "Balistic Shield":{f_im_pw = "pw_balisticshield";}break;
            case "6P41":{f_im_pw = "pw_6p1";}break;
            case "AK-12":{f_im_pw = "pw_ak12";}break;
            case "OTs-03":{f_im_pw = "pw_ots03";}break;
            case "Type-89":{f_im_pw = "pw_def";}break;
            case "SuperNova":{f_im_pw = "pw_def";}break;
            case "AUG A2":{f_im_pw = "pw_auga2";}break;
            case "552 Commando":{f_im_pw = "pw_552commando";}break;
            case "G8A1":{f_im_pw = "pw_g8a1";}break;
            case "C7E":{f_im_pw = "pw_def";}break;
            case "PDW9":{f_im_pw = "pw_def";}break;
            case "ITA12L":{f_im_pw = "pw_def";}break;
            case "Extendable Shield":{f_im_pw = "pw_extendableshield";};break;
            case "M590A1":{f_im_pw = "pw_m590a1";}break;
            case "L85A2":{ f_im_pw = "pw_l85a2";}break;
            case "AR33":{f_im_pw = "pw_ar33";}break;
            case "M1014":{f_im_pw = "pw_m1014";}break;
            case "556xi":{f_im_pw = "pw_556xi";}break;
            case "417":{f_im_pw = "pw_417";}break;
            case "SG-CQB":{f_im_pw = "pw_sgcqb";}break;
            case "F2":{f_im_pw = "pw_f2";}break;
            case "T-95 LSW":{f_im_pw = "pw_def";}break;
            case "SIX12 SD":{f_im_pw = "pw_def";}break;
            case "MP7":{f_im_pw = "pw_mp7";}break;
            case "M870":{f_im_pw = "pw_m870";}break;
            case "UMP45":{f_im_pw = "pw_ump45";}break;
            case "M12":{f_im_pw = "pw_def";}break;
            case "SPAS-15":{f_im_pw = "pw_def";}break;
            case "MP5":{f_im_pw = "pw_mp5";}break;
            case "P90":{f_im_pw = "pw_p90";}break;
            case "MP5SD":{f_im_pw = "pw_def";}break;
            case "Scorpion EVO 3 A1":{f_im_pw = "pw_def";}break;
            case "FO-12":{f_im_pw = "pw_def";}break;
            case "Super 90":{f_im_pw = "pw_def";}break;
            case "9mm C1":{f_im_pw = "pw_def";}break;
            case "9x19VSN":{f_im_pw = "pw_9x19vsn";}break;
            case "SASG-12":{f_im_pw = "pw_sasg12";}break;
            case "T-5 SMG":{f_im_pw = "pw_def";}break;
            case "Vector .45 ACP":{f_im_pw = "pw_def";}break;
            case "MP5K":{f_im_pw = "pw_mp5k";}break;
            case "FMG-9":{f_im_pw = "pw_fmg9";}break;
            case "MPX":{f_im_pw = "pw_def";}break;
            case "SPAS-12":{f_im_pw = "pw_def";}break;
            case "416-C CARABINE":{f_im_pw = "pw_416ccarbine";}break;
            case "M762":{f_im_pw = "pw_def";}break;
            case "LMG-E":{f_im_pw = "pw_def";}break;
            case "K1A":{f_im_pw = "pw_def";}break;
            default:{f_im_pw = "pw_dim";}break;
        }
        path = getResources().getIdentifier(f_im_pw,"drawable","org.altervista.paolomazzoleni.rainbowsixsiegeoperators");
        im_pw.setImageResource(path);

        //IMMAGINE arma secondaria
        String f_im_sw = "";
        switch (f_sw){
            case "M45 MEUSOC":{f_im_sw = "sw_m45meusoc";}break;
            case "5.7 USG":{f_im_sw = "sw_57usg";}break;
            case "D-50":{f_im_sw = "pw_def";}break;
            case "P12":{f_im_sw = "sw_p12";}break;
            case "Mk1 9mm":{f_im_sw = "pw_def";}break;
            case "PRB92":{f_im_sw = "pw_def";}break;
            case "C75 Auto":{f_im_sw = "pw_def";}break;
            case "SMG-12":{f_im_sw = "pw_def";}break;
            case "PMM":{f_im_sw = "sw_pmm";}break;
            case "GSh-18":{f_im_sw = "sw_gsh18";}break;
            case "P229":{f_im_sw = "pw_def";}break;
            case "Bearing 9":{f_im_sw = "pw_def";}break;
            case "ITA12S":{f_im_sw = "pw_def";}break;
            case "USP40":{f_im_sw = "pw_def";}break;
            case "P9":{f_im_sw = "sw_p9";}break;
            case "LFP586":{f_im_sw = "sw_lfp586";}break;
            case "P226 Mk25":{f_im_sw = "sw_p226mk25";}break;
            case "SMG-11":{f_im_sw = "sw_smg11";}break;
            case "Q-929":{f_im_sw = "pw_def";}break;
            case "Luison":{f_im_sw = "pw_def";}break;
            case "RG15":{f_im_sw = "pw_def";}break;
            default:{f_im_sw = "pw_dim";}break;
        }
        path = getResources().getIdentifier(f_im_sw,"drawable","org.altervista.paolomazzoleni.rainbowsixsiegeoperators");
        im_sw.setImageResource(path);
    }
}
