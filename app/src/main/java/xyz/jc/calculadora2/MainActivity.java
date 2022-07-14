package xyz.jc.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;


    private TextView text_resultado;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_resultado = findViewById(R.id.resultado);

        edit_numero_uno = findViewById(R.id.num1);
        edit_numero_dos = findViewById(R.id.num2);


        btn_suma = findViewById(R.id.buttonSuma);
        btn_suma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                text_resultado.setText( suma( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");
            }
        });

        btn_resta = findViewById(R.id.buttonResta);
        btn_resta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                text_resultado.setText( resta( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_multiplicacion = findViewById(R.id.buttonMultip);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                text_resultado.setText( multiplicacion( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_division = findViewById(R.id.buttonDiv);
        btn_division.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                text_resultado.setText( division( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

    }

    public double suma (int a, int b){
        return a+b;
    }

    public double resta (int a, int b){
        return a-b;
    }

    public double multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b)
    {
        int resultado = 0;

        if (b!=0)
        {
            resultado=a/b;
        }

        return resultado;
    }
}