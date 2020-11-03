package com.zyy.wanandroidmvvm;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zyy.wanandroidmvvm.bean.RegisterBean;
import com.zyy.wanandroidmvvm.factory.RegisFactory;

import java.util.HashMap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mNameEt;
    private EditText mPassEt;
    private EditText mNewpassEt;
    private Button mBnt;
    private TextView mTbTv;
    private Toolbar mTb;
    private String name;
    private String pass;
    private String newpass;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        intent = getIntent();

        initView();


    }



    private void initView() {
        mNameEt = (EditText) findViewById(R.id.et_name);
        mPassEt = (EditText) findViewById(R.id.et_pass);
        mNewpassEt = (EditText) findViewById(R.id.et_newpass);
        mBnt = (Button) findViewById(R.id.bnt);
        mBnt.setOnClickListener(this);
        mTbTv = (TextView) findViewById(R.id.tv_tb);
        mTb = (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(mTb);
        mTb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });






    }

    private void iniData(String name, String pass, String newpass) {
        if(!TextUtils.isEmpty(name)){
            if(!TextUtils.isEmpty(pass)){
                if(!TextUtils.isEmpty(newpass)&& pass.equals(newpass)){
                    initRegister(name,pass,newpass);
                }else {
                    Toast.makeText(this, "两次密码不一致", Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(this, "密码不正确", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this, "用户名不正确", Toast.LENGTH_SHORT).show();
        }


    }

    private void initRegister(final String name, final String pass, String newpass) {
        final HashMap<String, String> map = new HashMap<>();
        map.put("username",name);
        map.put("password",pass);
        map.put("repassword",newpass);
        final RegisFactory regisFactory = new ViewModelProvider(this).get(RegisFactory.class);
        regisFactory.setMyRegister(map).observe(this, new Observer<RegisterBean>() {
            @Override
            public void onChanged(RegisterBean registerBean) {
               if(registerBean.getErrorCode()==0){
                intent.putExtra("name",name);
                intent.putExtra("pass",pass);
                setResult(200,intent);
                   Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                finish();
               }else {
                   Log.e("TAG Register ERROR==",registerBean.getErrorMsg()+registerBean.getErrorCode()); 
               }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bnt:
                name = mNameEt.getText().toString().trim();
                pass = mPassEt.getText().toString().trim();
                newpass = mNewpassEt.getText().toString().trim();
                iniData(name, pass, newpass);
                break;
            default:
                break;
        }
    }
}
