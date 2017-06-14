package com.example.admin.tp10android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    TextView pile1;
    TextView pile2;
    TextView pile3;
    TextView pile4;
    TextView resultatView;
    int numpile = 1;
    String resultatafficher;
    Stack pilestack = new Stack();
    int istack = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pile1 = (TextView) findViewById(R.id.textViewDepot1);
        pile2 = (TextView) findViewById(R.id.textViewDepot2);
        pile3 = (TextView) findViewById(R.id.textViewDepot3);
        pile4 = (TextView) findViewById(R.id.textViewDepot4);
        resultatView = (TextView) findViewById(R.id.textViewResultat);
    }


    @Override
    protected void onRestoreInstanceState(Bundle output) {
        super.onCreate(output);

    }


    // bouton chiffre
    public void clickbouton1(View view) {
        resultatafficher = resultatView.getText().toString();
        resultatafficher += "1";
        resultatView.setText(resultatafficher);
    }

    public void clickbouton2(View view) {
        resultatafficher = resultatView.getText().toString();
        resultatafficher += "2";
        resultatView.setText(resultatafficher);
    }

    public void clickbouton3(View view) {
        resultatafficher = resultatView.getText().toString();
        resultatafficher += "3";
        resultatView.setText(resultatafficher);
    }

    public void clickbouton4(View view) {
        resultatafficher = resultatView.getText().toString();
        resultatafficher += "4";
        resultatView.setText(resultatafficher);
    }

    public void clickbouton5(View view) {
        resultatafficher = resultatView.getText().toString();
        resultatafficher += "5";
        resultatView.setText(resultatafficher);
    }

    public void clickbouton6(View view) {
        resultatafficher = resultatView.getText().toString();
        resultatafficher += "6";
        resultatView.setText(resultatafficher);
    }

    public void clickbouton7(View view) {
        resultatafficher = resultatView.getText().toString();
        resultatafficher += "7";
        resultatView.setText(resultatafficher);
    }
    public void clickbouton8(View view) {
        resultatafficher = resultatView.getText().toString();
        resultatafficher += "8";
        resultatView.setText(resultatafficher);
    }

    public void clickbouton9(View view) {
        resultatafficher = resultatView.getText().toString();
        resultatafficher += "9";
        resultatView.setText(resultatafficher);
    }


    //bouton de calcul

    public void clickboutondiviser(View view) {

    }

    public void clickboutonplus(View view) {
        int calcul = Integer.parseInt(pilestack.elementAt(0).toString())+Integer.parseInt(pilestack.elementAt(1).toString());

        pilestack.push(calcul);

    }

    public void clickboutonmoins(View view) {
    }

    //bouton de gestion
    public void clickboutonenter(View view) {

        addpiles(resultatafficher);
        resultatafficher = "";
        resultatView.setText("");
        Log.d("mainActivity", "FONCTION CLICK ENTRER");
    }

    public void clickboutonclear(View view) {
        resultatafficher = " ";
        resultatView.setText(" ");
        while(pilestack.empty() != true){
            Log.d("mainActivity", "FONCTION CLICK BOUTON CLEAR");
            pilestack.pop();
        }
        pile1.setText(" ");
        pile2.setText(" ");
        pile3.setText(" ");
        pile4.setText(" ");
    }

    public void clickboutonpop(View view) {
    }

    public void clickboutonswap(View view) {
    }





    // rempli la pile
    public void addpiles(String newnumpile) {

        Log.d("mainActivity", "FONCTION PILE");

      /* if (pile1.getText().toString().equals(" ")) {
            pile1.setText(newnumpile);
        } else if (pile1.getText().toString().equals(" ")){

        }*/


        if (pile4.getText().toString().equals(" ")) {

        }else{
            pilestack.pop();
        }
        pilestack.push(newnumpile);


        try {
            if (istack == 0 ){
                pile1.setText(pilestack.elementAt(0).toString());
                istack = 1;
            }
            if (istack == 1 ){

                pile1.setText(pilestack.elementAt(1).toString());
                pile2.setText(pilestack.elementAt(0).toString());
                istack = 2;
            }
            if (istack == 2 ){
                pile1.setText(pilestack.elementAt(2).toString());
                pile2.setText(pilestack.elementAt(1).toString());
                pile3.setText(pilestack.elementAt(0).toString());
                istack = 3;
            }
            if (istack == 3 ){
                pile1.setText(pilestack.elementAt(3).toString());
                pile2.setText(pilestack.elementAt(2).toString());
                pile3.setText(pilestack.elementAt(1).toString());
                pile4.setText(pilestack.elementAt(0).toString());
                istack = 4;
            }
            if (istack == 4 ){
                pile1.setText(pilestack.elementAt(3).toString());
                pile2.setText(pilestack.elementAt(2).toString());
                pile3.setText(pilestack.elementAt(1).toString());
                pile4.setText(pilestack.elementAt(0).toString());
            }

        } catch (Throwable e) {
        }
    }



}
