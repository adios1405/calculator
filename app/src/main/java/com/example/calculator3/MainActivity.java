package com.example.calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_sum,btn_sub,btn_div,btn_mul,btn_equ,btn_c;
    private TextView cal_result;
    private boolean isclickequ = false;
    private String strnum1,strsnum2="";
    private Double num1,num2=0.0;
    private String op = "";
    private double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal_result = findViewById(R.id.result);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_sub = findViewById(R.id.btn_sub);
        btn_sum = findViewById(R.id.btn_sum);
        btn_div = findViewById(R.id.btn_div);
        btn_equ = findViewById(R.id.btn_equ);
        btn_mul = findViewById(R.id.btn_mul);
        btn_c = findViewById(R.id.btn_c);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_sum.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_equ.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_c.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_0:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText(cal_result.getText().toString()+"0");
                break;
            case R.id.btn_1:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText(cal_result.getText().toString()+"1");
                break;
            case R.id.btn_2:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText(cal_result.getText().toString()+"2");
                break;
            case R.id.btn_3:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText(cal_result.getText().toString()+"3");
                break;
            case R.id.btn_4:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText(cal_result.getText().toString()+"4");
                break;
            case R.id.btn_5:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText(cal_result.getText().toString()+"5");
                break;
            case R.id.btn_6:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText(cal_result.getText().toString()+"6");
                break;
            case R.id.btn_7:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText(cal_result.getText().toString()+"7");
                break;
            case R.id.btn_8:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText(cal_result.getText().toString()+"8");
                break;
            case R.id.btn_9:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText(cal_result.getText().toString()+"9");
                break;
            case R.id.btn_c:
                if (isclickequ){
                    cal_result.setText("");
                    isclickequ = false;
                }
                cal_result.setText("");
                break;
            case R.id.btn_sum:
                strnum1 = cal_result.getText().toString();
                if (strnum1.equals("")){
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                cal_result.setText("");
                op = "+";
                isclickequ = false;
                break;
            case R.id.btn_sub:
                strnum1 = cal_result.getText().toString();
                if (strnum1.equals("")){
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                cal_result.setText("");
                op = "-";
                isclickequ = false;
                break;
            case R.id.btn_mul:
                strnum1 = cal_result.getText().toString();
                if (strnum1.equals("")){
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                cal_result.setText("");
                op = "X";
                isclickequ = false;
                break;
            case R.id.btn_div:
                strnum1 = cal_result.getText().toString();
                if (strnum1.equals("")){
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                cal_result.setText("");
                op = "÷";
                isclickequ = false;
                break;
            case R.id.btn_equ:
                strsnum2 = cal_result.getText().toString();
                if (strsnum2.equals("")){
                    break;
                }
                num2 = Double.parseDouble(strsnum2);
                cal_result.setText("");
                switch (op){
                    case "+":
                        result = num1+num2;
                        break;
                    case "-":
                        result = num1-num2;
                        break;
                    case "X":
                        result = num1*num2;
                        break;
                    case "÷":
                        if (num2==0){
                            break;
                        }
                        result = num1/num2;
                        break;
                    default:
                        result = 0.0;
                        break;
                }
                cal_result.setText(result+"");
                op = "";
                isclickequ = true;
        }
    }

}