package cl.santotomas.sumarestaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    Button btn_suma, btn_resta;
    int valor_1, valor_2, resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.et_1);
        n2 = (EditText)findViewById(R.id.et_2);
        btn_suma = (Button)findViewById(R.id.button_suma);
        btn_resta = (Button)findViewById(R.id.button_resta);

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            //On click function
            public void onClick(View view) {
                if(n1.getText().toString().matches("") || n2.getText().toString().matches("")) {
                    Toast.makeText(MainActivity.this, "No puedes dejar los campos vacios", Toast.LENGTH_SHORT).show();
                } else {
                    valor_1 = Integer.parseInt(n1.getText().toString());
                    valor_2 = Integer.parseInt(n2.getText().toString());
                    resultado = valor_1 + valor_2;
                    Toast.makeText(MainActivity.this, "El resultado de la suma es: " + resultado, Toast.LENGTH_LONG).show();
                }
            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            //On click function
            public void onClick(View view) {
                if(n1.getText().toString().matches("") || n2.getText().toString().matches("")) {
                    Toast.makeText(MainActivity.this, "No puedes dejar los campos vacios", Toast.LENGTH_SHORT).show();
                } else {
                    valor_1 = Integer.parseInt(n1.getText().toString());
                    valor_2 = Integer.parseInt(n2.getText().toString());
                    resultado = valor_1 - valor_2;
                    Toast.makeText(MainActivity.this, "El resultado de la resta es: " + resultado, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}