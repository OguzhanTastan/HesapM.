package com.example.steam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    float valueOne , valueTwo ;
    boolean  Add , Sub ,Div , Mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById((R.id.btn8));
        Button btn9 = (Button) findViewById(R.id.btn9);
        final Button datBtn = (Button) findViewById(R.id.datBtn);
        final Button estBtn = (Button) findViewById(R.id.estBtn);
        final Button topBtn = (Button) findViewById(R.id.topBtn);
        final Button cıkBtn = (Button) findViewById(R.id.cıkBtn);
        final Button carpBtn = (Button) findViewById(R.id.carpBtn);
        final Button bolBtn = (Button) findViewById(R.id.bolBtn);
        Button cBtn = (Button) findViewById(R.id.cBtn);
        final TextView editText = (TextView) findViewById(R.id.editText);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");
            }
        });


        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");

            }
        });

        datBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + ".");
            }
        });

        topBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    Add = true;
                    editText.setText(null);
                }
            }
        });

        cıkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Float.parseFloat(editText.getText() + "");
                Sub = true;
                editText.setText(null);
            }
        });

        carpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Float.parseFloat(editText.getText() + "");
                Mul = true;
                editText.setText(null);

            }
        });

        bolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Float.parseFloat(editText.getText() + "");
                Div = true;
                editText.setText(null);


            }
        });

        estBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valueTwo =Float.parseFloat(editText.getText() + "");





                if (Add == true) {

                    editText.setText(valueOne + valueTwo + "");
                    Add = false;
                }
                if (Sub == true) {
                    editText.setText(valueOne - valueTwo + "");
                    Sub = false;
                }
                if (Mul == true) {
                    editText.setText(valueOne * valueTwo + "");
                }
                Mul = false;
                if (Div == true) {
                    editText.setText(valueOne / valueTwo + "");
                    Div = false;
                }



            }
        });



    }






}
