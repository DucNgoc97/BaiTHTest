package com.example.admin.baithtest;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {
    EditText edtresult;
    Button btclear,btdaonguoc,btdelete,btchia,btnhan,bttru,btcong,btbang,btcham,btphantram,btcan2,btphanX,btxmun,
            bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btsin,btcos,bttan,btcot;
    float a=0,b=0;
    boolean isxoa=false;
    char pheptoan='0';

    private View.OnClickListener onclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.bt0:
                    bt0_onClick();
                    break;
                case R.id.bt1:
                    bt1_onClick();
                    break;
                case R.id.bt2:
                    bt2_onClick();
                    break;
                case R.id.bt3:
                    bt3_onClick();
                    break;
                case R.id.bt4:
                    bt4_onClick();
                    break;
                case R.id.bt5:
                    bt5_onClick();
                    break;
                case R.id.bt6:
                    bt6_onClick();
                    break;
                case R.id.bt7:
                    bt7_onClick();
                    break;
                case R.id.bt8:
                    bt8_onClick();
                    break;
                case R.id.bt9:
                    bt9_onClick();
                    break;
                case R.id.btchia:
                    btchia_onClick();
                    break;
                case R.id.btnhan:
                    btnhan_onClick();
                    break;
                case R.id.bttru:
                    bttru_onClick();
                    break;
                case R.id.btcong:
                    btcong_onClick();
                    break;
                case R.id.btcham:
                    btcham_onClick();
                    break;
                case R.id.btphantram:
                    btphantram_onClick();
                    break;
                case R.id.btcan2:
                    btcan2_onClick();
                    break;
                case R.id.btphanX:
                    btphanX_onClick();
                    break;
                case R.id.btxmun:
                    btxmun_onClick();
                    break;
                case R.id.btclear:
                    btclear_onClick();
                    break;
                case R.id.btdelete:
                    btdelete_onClick();
                    break;
                case R.id.btbang:
                    btbang_onClick();
                    break;
                case R.id.btdaonguoc:
                    btdaonguoc_onClick();
                    break;
                case R.id.btsin:
                    btsin_onClick();
                    break;
                case R.id.btcos:
                    btcos_onClick();
                    break;
                case R.id.bttan:
                    bttan_onClick();
                    break;
                case R.id.btcot:
                    btcot_onClick();
                    break;
            }
        }
    };
    private void bt9_onClick() {
        if(isxoa){
            edtresult.setText("9");
            isxoa=false;
        }
        else
            edtresult.setText(edtresult.getText()+"9");
    }

    private void bt8_onClick() {
        if(isxoa){
            edtresult.setText("8");
            isxoa=false;
        }
        else
            edtresult.setText(edtresult.getText()+"8");
    }

    private void bt7_onClick() {
        if(isxoa){
            edtresult.setText("7");
            isxoa=false;
        }
        else
            edtresult.setText(edtresult.getText()+"7");
    }

    private void bt6_onClick() {
        if(isxoa){
            edtresult.setText("6");
            isxoa=false;
        }
        else
            edtresult.setText(edtresult.getText()+"6");
    }

    private void bt5_onClick() {
        if(isxoa){
            edtresult.setText("5");
            isxoa=false;
        }
        else
            edtresult.setText(edtresult.getText()+"5");
    }

    private void bt4_onClick() {
        if(isxoa){
            edtresult.setText("4");
            isxoa=false;
        }
        else
            edtresult.setText(edtresult.getText()+"4");
    }

    private void bt3_onClick() {
        if(isxoa){
            edtresult.setText("3");
            isxoa=false;
        }
        else
            edtresult.setText(edtresult.getText()+"3");
    }

    private void bt2_onClick() {
        if(isxoa){
            edtresult.setText("2");
            isxoa=false;
        }
        else
            edtresult.setText(edtresult.getText()+"2");
    }

    private void bt1_onClick() {
        if(isxoa){
            edtresult.setText("1");
            isxoa=false;
        }
        else
            edtresult.setText(edtresult.getText()+"1");
    }

    private void bt0_onClick() {
        if(isxoa){
            edtresult.setText("0");
            isxoa=false;
        }
        else
            edtresult.setText(edtresult.getText()+"0");
    }

    private void btcot_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a = Float.parseFloat(edtresult.getText().toString().trim());
            double c = Math.cos(a)/Math.sin(a);
            edtresult.setText(c+"");
            isxoa = true;
        }
    }

    private void bttan_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a = Float.parseFloat(edtresult.getText().toString().trim());
            double c = Math.tan(a);
            edtresult.setText(c+"");
            isxoa = true;
        }
    }

    private void btcos_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a = Float.parseFloat(edtresult.getText().toString().trim());
            double c = Math.cos(a);
            edtresult.setText(c+"");
            isxoa = true;
        }
    }

    private void btsin_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a = Float.parseFloat(edtresult.getText().toString().trim());
            double c = Math.sin(a);
            edtresult.setText(c+"");
            isxoa = true;
        }
    }

    private void btdaonguoc_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a=Float.parseFloat(edtresult.getText().toString().trim());
            a*=(-1);
            edtresult.setText(a+"");
            isxoa=false;
        }
    }

    private void btdelete_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            String s = edtresult.getText().toString().trim();
            s = s.substring(0, s.length() - 1);
            edtresult.setText(s);
        }
    }

    private void btclear_onClick() {
        edtresult.setText("");
        a=0;
        b=0;
        isxoa=false;
        pheptoan='0';
    }

    private void btxmun_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a =Float.parseFloat(edtresult.getText().toString().trim());
            isxoa=true;
            pheptoan='b';
        }
    }

    private void btphanX_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a = Float.parseFloat(edtresult.getText().toString().trim());
            b = 1/a;
            edtresult.setText(b+"");
        }
    }

    private void btcan2_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a = Float.parseFloat(edtresult.getText().toString().trim());
            b= (float) Math.sqrt(a);
            edtresult.setText(b+"");
            isxoa=true;
        }
    }

    private void btphantram_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a = Float.parseFloat(edtresult.getText().toString().trim());
            b=a / 100;
            edtresult.setText(b+"");
            isxoa=true;
        }
    }

    private void btcham_onClick() {
        edtresult.setText(edtresult.getText()+".");
    }

    private void btcong_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a =Float.parseFloat(edtresult.getText().toString().trim());
            isxoa=true;
            pheptoan='c';
        }
    }

    private void bttru_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a =Float.parseFloat(edtresult.getText().toString().trim());
            isxoa=true;
            pheptoan='t';
        }
    }

    private void btnhan_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a =Float.parseFloat(edtresult.getText().toString().trim());
            isxoa=true;
            pheptoan='n';
        }
    }

    private void btchia_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            a =Float.parseFloat(edtresult.getText().toString().trim());
            isxoa=true;
            pheptoan='h';
        }
    }

    private void btbang_onClick() {
        if(edtresult.getText().toString().isEmpty()){
            Toast.makeText(this,"Vui lòng nhập",Toast.LENGTH_SHORT).show();
        }else {
            b =Float.parseFloat(edtresult.getText().toString().trim());
            float kq=0;
            switch (pheptoan){
                case 'c':
                    kq=a+b;
                    break;
                case 't':
                    kq=a-b;
                    break;
                case 'n':
                    kq=a*b;
                    break;
                case 'h':
                    kq=a/b;
                    break;
                case 'b':
                    kq=(float)Math.pow(a,b);
                    break;
            }
            edtresult.setText(kq+"");
            isxoa=false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtresult=findViewById(R.id.edtresult);
        btclear=findViewById(R.id.btclear);
        btdaonguoc=findViewById(R.id.btdaonguoc);
        btdelete=findViewById(R.id.btdelete);
        btchia=findViewById(R.id.btchia);
        btnhan=findViewById(R.id.btnhan);
        bttru=findViewById(R.id.bttru);
        btcong=findViewById(R.id.btcong);
        btbang=findViewById(R.id.btbang);
        btcham=findViewById(R.id.btcham);
        btphantram=findViewById(R.id.btphantram);
        btcan2=findViewById(R.id.btcan2);
        btphanX=findViewById(R.id.btphanX);
        btxmun=findViewById(R.id.btxmun);
        bt0=findViewById(R.id.bt0);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt5=findViewById(R.id.bt5);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);
        btsin=findViewById(R.id.btsin);
        btcos=findViewById(R.id.btcos);
        bttan=findViewById(R.id.bttan);
        btcot=findViewById(R.id.btcot);

        bt0.setOnClickListener(onclick);
        bt1.setOnClickListener(onclick);
        bt2.setOnClickListener(onclick);
        bt3.setOnClickListener(onclick);
        bt4.setOnClickListener(onclick);
        bt5.setOnClickListener(onclick);
        bt6.setOnClickListener(onclick);
        bt7.setOnClickListener(onclick);
        bt8.setOnClickListener(onclick);
        bt9.setOnClickListener(onclick);
        btchia.setOnClickListener(onclick);
        btnhan.setOnClickListener(onclick);
        bttru.setOnClickListener(onclick);
        btcong.setOnClickListener(onclick);
        btcham.setOnClickListener(onclick);
        btphantram.setOnClickListener(onclick);
        btcan2.setOnClickListener(onclick);
        btphanX.setOnClickListener(onclick);
        btxmun.setOnClickListener(onclick);
        btclear.setOnClickListener(onclick);
        btdelete.setOnClickListener(onclick);
        btbang.setOnClickListener(onclick);
        btdaonguoc.setOnClickListener(onclick);
        btsin.setOnClickListener(onclick);
        btcos.setOnClickListener(onclick);
        bttan.setOnClickListener(onclick);
        btcot.setOnClickListener(onclick);
    }
}