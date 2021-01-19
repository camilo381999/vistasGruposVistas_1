package co.edu.unipiloto.vistasgrupos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class ejercicio8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);
    }

    public void onToggleButtonClicked(View view){
        boolean on=((ToggleButton)view).isChecked();
        if(on){
            //on
        }else{
            //off
        }
    }

}