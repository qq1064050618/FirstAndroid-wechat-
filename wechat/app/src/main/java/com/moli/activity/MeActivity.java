package com.moli.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        TextView xiangji=(TextView) findViewById(R.id.am_zhaoxiangji);
        TextView xiangce=(TextView) findViewById(R.id.am_xiangce);
        TextView biaoqing=(TextView) findViewById(R.id.am_biaoqing);
        TextView shezhi=(TextView) findViewById(R.id.am_shezhi);
        Button laiotian=(Button) findViewById(R.id.bt_liaotian);
        Button tongxunlu=(Button) findViewById(R.id.bt_tongxunlu);
        Button faxian=(Button) findViewById(R.id.bt_faxian);
        Button wode=(Button) findViewById(R.id.bt_wode);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"iconfont.ttf");
        xiangji.setTypeface(typeface);
        xiangji.setText(getResources().getString(R.string.xiangji));

        xiangce.setTypeface(typeface);
        xiangce.setText(getResources().getString(R.string.xiagnce));
        biaoqing.setTypeface(typeface);
        biaoqing.setText(getResources().getString(R.string.biaoqing));
        shezhi.setTypeface(typeface);
        shezhi.setText(getResources().getString(R.string.shezhi));

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
                Intent intent=new Intent(MeActivity.this,WechatActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button faxian_button=(Button) findViewById(R.id.bt_faxian);
        faxian_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MeActivity.this,FindActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button tongxunlu_button=(Button) findViewById(R.id.bt_tongxunlu);
        tongxunlu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MeActivity.this,MaillistActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
