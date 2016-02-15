package com.cami.cat.camiurv;

import android.app.ActionBar;
import android.content.Intent;
import android.nfc.tech.TagTechnology;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class VeureSolicitut extends AppCompatActivity {
    private TextView nomCont;
    private TextView locCont;
    private TextView horaCont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veure_solicitut);
        /*ActionBar actionBar = getActionBar();
        try {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }catch(NullPointerException e){
            e.printStackTrace();
        }*/
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        setTitle("Solicitut de: ");



        nomCont = (TextView) findViewById(R.id.contNom);
        locCont = (TextView)findViewById(R.id.locCont);
        horaCont = (TextView) findViewById(R.id.contHora);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent i = new Intent(VeureSolicitut.this, MainActivity.class);
                startActivity(i);
                return true;
        }
        return true;
    }

}
