package com.example.ManejodeWidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calcular;
    EditText prom1, prom2, prom1_lab,prom2_lab,prom3_lab,prom4_lab;
    TextView prom, result, prom_teo,prom_lab;
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calcular = (Button)findViewById(R.id.calcular);
        prom1 = (EditText)findViewById(R.id.prom1);
        prom2 = (EditText)findViewById(R.id.prom2);
        prom1_lab = (EditText)findViewById(R.id.prom1_lab);
        prom2_lab = (EditText)findViewById(R.id.prom2_lab);
        prom3_lab = (EditText)findViewById(R.id.prom3_lab);
        prom4_lab = (EditText)findViewById(R.id.prom4_lab);
        prom = (TextView)findViewById(R.id.Promedio_txt);
        result = (TextView)findViewById(R.id.result);
        prom_teo = (TextView)findViewById(R.id.prom);
        prom_lab = (TextView)findViewById(R.id.prom_lab);
        spinner1 = (Spinner)findViewById(R.id.spinner1);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
            }
        });

    }



    public void calcular(){


        String teo_prom1 = prom1.getText().toString();
        String teo_prom2 = prom2.getText().toString();
        String lab_prom1 = prom1_lab.getText().toString();
        String lab_prom2 = prom2_lab.getText().toString();
        String lab_prom3 = prom3_lab.getText().toString();
        String lab_prom4 = prom4_lab.getText().toString();

        double nota1_teo = Integer.parseInt(teo_prom1);
        double nota2_teo = Integer.parseInt(teo_prom2);
        double nota1_lab = Integer.parseInt(lab_prom1);
        double nota2_lab = Integer.parseInt(lab_prom2);
        double nota3_lab = Integer.parseInt(lab_prom3);
        double nota4_lab = Integer.parseInt(lab_prom4);

        double promedio_Teo = ((nota1_teo + nota2_teo)/2);
        double promedio_Lab = ((nota1_lab + nota2_lab + nota3_lab + nota4_lab)/4);

        int pos = spinner1.getSelectedItemPosition();

        prom_teo.setText("Prom:" + promedio_Teo);
        prom_lab.setText("Prom:" + promedio_Lab);


        if(pos == 0){


            double general0= (promedio_Teo*0.3)+(promedio_Lab*0.7);

             if(general0 >=13){

                 prom.setText("Promedio :" + general0);
                 result.setText("Aprobado!");

            }else{

                 prom.setText("Promedio:" + general0);
                 result.setText("Desaprobado!");

             }



         }else if(pos == 1){

            double general1= (promedio_Teo*0.4)+(promedio_Lab*0.6);

            if(general1 >=13){

                prom.setText("Promedio :" + general1);
                result.setText("Aprobado!");

            }else{

                prom.setText("Promedio:" + general1);
                result.setText("Desaprobado!");

            }


         }else if(pos == 2){

            double general2= (promedio_Teo*0.2)+(promedio_Lab*0.8);

            if(general2 >=13){

                prom.setText("Promedio :" + general2);
                result.setText("Aprobado!");

            }else{

                prom.setText("Promedio:" + general2);
                result.setText("Desaprobado!");

            }
        }

    }


}
