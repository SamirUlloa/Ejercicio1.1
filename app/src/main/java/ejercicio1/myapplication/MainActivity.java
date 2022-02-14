package ejercicio1.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String resultado;
    Button btnSumar;
    Button btnRestar;
    Button btnDividir;
    Button btnMultiplicar;

    EditText txtN1;
    EditText txtN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtN1 = findViewById(R.id.txtNum1);
        txtN2 = findViewById(R.id.txtNum2);

        btnSumar = findViewById(R.id.btnSuma);
        btnRestar = findViewById(R.id.btnResta);
        btnDividir = findViewById(R.id.btnDivision);
        btnMultiplicar = findViewById(R.id.btnMultipli);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = (suma(Integer.parseInt(txtN1.getText().toString()), Integer.parseInt(txtN2.getText().toString()))+"");

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("tipo", "Operación Suma");
                intent.putExtra("operador", "+");
                intent.putExtra("numero1", txtN1.getText().toString());
                intent.putExtra("numero2", txtN2.getText().toString());
                intent.putExtra("operacion", "El Resultado de la Suma es: " + resultado);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = (resta(Integer.parseInt(txtN1.getText().toString()), Integer.parseInt(txtN2.getText().toString()))+"");

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("tipo", "Operación Resta");
                intent.putExtra("numero1", txtN1.getText().toString());
                intent.putExtra("numero2", txtN2.getText().toString());
                intent.putExtra("operador", "-");
                intent.putExtra("operacion", "El Resultado de la Resta es: " + resultado);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = (division(Double.parseDouble(txtN1.getText().toString()), Double.parseDouble(txtN2.getText().toString()))+"");

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("tipo", "Operación División");
                intent.putExtra("numero1", txtN1.getText().toString());
                intent.putExtra("numero2", txtN2.getText().toString());
                intent.putExtra("operador", "÷");
                intent.putExtra("operacion", "El Resultado de la División es: " + resultado);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = (multiplicacion(Integer.parseInt(txtN1.getText().toString()), Integer.parseInt(txtN2.getText().toString()))+"");

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("tipo", "Operación Multiplicación");
                intent.putExtra("numero1", txtN1.getText().toString());
                intent.putExtra("numero2", txtN2.getText().toString());
                intent.putExtra("operador", "*");
                intent.putExtra("operacion", "El Resultado de la Multiplicación es: " + resultado);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });
    }
    public int suma (int a, int b){
        return a + b;
    }

    public int resta (int a, int b){
        return a - b;
    }

    public double division (double a, double b) {
        double valor = 0;
        if(b!=0){
            valor = a / b;
        }
        return valor;
    }

    public int multiplicacion (int a, int b) {
        return a * b;
    }
}