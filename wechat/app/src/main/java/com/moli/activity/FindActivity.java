package com.moli.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        TextView jiahao=(TextView) findViewById(R.id.tv_jiahao);
        TextView fangdajing=(TextView) findViewById(R.id.tv_fangfajing);
       // TextView pengyouquan=(TextView) findViewById(R.id.af_pengyouquan) ;
        TextView yaoyiyao=(TextView) findViewById(R.id.af_yaoyiyao);
        TextView fujinderen=(TextView) findViewById(R.id.af_fujinderen);
        Button laiotian=(Button) findViewById(R.id.bt_liaotian);
        Button tongxunlu=(Button) findViewById(R.id.bt_tongxunlu);
        Button faxian=(Button) findViewById(R.id.bt_faxian);
        Button wode=(Button) findViewById(R.id.bt_wode);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"iconfont.ttf");
        jiahao.setTypeface(typeface);
        jiahao.setText(getResources().getString(R.string.jiahao));
        fangdajing.setTypeface(typeface);
        fangdajing.setText(getResources().getString(R.string.fangdajing));
      /*  pengyouquan.setTypeface(typeface);
        pengyouquan.setText(getResources().getString(R.string.pengyouquan));*/
        yaoyiyao.setTypeface(typeface);
        yaoyiyao.setText(getResources().getString(R.string.yaoyiyao));
        fujinderen.setTypeface(typeface);
        fujinderen.setText(getResources().getString(R.string.fujinderen));

        laiotian.setTypeface(typeface);
        laiotian.setText(getResources().getString(R.string.liaotian));
        tongxunlu.setTypeface(typeface);
        tongxunlu.setText(getResources().getString(R.string.tongxunlu));
        faxian.setTypeface(typeface);
        faxian.setText(getResources().getString(R.string.faxian));
        wode.setTypeface(typeface);
        wode.setText(getResources().getString(R.string.wode));

        Button liaotian_button=(Button) findViewById(R.id.bt_liaotian);
        liaotian_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FindActivity.this,WechatActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button wode_button=(Button) findViewById(R.id.bt_wode);
        wode_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FindActivity.this,MeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button tongxunlu_button=(Button) findViewById(R.id.bt_tongxunlu);
        tongxunlu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FindActivity.this,MaillistActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
