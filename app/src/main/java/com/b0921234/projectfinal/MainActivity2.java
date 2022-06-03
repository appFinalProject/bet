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
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity implements TextWatcher,RadioGroup.OnCheckedChangeListener,View.OnClickListener, AdapterView.OnItemSelectedListener {

    RadioGroup mul;
    Spinner bigor;
    TextView money;
    String[] place={"比大","比小"};
    Toast tos;
    Button button;
    EditText edtmoney;
    double mon;
    double count=500;
    int pos=0;
    TextView win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AlertDialog.Builder bdr = new AlertDialog.Builder(this);
        bdr.setMessage("請先選擇賭金倍率，並輸入您要押下的金額，再點下正下方的骰盅搖骰子 \n" +
                "按任意處關閉此交談窗");
        bdr.setTitle("WELCOME!!");
        bdr.setIcon(android.R.drawable.star_on);
        bdr.setCancelable(true);
        bdr.show();

        tos=Toast.makeText(this,"",Toast.LENGTH_SHORT);
        money = findViewById(R.id.money);
        bigor=findViewById(R.id.bigor);
        bigor.setOnItemSelectedListener(this);
        button=findViewById(R.id.button);
        button.setOnClickListener(this);
        edtmoney= findViewById(R.id.edtmoney);
        edtmoney.addTextChangedListener(this);
        mul=findViewById(R.id.mul);
        mul.setOnCheckedChangeListener(this);

        win=findViewById(R.id.win);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        position=bigor.getSelectedItemPosition();
        tos.setText("你選擇 "+place[position]);
        tos.show();

        if(position==0) {

        }
        else if(position==1){
            pos = 1;
        }
        onClick(view);

    }

    @Override
    public void onClick(View view) {
        if (edtmoney.length() == 0) {
            Toast tos = Toast.makeText(this, "請輸入押金", Toast.LENGTH_SHORT);
        } else {
            Random x = new Random();
            int me = x.nextInt(6);
            Random z = new Random();
            int you = z.nextInt(6);
            switch (me) {
                case 0:
                    findViewById(R.id.image).setVisibility(View.VISIBLE);
                    findViewById(R.id.image2).setVisibility(View.GONE);
                    findViewById(R.id.image3).setVisibility(View.GONE);
                    findViewById(R.id.image4).setVisibility(View.GONE);
                    findViewById(R.id.image5).setVisibility(View.GONE);
                    findViewById(R.id.image6).setVisibility(View.GONE);
                    break;
                case 1:
                    findViewById(R.id.image2).setVisibility(View.VISIBLE);
                    findViewById(R.id.image).setVisibility(View.GONE);
                    findViewById(R.id.image3).setVisibility(View.GONE);
                    findViewById(R.id.image4).setVisibility(View.GONE);
                    findViewById(R.id.image5).setVisibility(View.GONE);
                    findViewById(R.id.image6).setVisibility(View.GONE);
                    break;
                case 2:
                    findViewById(R.id.image3).setVisibility(View.VISIBLE);
                    findViewById(R.id.image).setVisibility(View.GONE);
                    findViewById(R.id.image2).setVisibility(View.GONE);
                    findViewById(R.id.image4).setVisibility(View.GONE);
                    findViewById(R.id.image5).setVisibility(View.GONE);
                    findViewById(R.id.image6).setVisibility(View.GONE);
                    break;
                case 3:
                    findViewById(R.id.image4).setVisibility(View.VISIBLE);
                    findViewById(R.id.image).setVisibility(View.GONE);
                    findViewById(R.id.image2).setVisibility(View.GONE);
                    findViewById(R.id.image3).setVisibility(View.GONE);
                    findViewById(R.id.image5).setVisibility(View.GONE);
                    findViewById(R.id.image6).setVisibility(View.GONE);
                    break;
                case 4:
                    findViewById(R.id.image5).setVisibility(View.VISIBLE);
                    findViewById(R.id.image).setVisibility(View.GONE);
                    findViewById(R.id.image2).setVisibility(View.GONE);
                    findViewById(R.id.image3).setVisibility(View.GONE);
                    findViewById(R.id.image4).setVisibility(View.GONE);
                    findViewById(R.id.image6).setVisibility(View.GONE);
                    break;
                case 5:
                    findViewById(R.id.image6).setVisibility(View.VISIBLE);
                    findViewById(R.id.image).setVisibility(View.GONE);
                    findViewById(R.id.image2).setVisibility(View.GONE);
                    findViewById(R.id.image3).setVisibility(View.GONE);
                    findViewById(R.id.image4).setVisibility(View.GONE);
                    findViewById(R.id.image5).setVisibility(View.GONE);
                    break;
            }
            switch (you) {
                case 0:
                    findViewById(R.id.imageView).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView2).setVisibility(View.GONE);
                    findViewById(R.id.imageView3).setVisibility(View.GONE);
                    findViewById(R.id.imageView4).setVisibility(View.GONE);
                    findViewById(R.id.imageView5).setVisibility(View.GONE);
                    findViewById(R.id.imageView6).setVisibility(View.GONE);
                    break;
                case 1:
                    findViewById(R.id.imageView2).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView).setVisibility(View.GONE);
                    findViewById(R.id.imageView3).setVisibility(View.GONE);
                    findViewById(R.id.imageView4).setVisibility(View.GONE);
                    findViewById(R.id.imageView5).setVisibility(View.GONE);
                    findViewById(R.id.imageView6).setVisibility(View.GONE);
                    break;
                case 2:
                    findViewById(R.id.imageView3).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView2).setVisibility(View.GONE);
                    findViewById(R.id.imageView).setVisibility(View.GONE);
                    findViewById(R.id.imageView4).setVisibility(View.GONE);
                    findViewById(R.id.imageView5).setVisibility(View.GONE);
                    findViewById(R.id.imageView6).setVisibility(View.GONE);
                    break;
                case 3:
                    findViewById(R.id.imageView4).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView2).setVisibility(View.GONE);
                    findViewById(R.id.imageView3).setVisibility(View.GONE);
                    findViewById(R.id.imageView).setVisibility(View.GONE);
                    findViewById(R.id.imageView5).setVisibility(View.GONE);
                    findViewById(R.id.imageView6).setVisibility(View.GONE);
                    break;
                case 4:
                    findViewById(R.id.imageView5).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView2).setVisibility(View.GONE);
                    findViewById(R.id.imageView3).setVisibility(View.GONE);
                    findViewById(R.id.imageView4).setVisibility(View.GONE);
                    findViewById(R.id.imageView).setVisibility(View.GONE);
                    findViewById(R.id.imageView6).setVisibility(View.GONE);
                    break;
                case 5:
                    findViewById(R.id.imageView6).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView2).setVisibility(View.GONE);
                    findViewById(R.id.imageView3).setVisibility(View.GONE);
                    findViewById(R.id.imageView4).setVisibility(View.GONE);
                    findViewById(R.id.imageView5).setVisibility(View.GONE);
                    findViewById(R.id.imageView).setVisibility(View.GONE);
                    break;
            }

             switch (pos){
                case 0:
                    if (me >= you) {
                        count = count+mon;
                    }
                    else {
                        count =count-mon;
                    }
                case 1:
                    if (me <= you) {
                        count = count+mon;
                    }
                    else {
                        count =count-mon;
                    }
            }

            money.setText("目前金額:" + count+"元");
            if(count>=2000){
                win.setVisibility(View.VISIBLE);
                win.setText("您已過關!");
                win.setTextColor(Color.parseColor("#E91E63"));
                win.setBackgroundColor(Color.parseColor("#FAF493"));
            }
        }
    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {

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

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        String str=edtmoney.getText().toString();
        try{
            mon=Double.parseDouble(str);
        }catch (Exception e){
            mon=0;
        }
        Random x = new Random();
        int me = x.nextInt(6);
        Random z = new Random();
        int you = z.nextInt(6);
        switch (mul.getCheckedRadioButtonId()){
            case R.id.x3:
                mon*=3;
                break;
            case R.id.x5:
                mon*=5;
                break;
            case R.id.x10:
                mon*=10;
                break;
        }

    }
}