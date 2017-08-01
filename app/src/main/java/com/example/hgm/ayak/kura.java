package com.example.hgm.ayak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class kura extends AppCompatActivity {

    Button btnKuraCek;
    Button btnTekKuracek;
   // TextView labelBasarilar;
    TextView labelSonuc;
    TextView labelKalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kura);
        btnKuraCek=(Button)findViewById(R.id.btnKuracek);
        btnTekKuracek=(Button)findViewById(R.id.btnTekKuracek);
       // labelBasarilar=(TextView)findViewById(R.id.labelBasarilar);
        labelSonuc=(TextView)findViewById(R.id.labelSonuc);
        labelKalan=(TextView)findViewById(R.id.labelKalan);
     //   labelBasarilar.setText(getIntent().getExtras().getString("veri")+"  Kişilik Kura");
        int in2 = new Integer(getIntent().getExtras().getString("veri"));

        final ArrayList<Integer>  mylist= new ArrayList<Integer>();
        for (int i=1;i<=in2;i++)
        {
            mylist.add(i);
        }
        final Random random = new Random();
        btnKuraCek.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //  ArrayList<String> kuralist=new ArrayList<String>();
                // String deger=labelBasarilar.getText().toString();
                if(mylist.size()!=0)
                {
                    Integer randomInt = mylist.get(random.nextInt(mylist.size()));
                    String  kelime=String.valueOf(randomInt);
                    labelSonuc.setText(kelime);
                    mylist.remove(randomInt);
                    String kalan=String.valueOf(mylist.size());
                    labelKalan.setText(kalan+" Kişi Kaldı");
                }
                else {

                    labelSonuc.setText("Bitti");

                }
            }
        });


        btnTekKuracek.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=1,y=0;

                if(mylist.size()!=0)
                {

                       for (int a=0;a<mylist.size()&&y==0;a++)
                      {
                          if(mylist.get(a)%2!=0)
                          {
                              y=1;
                          }
                     }

                     if(y==0)
                         labelSonuc.setText("Tek Yok");

                   while (x==1&&y==1){

                        Integer randomInt = mylist.get(random.nextInt(mylist.size()));

                        if(randomInt%2!=0)
                        {

                            String  kelime=String.valueOf(randomInt);
                           labelSonuc.setText(kelime);
                            mylist.remove(randomInt);
                            String kalan=String.valueOf(mylist.size());
                           labelKalan.setText(kalan+" Kişi Kaldı");
                           x=0;
                       }

                    }

                }
                else {

                    labelSonuc.setText("Bitti");

                }

            }
        });


    }

}
