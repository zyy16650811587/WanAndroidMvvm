package com.zyy.wanandroidmvvm;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.zyy.wanandroidmvvm.bean.LoginBean;
import com.zyy.wanandroidmvvm.factory.LoginFactory;
import com.zyy.wanandroidmvvm.uitle.SpUtil;

import java.util.HashMap;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar mZhuTb;
    private ImageView mZhuIm;
    private TextView mName;
    private TextView mPass;
    private Button mBnt;
    private TextView mZhanghaoTv;
    private Intent loginIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        loginIntent = getIntent();
        initView();
    }

    private void initView() {
        mZhuTb = (Toolbar) findViewById(R.id.tb_zhu);
        setSupportActionBar(mZhuTb);
        mZhuIm = (ImageView) findViewById(R.id.im_zhu);
        mName = (TextView) findViewById(R.id.name);
        mPass = (TextView) findViewById(R.id.pass);
        mBnt = (Button) findViewById(R.id.bnt);
        mBnt.setOnClickListener(this);
        mZhanghaoTv = (TextView) findViewById(R.id.tv_zhanghao);
        mZhanghaoTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivityForResult(intent,100);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bnt:
                String name = mName.getText().toString().trim();
                String pass = mPass.getText().toString().trim();

                if(!TextUtils.isEmpty(name)){
                    if(!TextUtils.isEmpty(pass)){
                        initLogin(name,pass);
                    }else {
                        Toast.makeText(this, "密码不正确", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(this, "用户名不正确", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }

    private void initLogin(final String name, String pass) {
        HashMap<String, String> loginHash = new HashMap<>();
        loginHash.put("username",name);
        loginHash.put("password",pass);
        LoginFactory loginFactory = new ViewModelProvider(this).get(LoginFactory.class);
        loginFactory.setMyRegister(loginHash).observe(this, new Observer<LoginBean>() {
            @Override
            public void onChanged(LoginBean loginBean) {
                if (loginBean.getErrorCode() == 0){
                    Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();

                    SpUtil.setParam("token",loginBean.getData().getId());

                    loginIntent.putExtra("userName",name);
                    setResult(200,loginIntent);
                    finish();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == 200){
            String reName = data.getStringExtra("name");
            String rePass = data.getStringExtra("pass");
            mName.setText(reName);
            mPass.setText(rePass);
        }
    }
}
