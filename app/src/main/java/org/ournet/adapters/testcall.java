package org.ournet.adapters;

/**
 * Created by soto on 2/09/17.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.ournet.R;

public class testcall extends AppCompatActivity {
    private TextView txtSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testcall);
        //Localizar los controles
        txtSaludo = (TextView)findViewById(R.id.txtSaludo);
        //Construimos el mensaje a mostrar
        txtSaludo.setText("Hola he cambiado");
    }
}