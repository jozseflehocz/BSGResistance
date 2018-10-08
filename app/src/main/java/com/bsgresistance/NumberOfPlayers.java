package com.bsgresistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.bsgresistance.bsgresistance.R;

import java.util.ArrayList;

import static com.bsgresistance.bsgresistance.R.*;

public class NumberOfPlayers extends AppCompatActivity {

    Button increaseTotalNumberOfPlayersButton;
    Button decreaseTotalNumberOfPlayersButton;

    TextView totalNumberOfPlayersView;
    TextView totalNumberOfHumanCharactersView;
    TextView totalNumberOfCylonCharactersView;
    TextView numberOfSimpleHumanCharactersView;
    TextView numberOfSimpleCylonCharactersView;

    private int mTotalNumberOfPlayers;
    private int mTotalNumberOfHumanCharacters;
    private int mTotalNumberOfCylonCharacters;
    ArrayList<ToggleButton> cylonToggleButton = new ArrayList<ToggleButton>();
    ToggleButton gaiusToggleButton;
    ToggleButton aaronToggleButton;
    ToggleButton apolloToggleButton;
    ToggleButton shelleyToggleButton;

    /**
     * Tudos modul
     */
    private int mNumberOfGaiusCharacters = 0;
    private int mNumberOfAaronCharacters = 0;
    private int mNumberOfApolloCharacters = 0;
    private int mNumberOfShelleyCharacters = 0;
    private int mNumberOfAshaCharacters = 0;
    private int mNumberOfDAnnaCharacters = 0;
    ToggleButton ashaToggleButton;
    ToggleButton dAnnaToggleButton;
    ToggleButton sharonBoomerValeriToggleButton;
    ToggleButton sharonAthenaValeriToggleButton;
    private int mNumberOfSimpleHumanCharacters;
    private int mNumberOfSimpleCylonCharacters;
    private int mNumberOfSpecificHumanCharacters = 0;
    private int mNumberOfSpecificCylonCharacters = 0;
    /**
     * Disszidens modul
     */
    private int mNumberOfSharonBoomerValeriCharacters = 0;
    private int mNumberOfSharonAthenaValeriCharacters = 0;

    /**
     * Vezeto modul
     */
    private int mNumberOfWilliamAdamaCharacters = 0;
    private int mNumberOfJohnCavilGalacticaCahracters = 0;
    private int mNumberOfLauraRoslingCharacters = 0;
    private int mNumberOfJohnCavilCapricaCharacters = 0;
    private int mNumberOfSamuelTAndersCahracters = 0;
    private int mNumberOfToryFosterCharacters = 0;
    private int mNumberOfTomZarekCahracters = 0;
    private int mNumberOfBillyKeikeyaCharacters = 0;

    /**
     * Morális modul
     */
    private int mNumberOfHeloKarlAgatonCharacters = 0;
    private int mNumberOfSimonONeilCharacters = 0;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_number_of_players);

        TextView tudosModuleHeader = findViewById(id.tudos_modul_header);
        final GridLayout tudosModuleGrid = findViewById(id.tudos_modul_grid);
        tudosModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(tudosModuleGrid);
            }
        });

        TextView disszidensModuleHeader = findViewById(id.disszidens_modul_header);
        final GridLayout disszidensModuleGrid = findViewById(id.disszidens_modul_grid);
        disszidensModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(disszidensModuleGrid);
            }
        });

        TextView hitModuleHeader = findViewById(id.hit_modul_header);
        final GridLayout hitModuleGrid = findViewById(id.hit_modul_grid);
        hitModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(hitModuleGrid);
            }
        });

        TextView vezetoModuleHeader = findViewById(id.vezeto_modul_header);
        final GridLayout vezetoModuleGrid = findViewById(id.vezeto_modul_grid);
        vezetoModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(vezetoModuleGrid);
            }
        });

        TextView familiarModuleHeader = findViewById(id.familiar_modul_header);
        final GridLayout familiarModuleGrid = findViewById(id.familiar_modul_grid);
        familiarModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(familiarModuleGrid);
            }
        });

        TextView moralModuleHeader = findViewById(id.moral_modul_header);
        final GridLayout moralModuleGrid = findViewById(id.moral_modul_grid);
        moralModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(moralModuleGrid);
            }
        });

        TextView extraModuleHeader = findViewById(id.extra_modul_header);
        final GridLayout extraModuleGrid = findViewById(id.extra_modul_grid);
        extraModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(extraModuleGrid);
            }
        });

        TextView detectorModuleHeader = findViewById(id.detector_modul_header);
        final GridLayout detectorModuleGrid = findViewById(id.detector_modul_grid);
        detectorModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(detectorModuleGrid);
            }
        });

        TextView sergantModuleHeader = findViewById(id.sergant_modul_header);
        final GridLayout sergantModuleGrid = findViewById(id.sergant_modul_grid);
        sergantModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(sergantModuleGrid);
            }
        });

        TextView plotModuleHeader = findViewById(id.plot_modul_header);
        final GridLayout plotModuleGrid = findViewById(id.plot_modul_grid);
        plotModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(plotModuleGrid);
            }
        });

        mTotalNumberOfPlayers = Integer.parseInt(getString(string.number_of_players_default_value));

        increaseTotalNumberOfPlayersButton = findViewById(id.increase_total_number_of_players);
        increaseTotalNumberOfPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumberOfPlayers(1);
                setTotalPlayerFields();
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        decreaseTotalNumberOfPlayersButton = findViewById(id.decrease_total_number_of_players);
        decreaseTotalNumberOfPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumberOfPlayers(-1);
                setTotalPlayerFields();
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        totalNumberOfPlayersView = findViewById(id.total_number_of_players);
        totalNumberOfHumanCharactersView = findViewById(id.total_number_of_human_players);
        totalNumberOfCylonCharactersView = findViewById(id.total_number_of_cylon_players);
        numberOfSimpleHumanCharactersView = findViewById(id.number_of_simple_human_characters);
        numberOfSimpleCylonCharactersView = findViewById(id.number_of_simple_cylon_characters);

        gaiusToggleButton = findViewById(id.gaius_button);
        aaronToggleButton = findViewById(id.aaron_button);

        gaiusToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    aaronToggleButton.setChecked(true);
                    mNumberOfGaiusCharacters = 1;
                    mNumberOfAaronCharacters = 1;
                    changeNumberOfSpecificCharacters(1);
                } else {
                    // The toggle is disabled
                    aaronToggleButton.setChecked(false);
                    mNumberOfGaiusCharacters = 0;
                    mNumberOfAaronCharacters = 0;
                    changeNumberOfSpecificCharacters(-1);
                }
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        aaronToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    gaiusToggleButton.setChecked(true);
                    mNumberOfGaiusCharacters = 1;
                    mNumberOfAaronCharacters = 1;
                    changeNumberOfSpecificCharacters(1);
                } else {
                    // The toggle is disabled
                    gaiusToggleButton.setChecked(false);
                    mNumberOfGaiusCharacters = 0;
                    mNumberOfAaronCharacters = 0;
                    changeNumberOfSpecificCharacters(-1);
                }
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        apolloToggleButton = findViewById(id.apollo_button);
        apolloToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    mNumberOfApolloCharacters = 1;
                } else {
                    // The toggle is disabled
                    mNumberOfApolloCharacters = 0;
                }
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        shelleyToggleButton = findViewById(id.shelly_button);
        shelleyToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    apolloToggleButton.setChecked(true);
                    mNumberOfApolloCharacters = 1;
                    mNumberOfShelleyCharacters = 1;
                    changeNumberOfSpecificCharacters(1);
                } else {
                    // The toggle is disabled
                    apolloToggleButton.setChecked(false);
                    mNumberOfApolloCharacters = 0;
                    mNumberOfShelleyCharacters = 0;
                    changeNumberOfSpecificCharacters(-1);
                }
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        ashaToggleButton = findViewById(id.asha_button);
        ashaToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    mNumberOfAshaCharacters = 1;
                    changeNumberOfSpecificCylonCharacters(1);
                } else {
                    // The toggle is disabled
                    mNumberOfAshaCharacters = 0;
                    changeNumberOfSpecificCylonCharacters(-1);
                }
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        dAnnaToggleButton = findViewById(id.danna_button);
        dAnnaToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    mNumberOfDAnnaCharacters = 1;
                    changeNumberOfSpecificCylonCharacters(1);
                } else {
                    // The toggle is disabled
                    mNumberOfDAnnaCharacters = 0;
                    changeNumberOfSpecificCylonCharacters(-1);
                }
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });


        /**
         * Disszidens modul buttons
         */

        sharonBoomerValeriToggleButton = findViewById(id.boomer_button);
        sharonAthenaValeriToggleButton = findViewById(id.athena_button);

        sharonBoomerValeriToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    sharonAthenaValeriToggleButton.setChecked(true);
                    mNumberOfSharonAthenaValeriCharacters = 1;
                    mNumberOfSharonBoomerValeriCharacters = 1;
                    changeNumberOfSpecificCharacters(1);
                } else {
                    // The toggle is disabled
                    sharonAthenaValeriToggleButton.setChecked(false);
                    mNumberOfSharonAthenaValeriCharacters = 0;
                    mNumberOfSharonBoomerValeriCharacters = 0;
                    changeNumberOfSpecificCharacters(-1);
                }
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });


        sharonAthenaValeriToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    sharonBoomerValeriToggleButton.setChecked(true);
                    mNumberOfSharonAthenaValeriCharacters = 1;
                    mNumberOfSharonBoomerValeriCharacters = 1;
                    changeNumberOfSpecificCharacters(1);
                } else {
                    // The toggle is disabled
                    sharonBoomerValeriToggleButton.setChecked(false);
                    mNumberOfSharonAthenaValeriCharacters = 0;
                    mNumberOfSharonBoomerValeriCharacters = 0;
                    changeNumberOfSpecificCharacters(-1);
                }
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });


        cylonToggleButton.add(gaiusToggleButton);
        cylonToggleButton.add(aaronToggleButton);
        cylonToggleButton.add(shelleyToggleButton);
        cylonToggleButton.add(ashaToggleButton);
        cylonToggleButton.add(dAnnaToggleButton);
        cylonToggleButton.add(sharonAthenaValeriToggleButton);
        cylonToggleButton.add(sharonBoomerValeriToggleButton);

        setNumberOfPlayers(0);
        setTotalPlayerFields();
        setPlayerFields();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        if (menu instanceof MenuBuilder) {
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        return true;
    }

    public void onGroupItemClick(MenuItem item) {
        // One of the group items (using the onClick attribute) was clicked
        // The item parameter passed here indicates which item it is
        // All other menu item clicks are handled by onOptionsItemSelected()
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.submenu) {
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
     *
     * @param changeValue 1, or -1 depends on the button clicked
     */

    private void setNumberOfPlayers(int changeValue) {

        String toastText = "";

        if (!totalNumberOfPlayersView.getText().toString().isEmpty()) {
            mTotalNumberOfPlayers = Integer.parseInt(totalNumberOfPlayersView.getText().toString().trim());
        }

        decreaseTotalNumberOfPlayersButton.setEnabled(true);
        increaseTotalNumberOfPlayersButton.setEnabled(true);
        mTotalNumberOfPlayers = mTotalNumberOfPlayers + changeValue;
        totalNumberOfPlayersView.setText(String.valueOf(mTotalNumberOfPlayers));

        if (mTotalNumberOfPlayers < 6) {
            decreaseTotalNumberOfPlayersButton.setEnabled(false);
            toastText = getString(string.minimum_number_of_players_toast);
        }
        if (mTotalNumberOfPlayers > 11) {
            increaseTotalNumberOfPlayersButton.setEnabled(false);
            toastText = getString(string.maximum_number_of_players_toast);
        }

        if (toastText.length() > 0) {
            Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
        }

        setNumberOfHumanAndCylonPlayers();

    }

    private void setNumberOfHumanAndCylonPlayers() {

        switch (mTotalNumberOfPlayers) {
            case 5:
                mTotalNumberOfHumanCharacters = 3;
                mTotalNumberOfCylonCharacters = 2;
                break;
            case 6:
                mTotalNumberOfHumanCharacters = 4;
                mTotalNumberOfCylonCharacters = 2;
                break;
            case 7:
                mTotalNumberOfHumanCharacters = 4;
                mTotalNumberOfCylonCharacters = 3;
                break;
            case 8:
                mTotalNumberOfHumanCharacters = 5;
                mTotalNumberOfCylonCharacters = 3;
                break;
            case 9:
                mTotalNumberOfHumanCharacters = 6;
                mTotalNumberOfCylonCharacters = 3;
                break;
            case 10:
                mTotalNumberOfHumanCharacters = 6;
                mTotalNumberOfCylonCharacters = 4;
                break;
            case 11:
                mTotalNumberOfHumanCharacters = 7;
                mTotalNumberOfCylonCharacters = 4;
                break;
            default:
                mTotalNumberOfHumanCharacters = 8;
                mTotalNumberOfCylonCharacters = 4;
        }

        // Number of simple characters

        mNumberOfSimpleHumanCharacters = mTotalNumberOfHumanCharacters - mNumberOfGaiusCharacters - mNumberOfApolloCharacters - mNumberOfSharonBoomerValeriCharacters;
        mNumberOfSpecificCylonCharacters = mNumberOfAaronCharacters + mNumberOfShelleyCharacters + mNumberOfAshaCharacters + mNumberOfDAnnaCharacters + mNumberOfSharonAthenaValeriCharacters;

        if (mTotalNumberOfCylonCharacters - mNumberOfSpecificCylonCharacters >= 0) {
            mNumberOfSimpleCylonCharacters = mTotalNumberOfCylonCharacters - mNumberOfSpecificCylonCharacters;
        }

        if (mNumberOfSimpleCylonCharacters < 1) {
            disableButtons(cylonToggleButton);
        } else {
            enableButtons(cylonToggleButton);
        }

    }

    private void changeNumberOfSpecificHumanCharacters(int changeValue) {
        mNumberOfSpecificHumanCharacters += changeValue;
    }

    private void changeNumberOfSpecificCylonCharacters(int changeValue) {
        mNumberOfSpecificCylonCharacters += changeValue;
    }

    private void changeNumberOfSpecificCharacters(int changeValue) {
        changeNumberOfSpecificHumanCharacters(changeValue);
        changeNumberOfSpecificCylonCharacters(changeValue);
    }

    private void setTotalPlayerFields() {
        totalNumberOfHumanCharactersView.setText(Integer.toString(mTotalNumberOfHumanCharacters));
        totalNumberOfCylonCharactersView.setText(Integer.toString(mTotalNumberOfCylonCharacters));
    }

    private void setPlayerFields() {
        numberOfSimpleHumanCharactersView.setText(Integer.toString(mNumberOfSimpleHumanCharacters));
        numberOfSimpleCylonCharactersView.setText(Integer.toString(mNumberOfSimpleCylonCharacters));
    }

    private void disableButtons(ArrayList<ToggleButton> buttons) {
        for (int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).isChecked() == false) {
                buttons.get(i).setEnabled(false);
            }
        }
    }

    private void enableButtons(ArrayList<ToggleButton> buttons) {
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setEnabled(true);
        }
    }
}