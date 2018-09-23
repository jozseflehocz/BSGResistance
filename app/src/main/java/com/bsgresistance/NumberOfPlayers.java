package com.bsgresistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bsgresistance.bsgresistance.R;

public class NumberOfPlayers extends AppCompatActivity {

    Button increaseTotalNumberOfPlayersButton;
    Button decreaseTotalNumberOfPlayersButton;

    /**
     * Specific character buttons
     */
    Button gaiusButton;
    Button aaronButton;
    Button apolloButton;
    Button shelleyButton;
    Button ashaButton;
    Button dAnnaButton;
    Button sharonBoomerValeriButton;
    Button sharonAthenaValeriButton;

    TextView totalNumberOfPlayersView;
    TextView totalNumberOfHumanCharactersView;
    TextView totalNumberOfCylonCharactersView;
    TextView numberOfSimpleHumanCharactersView;
    TextView numberOfSimpleCylonCharactersView;

    /**
     * Total number of players including basic and specific characters
     */
    private int mTotalNumberOfPlayers;
    private int mTotalNumberOfHumanCharacters;
    private int mTotalNumberOfCylonCharacters;
    private int mNumberofSimpleHumanCharacters;
    private int mNumberofSimpleCylonCharacters;

    /**
     * Tudos modul
     */
    private int mNumberOfGaiusCharacters;
    private int mNumberOfAaronCharacters;
    private int mNumberOfApolloCharacters;
    private int mNumberOfShelleyCharacters;
    private int mNumberOfAshaCharacters;
    private int mNumberOfDAnnaCharacters;

    /**
     * Disszidens modul
     */

    private int mNumberOfSharonBoomerValeriCharacters;
    private int mNumberOfSharonAthenaValeriCharacters;

    /**
     * @param savedInstanceState
     */
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

        TextView disszidensModuleHeader = findViewById(R.id.disszidens_modul_header);
        final GridLayout disszidensModuleGrid = findViewById(R.id.disszidens_modul_grid);
        disszidensModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(disszidensModuleGrid);
            }
        });

        TextView hitModuleHeader = findViewById(R.id.hit_modul_header);
        final GridLayout hitModuleGrid = findViewById(R.id.hit_modul_grid);
        hitModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(hitModuleGrid);
            }
        });

        TextView vezetoModuleHeader = findViewById(R.id.vezeto_modul_header);
        final GridLayout vezetoModuleGrid = findViewById(R.id.vezeto_modul_grid);
        vezetoModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(vezetoModuleGrid);
            }
        });

        TextView familiarModuleHeader = findViewById(R.id.familiar_modul_header);
        final GridLayout familiarModuleGrid = findViewById(R.id.familiar_modul_grid);
        familiarModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(familiarModuleGrid);
            }
        });

        TextView moralModuleHeader = findViewById(R.id.moral_modul_header);
        final GridLayout moralModuleGrid = findViewById(R.id.moral_modul_grid);
        moralModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(moralModuleGrid);
            }
        });

        TextView extraModuleHeader = findViewById(R.id.extra_modul_header);
        final GridLayout extraModuleGrid = findViewById(R.id.extra_modul_grid);
        extraModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(extraModuleGrid);
            }
        });

        TextView detectorModuleHeader = findViewById(R.id.detector_modul_header);
        final GridLayout detectorModuleGrid = findViewById(R.id.detector_modul_grid);
        detectorModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(detectorModuleGrid);
            }
        });

        TextView sergantModuleHeader = findViewById(R.id.sergant_modul_header);
        final GridLayout sergantModuleGrid = findViewById(R.id.sergant_modul_grid);
        sergantModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(sergantModuleGrid);
            }
        });

        TextView plotModuleHeader = findViewById(R.id.plot_modul_header);
        final GridLayout plotModuleGrid = findViewById(R.id.plot_modul_grid);
        plotModuleHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setModuleVisibility(plotModuleGrid);
            }
        });

        mTotalNumberOfPlayers = Integer.parseInt(getString(R.string.number_of_players_default_value));

        increaseTotalNumberOfPlayersButton = findViewById(R.id.increase_total_number_of_players);
        increaseTotalNumberOfPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initCharacters(1);
                setNumberOfPlayers(1);
                setTotalPlayerFields();
                setPlayerFields();
            }
        });

        decreaseTotalNumberOfPlayersButton = findViewById(R.id.decrease_total_number_of_players);
        decreaseTotalNumberOfPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initCharacters(1);
                setNumberOfPlayers(-1);
                setTotalPlayerFields();
                setPlayerFields();
            }
        });

        totalNumberOfPlayersView = findViewById(R.id.total_number_of_players);
        totalNumberOfHumanCharactersView = findViewById(R.id.total_number_of_human_players);
        totalNumberOfCylonCharactersView = findViewById(R.id.total_number_of_cylon_players);
        numberOfSimpleHumanCharactersView = findViewById(R.id.number_of_simple_human_characters);
        numberOfSimpleCylonCharactersView = findViewById(R.id.number_of_simple_cylon_characters);


        gaiusButton = findViewById(R.id.gaius_button);
        gaiusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setGaiusAndAaron();
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();

            }
        });

        aaronButton = findViewById(R.id.aaron_button);
        aaronButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setGaiusAndAaron();
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        apolloButton = findViewById(R.id.apollo_button);
        apolloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setApollo();
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        shelleyButton = findViewById(R.id.shelly_button);
        shelleyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setShelleyAndApollo();
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        ashaButton = findViewById(R.id.asha_button);
        ashaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAsha();
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();

            }
        });

        dAnnaButton = findViewById(R.id.danna_button);
        dAnnaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDAnna();
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        /**
         * Disszidens modul buttons
         */
        sharonBoomerValeriButton = findViewById(R.id.boomer_button);
        sharonBoomerValeriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBoomerAndAthena();
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });

        sharonAthenaValeriButton = findViewById(R.id.athena_button);
        sharonAthenaValeriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBoomerAndAthena();
                setNumberOfHumanAndCylonPlayers();
                setPlayerFields();
            }
        });


        initCharacters(0);
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
     * @param changeValue 1, or -1 depends on the button clicked
     */

    private void setNumberOfPlayers(int changeValue) {

        String toastText="";

        if (!totalNumberOfPlayersView.getText().toString().isEmpty()) {
            mTotalNumberOfPlayers = Integer.parseInt(totalNumberOfPlayersView.getText().toString().trim());
        }

        decreaseTotalNumberOfPlayersButton.setEnabled(true);
        increaseTotalNumberOfPlayersButton.setEnabled(true);
        mTotalNumberOfPlayers = mTotalNumberOfPlayers + changeValue;
        totalNumberOfPlayersView.setText(String.valueOf(mTotalNumberOfPlayers));

        if (mTotalNumberOfPlayers < 6) {
            decreaseTotalNumberOfPlayersButton.setEnabled(false);
            toastText=getString(R.string.minimum_number_of_players_toast);
        }
        if (mTotalNumberOfPlayers > 11) {
            increaseTotalNumberOfPlayersButton.setEnabled(false);
            toastText=getString(R.string.maximum_number_of_players_toast);
        }

        if (toastText.length()>0){
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

        //mTotalNumberOfHumanCharacters = mTotalNumberOfHumanCharacters - mNumberOfGaiusCharacters - mNumberOfApolloCharacters;
        //mTotalNumberOfCylonCharacters = mTotalNumberOfCylonCharacters - mNumberOfAaronCharacters - mNumberOfShelleyCharacters - mNumberOfAshaCharacters - mNumberOfDAnnaCharacters;

        // Number of simple characters

        mNumberofSimpleHumanCharacters = mTotalNumberOfHumanCharacters - mNumberOfGaiusCharacters - mNumberOfApolloCharacters - mNumberOfSharonBoomerValeriCharacters;
        mNumberofSimpleCylonCharacters = mTotalNumberOfCylonCharacters - mNumberOfAaronCharacters - mNumberOfShelleyCharacters - mNumberOfAshaCharacters - mNumberOfDAnnaCharacters - mNumberOfSharonAthenaValeriCharacters;

    }


    private void setGaiusAndAaron() {
        int gaiusButtonBackgroundColorId;
        int aaronButtonBackgroundColorId;
        if (mNumberOfGaiusCharacters == 0 && mTotalNumberOfHumanCharacters > 0 && mTotalNumberOfCylonCharacters > 0) {
            mNumberOfGaiusCharacters = 1;
            mNumberOfAaronCharacters = 1;
            gaiusButtonBackgroundColorId = R.color.colorHuman;
            aaronButtonBackgroundColorId = R.color.colorCylon;
        } else {
            mNumberOfGaiusCharacters = 0;
            mNumberOfAaronCharacters = 0;
            gaiusButtonBackgroundColorId = R.color.colorPrimary;
            aaronButtonBackgroundColorId = R.color.colorPrimary;
        }

        setButtonBackground(gaiusButton, gaiusButtonBackgroundColorId);
        setButtonBackground(aaronButton, aaronButtonBackgroundColorId);
    }

    private void setApollo() {
        int apolloButtonBackgroundColorId;
        if (mNumberOfApolloCharacters == 0 && mTotalNumberOfHumanCharacters > 0 && mTotalNumberOfCylonCharacters > 0) {
            mNumberOfApolloCharacters = 1;
            apolloButtonBackgroundColorId = R.color.colorHuman;
        } else {
            mNumberOfApolloCharacters = 0;
            apolloButtonBackgroundColorId = R.color.colorPrimary;
        }
        setButtonBackground(apolloButton, apolloButtonBackgroundColorId);
    }

    private void setShelleyAndApollo() {
        int apolloButtonBackgroundColorId;
        int shelleyButtonBackgroundColorId;
        if (mNumberOfShelleyCharacters == 0 && mTotalNumberOfHumanCharacters > 0 && mTotalNumberOfCylonCharacters > 0) {
            mNumberOfApolloCharacters = 1;
            mNumberOfShelleyCharacters = 1;
            apolloButtonBackgroundColorId = R.color.colorHuman;
            shelleyButtonBackgroundColorId = R.color.colorCylon;
        } else {
            mNumberOfApolloCharacters = 0;
            mNumberOfShelleyCharacters = 0;
            apolloButtonBackgroundColorId = R.color.colorPrimary;
            shelleyButtonBackgroundColorId = R.color.colorPrimary;
        }
        setButtonBackground(shelleyButton, shelleyButtonBackgroundColorId);
        setButtonBackground(apolloButton, apolloButtonBackgroundColorId);
    }

    private void setAsha() {
        int ashaButtonBackgroundColorId;
        if (mNumberOfAshaCharacters == 0 && mTotalNumberOfCylonCharacters > 0) {
            mNumberOfAshaCharacters = 1;
            ashaButtonBackgroundColorId = R.color.colorLightCylon;
        } else {
            mNumberOfAshaCharacters = 0;
            ashaButtonBackgroundColorId = R.color.colorPrimary;
        }
        setButtonBackground(ashaButton, ashaButtonBackgroundColorId);
    }

    private void setDAnna() {
        int dAnnaButtonBackgroundColorId;
        if (mNumberOfDAnnaCharacters == 0 && mTotalNumberOfCylonCharacters > 0) {
            mNumberOfDAnnaCharacters = 1;
            dAnnaButtonBackgroundColorId = R.color.colorDarkCylon;
        } else {
            mNumberOfDAnnaCharacters = 0;
            dAnnaButtonBackgroundColorId = R.color.colorPrimary;
        }
        setButtonBackground(dAnnaButton, dAnnaButtonBackgroundColorId);
    }

    private void setBoomerAndAthena() {
        int boomerButtonBackgroundColorId;
        int athenaButtonBackgroundColorId;
        if (mNumberOfSharonBoomerValeriCharacters == 0 && mTotalNumberOfHumanCharacters > 0 && mTotalNumberOfCylonCharacters > 0) {
            mNumberOfSharonBoomerValeriCharacters = 1;
            mNumberOfSharonAthenaValeriCharacters = 1;
            boomerButtonBackgroundColorId = R.color.colorHuman;
            athenaButtonBackgroundColorId = R.color.colorCylon;
        } else {
            mNumberOfSharonBoomerValeriCharacters = 0;
            mNumberOfSharonAthenaValeriCharacters = 0;
            boomerButtonBackgroundColorId = R.color.colorPrimary;
            athenaButtonBackgroundColorId = R.color.colorPrimary;
        }
        setButtonBackground(sharonBoomerValeriButton, boomerButtonBackgroundColorId);
        setButtonBackground(sharonAthenaValeriButton, athenaButtonBackgroundColorId);
    }

    private void setButtonBackground(Button playerButton, int backgroundColorId) {
        playerButton.setBackgroundColor(getResources().getColor(backgroundColorId));
    }

    private void setTotalPlayerFields() {
        totalNumberOfHumanCharactersView.setText(Integer.toString(mTotalNumberOfHumanCharacters));
        totalNumberOfCylonCharactersView.setText(Integer.toString(mTotalNumberOfCylonCharacters));
    }
    private void setPlayerFields(){
        numberOfSimpleHumanCharactersView.setText(Integer.toString(mNumberofSimpleHumanCharacters));
        numberOfSimpleCylonCharactersView.setText(Integer.toString(mNumberofSimpleCylonCharacters));
    }

    private void initCharacters(int initNumberOfCharacters) {
        mNumberOfGaiusCharacters = initNumberOfCharacters;
        mNumberOfAaronCharacters = initNumberOfCharacters;
        mNumberOfApolloCharacters = initNumberOfCharacters;
        mNumberOfShelleyCharacters = initNumberOfCharacters;
        mNumberOfAshaCharacters = initNumberOfCharacters;
        mNumberOfDAnnaCharacters = initNumberOfCharacters;
        mNumberOfSharonBoomerValeriCharacters = initNumberOfCharacters;
        mNumberOfSharonAthenaValeriCharacters = initNumberOfCharacters;
        //tudos modul
        setGaiusAndAaron();
        setApollo();
        setShelleyAndApollo();
        setAsha();
        setDAnna();
        //disszidens modul
        setBoomerAndAthena();
    }
}