package ejercicio1.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView tipo = (TextView) findViewById(R.id.lblTipo);
        TextView operador1 = (TextView) findViewById(R.id.lblOperador1);
        TextView operador2 = (TextView) findViewById(R.id.lblOperador2);
        TextView operador = (TextView) findViewById(R.id.lblOperador);
        TextView operacion = (TextView) findViewById(R.id.lblOperación);
        TextView resultado = (TextView) findViewById(R.id.lblResultado);
        Intent intent = getIntent();

        tipo.setText(intent.getStringExtra("tipo"));
        operador1.setText(intent.getStringExtra("numero1"));
        operador2.setText(intent.getStringExtra("numero2"));
        operador.setText(intent.getStringExtra("operador"));
        operacion.setText(intent.getStringExtra("operacion"));
        resultado.setText(intent.getStringExtra("resultado"));
    }
}