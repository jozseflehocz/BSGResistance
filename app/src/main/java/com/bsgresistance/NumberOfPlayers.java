package com.bsgresistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;

import com.bsgresistance.bsgresistance.R;

public class NumberOfPlayers extends AppCompatActivity {

    Button increaseNumberOfPlayersButton;
    Button decreaseNumberOfPlayersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_of_players);

        TextView tudosModuleHeader = findViewById(R.id.tudos_modul_header);
        final GridLayout tudosModuleGrid = findViewById(R.id.tudos_modul_grid);
        tudosModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(tudosModuleGrid);
            }
        });

        TextView moralisModuleHeader = findViewById(R.id.moralis_modul_header);
        final GridLayout moralisModuleGrid = findViewById(R.id.moralis_modul_grid);
        moralisModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(moralisModuleGrid);
            }
        });

        increaseNumberOfPlayersButton = findViewById(R.id.increase_number_of_players);
        increaseNumberOfPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeNumberOfPlayers(1);
            }
        });

        decreaseNumberOfPlayersButton = findViewById(R.id.decrease_number_of_players);
        decreaseNumberOfPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeNumberOfPlayers(-1);
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

    /**
     * Set visibility of the selected module. If visible set to hidden. If hidden set to visible
     *
     * @param moduleGrid
     */

    private void setModuleVisibility(GridLayout moduleGrid) {
        if (moduleGrid.getVisibility() == View.VISIBLE) {
            moduleGrid.setVisibility(View.GONE);
        } else {
            moduleGrid.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Increase or decrease the number of players, and disable enable buttons depending on
     * the current value
     * @param changeValue
     */

    private void changeNumberOfPlayers(int changeValue) {
        EditText numberOfPlayers = findViewById(R.id.number_of_players);
        int currentNumberOfPlayers = Integer.parseInt(numberOfPlayers.getText().toString().trim());

        decreaseNumberOfPlayersButton.setEnabled(true);
        increaseNumberOfPlayersButton.setEnabled(true);
        currentNumberOfPlayers = currentNumberOfPlayers+changeValue;
        numberOfPlayers.setText(String.valueOf(currentNumberOfPlayers));

        if (currentNumberOfPlayers<6) {
            decreaseNumberOfPlayersButton.setEnabled(false);
        }
        if (currentNumberOfPlayers>11) {
            increaseNumberOfPlayersButton.setEnabled(false);
        }

    }
}