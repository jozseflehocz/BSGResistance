package com.bsgresistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;

import com.bsgresistance.bsgresistance.R;

public class NumberOfPlayers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_of_players);
        TextView tudosModuleHeader= findViewById(R.id.tudos_modul_header);
        final GridLayout tudosModuleGrid = findViewById(R.id.tudos_modul_grid);
        tudosModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(tudosModuleGrid);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_start_game) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setModuleVisibility(GridLayout moduleGrid ){
        if (moduleGrid.getVisibility()==View.VISIBLE){
            moduleGrid.setVisibility(View.GONE);
        }else{
            moduleGrid.setVisibility(View.VISIBLE);
        }
    }
}