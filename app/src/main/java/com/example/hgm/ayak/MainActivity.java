package com.example.hgm.ayak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView txtsonuc;
    Button btnKura;
    TextView labelgiris;
    EditText girisEdittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnKura= (Button)findViewById(R.id.btnKura);
        labelgiris=(TextView)findViewById(R.id.labelgiris) ;
        girisEdittext=(EditText)findViewById(R.id.girisEdittext);
        String edet=girisEdittext.getText().toString();

        btnKura.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                   Intent intent = new Intent(MainActivity.this,kura.class);
                intent.putExtra("veri", girisEdittext.getText().toString());
                  startActivity(intent);





            }

        });

    }
}
