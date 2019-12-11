package com.moli.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.moli.adapter.PersonAdapter;
import com.moli.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class WechatActivity extends AppCompatActivity {
    private List<Person> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView jiahao = (TextView) findViewById(R.id.tv_jiahao);
        TextView fangdajing = (TextView) findViewById(R.id.tv_fangfajing);
        Button laiotian = (Button) findViewById(R.id.bt_liaotian);
        Button tongxunlu = (Button) findViewById(R.id.bt_tongxunlu);
        Button faxian = (Button) findViewById(R.id.bt_faxian);
        Button wode = (Button) findViewById(R.id.bt_wode);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "iconfont.ttf");
        jiahao.setTypeface(typeface);
        jiahao.setText(getResources().getString(R.string.jiahao));
        fangdajing.setTypeface(typeface);
        fangdajing.setText(getResources().getString(R.string.fangdajing));

        laiotian.setTypeface(typeface);
        laiotian.setText(getResources().getString(R.string.liaotian));
        tongxunlu.setTypeface(typeface);
        tongxunlu.setText(getResources().getString(R.string.tongxunlu));
        faxian.setTypeface(typeface);
        faxian.setText(getResources().getString(R.string.faxian));
        wode.setTypeface(typeface);
        wode.setText(getResources().getString(R.string.wode));

        initPerson();
        PersonAdapter adapter=new PersonAdapter(WechatActivity.this,R.layout.person_item,personList);
        ListView listView=(ListView) findViewById(R.id.list_view_wechat);
        listView.setAdapter(adapter);


        Button faxian_button=(Button) findViewById(R.id.bt_faxian);
        faxian_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WechatActivity.this,FindActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button wode_button=(Button) findViewById(R.id.bt_wode);
        wode_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WechatActivity.this,MeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button tongxunlu_button=(Button) findViewById(R.id.bt_tongxunlu);
        tongxunlu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WechatActivity.this,MaillistActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    private void initPerson() {
        for (int i = 0; i < 3; i++) {
            Person p1 = new Person("张小一", R.drawable.img_2,"茕茕孑立，沆瀣一气。","早上9:50");
            personList.add(p1);
            Person p2 = new Person("赵小饼", R.drawable.img_1,"我是真的傻透顶了！","昨天");
            personList.add(p2);
            Person p3 = new Person("闫小二", R.drawable.img_3,"我就想说是真的呵呵...","下午20:05");
            personList.add(p3);
        }
    }
}
