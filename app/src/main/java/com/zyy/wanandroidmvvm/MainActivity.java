package com.zyy.wanandroidmvvm;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.google.android.material.navigation.NavigationView;
import com.zyy.wanandroidmvvm.fragment.DaohangFragment;
import com.zyy.wanandroidmvvm.fragment.NewFragment;
import com.zyy.wanandroidmvvm.fragment.ShouyeFragment;
import com.zyy.wanandroidmvvm.fragment.XiangmuFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    private Toolbar tb;
  private FrameLayout fl;
    private BottomNavigationBar bnb;
    private LinearLayout ll;
    private NavigationView nav;
    //默认选择第一个fragment
    private int lastSelectedPosition = 5;
    private FragmentManager sm;
    private DrawerLayout dl;
    private TextView tv_header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {

    }


    @SuppressLint("ResourceAsColor")
    private void initView() {
        tb = (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(tb);
        fl = (FrameLayout) findViewById(R.id.fl1111);
        bnb = (BottomNavigationBar) findViewById(R.id.bnb);
        ll = (LinearLayout) findViewById(R.id.ll);
        nav = (NavigationView) findViewById(R.id.nav);
        dl = (DrawerLayout) findViewById(R.id.dl);
       dl.addDrawerListener(new DrawerLayout.DrawerListener() {
           @Override
           public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
               int right = drawerView.getRight();
               ll.setX(right);
           }

           @Override
           public void onDrawerOpened(@NonNull View drawerView) {

           }

           @Override
           public void onDrawerClosed(@NonNull View drawerView) {

           }

           @Override
           public void onDrawerStateChanged(int newState) {

           }
       });

       //主标题
       tb.setTitle("首页");
       //Logo
     //  tb.setLogo(R.mipmap.ic_launcher);
       //副标题
//       tb.setSubtitle("Wanandroid");
       //主标题颜色
   //    tb.setTitleTextColor(R.color.colorWhite);
        //副标题颜色
        tb.setSubtitleTextColor(R.color.colorPrimary);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, dl, tb, R.string.app_name, R.string.app_name);
        dl.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu1:
                        Toast.makeText(MainActivity.this, "出来了", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu2:

                        break;
                    case R.id.menu3:

                        break;

                }
                return false;
            }
        });

        View headerView = nav.getHeaderView(0);
        ImageView image_item = headerView.findViewById(R.id.image_item);
        tv_header = headerView.findViewById(R.id.tv);
        image_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivityForResult(intent,100);
            }
        });



        final ShouyeFragment shouyeFragment = new ShouyeFragment();
        final NewFragment newFragment = new NewFragment();
        final DaohangFragment daohangFragment = new DaohangFragment();
        final XiangmuFragment xiangmuFragment = new XiangmuFragment();
        sm = getSupportFragmentManager();
        sm.beginTransaction()
                .add(R.id.fl1111, shouyeFragment)
                .add(R.id.fl1111, newFragment)
                .add(R.id.fl1111, daohangFragment)
                .add(R.id.fl1111, xiangmuFragment)
                .show(shouyeFragment)
                .hide(newFragment)
                .hide(daohangFragment)
                .hide(xiangmuFragment)
                .commit();
        bnb

                .setMode(BottomNavigationBar.MODE_FIXED)
                /**
                 *  setMode() 内的参数有三种模式类型：
                 *  MODE_DEFAULT 自动模式：导航栏Item的个数<=3 用 MODE_FIXED 模式，否则用 MODE_SHIFTING 模式
                 *  MODE_FIXED 固定模式：未选中的Item显示文字，无切换动画效果。
                 *  MODE_SHIFTING 切换模式：未选中的Item不显示文字，选中的显示文字，有切换动画效果。
                 */
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
                /**
                 *  setBackgroundStyle() 内的参数有三种样式
                 *  BACKGROUND_STYLE_DEFAULT: 默认样式 如果设置的Mode为MODE_FIXED，将使用BACKGROUND_STYLE_STATIC
                 *                                    如果Mode为MODE_SHIFTING将使用BACKGROUND_STYLE_RIPPLE。
                 *  BACKGROUND_STYLE_STATIC: 静态样式 点击无波纹效果
                 *  BACKGROUND_STYLE_RIPPLE: 波纹样式 点击有波纹效果
                 */
                .setActiveColor("#FF107FFD") //选中颜色
                .setInActiveColor("#808080") //未选中颜色
                .setBarBackgroundColor("#ffffff");//导航栏背景色

        bnb.addItem(new BottomNavigationItem(R.drawable.shape1, "首页"))
                .addItem(new BottomNavigationItem(R.drawable.shape1, "知识体系"))
                .addItem(new BottomNavigationItem(R.drawable.shape1, "导航"))
                .addItem(new BottomNavigationItem(R.drawable.shape1, "项目"))
                .setFirstSelectedPosition(lastSelectedPosition)
                .initialise();
        bnb.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                if (position == 0) {
                    sm.beginTransaction().show(shouyeFragment)
                            .hide(newFragment).hide(daohangFragment)
                            .hide(xiangmuFragment)
                            .commit();

                } else if (position == 1) {
                    sm.beginTransaction().show(newFragment)
                            .hide(shouyeFragment).hide(daohangFragment)
                            .hide(xiangmuFragment)
                            .commit();

                } else if (position == 2) {
                    sm.beginTransaction().show(daohangFragment)
                            .hide(newFragment).hide(shouyeFragment)
                            .hide(xiangmuFragment)
                            .commit();
                } else {
                    sm.beginTransaction().show(xiangmuFragment)
                            .hide(newFragment).hide(shouyeFragment)
                            .hide(daohangFragment)
                            .commit();
                }
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == 200){
            String userName = data.getStringExtra("userName");
            tv_header.setText(userName);
        }
    }
}
