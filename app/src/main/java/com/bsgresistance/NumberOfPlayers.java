package com.bsgresistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bsgresistance.bsgresistance.R;

public class NumberOfPlayers extends AppCompatActivity {

    Button increaseNumberOfPlayersButton;
    Button decreaseNumberOfPlayersButton;

    TextView numberOfHumanPlayersView;
    TextView numberOfCylonPlayersView;

    private int mNumberOfPlayers;
    private int mNumberOfHumanPlayers;
    private int mNumberOfCylonPlayers;


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

        mNumberOfPlayers=Integer.parseInt(getString(R.string.number_of_players_default_value));

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

        numberOfHumanPlayersView=findViewById(R.id.number_of_human_players);
        numberOfCylonPlayersView=findViewById(R.id.number_of_cylon_players);

        setNumberOfPlayers();
        changeNumberOfPlayers(0);
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
     * @param moduleGrid module where the visibility is set
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
     * @param changeValue 1, or -1 depends on the button clicked
     */

    private void changeNumberOfPlayers(int changeValue) {

        String toastText="";
        EditText numberOfPlayers = findViewById(R.id.number_of_players);
        if (!numberOfPlayers.getText().toString().isEmpty()) {
            mNumberOfPlayers = Integer.parseInt(numberOfPlayers.getText().toString().trim());
        }

        decreaseNumberOfPlayersButton.setEnabled(true);
        increaseNumberOfPlayersButton.setEnabled(true);
        mNumberOfPlayers = mNumberOfPlayers+changeValue;
        numberOfPlayers.setText(String.valueOf(mNumberOfPlayers));

        if (mNumberOfPlayers<6) {
            decreaseNumberOfPlayersButton.setEnabled(false);
            toastText=getString(R.string.minimum_number_of_players_toast);
        }
        if (mNumberOfPlayers>11) {
            increaseNumberOfPlayersButton.setEnabled(false);
            toastText=getString(R.string.maximum_number_of_players_toast);
        }

        if (toastText.length()>0){
            Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
        }

        setNumberOfPlayers();

    }

    private void setNumberOfPlayers() {

        switch (mNumberOfPlayers) {
            case 5:
                mNumberOfHumanPlayers = 3;
                mNumberOfCylonPlayers = 2;
                break;
            case 6:
                mNumberOfHumanPlayers = 4;
                mNumberOfCylonPlayers = 2;
                break;
            case 7:
                mNumberOfHumanPlayers = 4;
                mNumberOfCylonPlayers = 3;
                break;
            case 8:
                mNumberOfHumanPlayers = 5;
                mNumberOfCylonPlayers = 3;
                break;
            case 9:
                mNumberOfHumanPlayers = 6;
                mNumberOfCylonPlayers = 3;
                break;
            case 10:
                mNumberOfHumanPlayers = 6;
                mNumberOfCylonPlayers = 4;
                break;
            case 11:
                mNumberOfHumanPlayers = 7;
                mNumberOfCylonPlayers = 4;
                break;
            default:
                mNumberOfHumanPlayers = 8;
                mNumberOfCylonPlayers = 4;
        }

        setPlayerFields();
    }

    private void setPlayerFields(){
        numberOfHumanPlayersView.setText(Integer.toString(mNumberOfHumanPlayers));
        numberOfCylonPlayersView.setText(Integer.toString(mNumberOfCylonPlayers));
    }
}