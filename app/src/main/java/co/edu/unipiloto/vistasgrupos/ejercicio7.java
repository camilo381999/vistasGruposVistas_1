package co.edu.unipiloto.vistasgrupos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class ejercicio7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);
    }

    public void onToggleButtonClicked(View view){
        boolean on=((ToggleButton)view).isChecked();
        if(on){
            //on
        }else{
            //off
        }
    }

    public void onSwitchClicked(View view){
        boolean on=((Switch)view).isChecked();
        if(on){
            //on
        }else{
            //off
        }
    }

}