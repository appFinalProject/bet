package com.b0921234.projectfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button big=findViewById(R.id.big);
        Button single=findViewById(R.id.single);

        TextView rule=findViewById(R.id.rule);
        rule.setText("遊戲說明:\n\n您擁有本金500元，遊玩以下2關遊戲，使您的本金皆達到2000元，即為過關");  //顯示遊戲規則
    }
    public void gofinish(View v){     //結束遊戲
    finish();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.big){
            Intent it2 =new Intent(this,MainActivity2.class);
            startActivity(it2);
        }
        else if (v.getId()==R.id.single){
            Intent it3 =new Intent(this,MainActivity3.class);
            startActivity(it3);
        }
    }
}