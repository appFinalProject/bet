package com.b0921234.projectfinal;

import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity implements TextWatcher,View.OnClickListener{
    TextView rest,show;
    Toast tos1;
    Button guess;
    EditText edt;

    int time=7;
    Random y = new Random();
    int pass = y.nextInt(99);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        AlertDialog.Builder bdr1=new AlertDialog.Builder(this);
        bdr1.setMessage("為了把炸彈引爆，您需要在7次內成功猜出密碼，每輸入一次數字，會有提示協助\n祝您成功!\n" +
                "按任意處關閉此交談窗");
        bdr1.setTitle("WELCOME!!");
        bdr1.setIcon(android.R.drawable.star_on);
        bdr1.setCancelable(true);
        bdr1.show();

        tos1=Toast.makeText(this,"",Toast.LENGTH_SHORT);

        guess=findViewById(R.id.guess);
        edt=findViewById(R.id.edt);
        //vic=findViewById(R.id.vic);
        rest=findViewById(R.id.rest);
        show=findViewById(R.id.show);
        guess.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int input = Integer.parseInt(edt.getText().toString());
        if (input >= 0 && input <= 99) {
            if (time <= 0) {
                show.setText("遊戲結束\n");
                findViewById(R.id.bomb).setVisibility(View.GONE);
                findViewById(R.id.boom).setVisibility(View.VISIBLE);
            } else if (time > 0) {


                    if (pass != input) {
                        time = time - 1;
                        rest.setText("剩餘次數: " + time + "次");
                        if (pass > input) {
                            show.setText(input + " 這個數字太小囉~ \n");
                        }
                        if (pass < input) {
                            show.setText(input + " 這個數字太大囉~ \n");
                        }
                    } else if (pass == input) {
                        show.setText("密碼是: " + pass + "恭喜!您答對了!\n");

                    } else {

                    }
                
            }

        }
        else
            show.setText("請輸入0~99之間的數字!!");
    }




    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}