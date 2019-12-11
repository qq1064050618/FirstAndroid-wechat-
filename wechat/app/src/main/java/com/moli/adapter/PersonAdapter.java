package com.moli.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.moli.activity.R;
import com.moli.entity.Person;

import java.util.List;

public class PersonAdapter extends ArrayAdapter<Person> {
    private int resoutceId;
    public PersonAdapter(@NonNull Context context, int textViewResourceId, @NonNull List<Person> objects) {
        super(context, textViewResourceId, objects);
        resoutceId=textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Person person=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resoutceId,parent,false);
        ImageView personImage=(ImageView) view.findViewById(R.id.person_image);
        TextView personNmae=(TextView) view.findViewById(R.id.person_name);
        TextView personWord=(TextView) view.findViewById(R.id.person_word);
        TextView personTime=(TextView) view.findViewById(R.id.person_time);
        personImage.setImageResource(person.getImageId());
        personNmae.setText(person.getName());
        personWord.setText(person.getWord());
        personTime.setText(person.getTime());
        return view;
    }
}
