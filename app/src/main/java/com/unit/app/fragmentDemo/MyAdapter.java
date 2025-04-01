package com.unit.app.fragmentDemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.unit.app.R;

public class MyAdapter extends BaseAdapter {
    private final Context context;
    private final String[] month;

    public MyAdapter(Context context, String[] month) {
        this.context = context;
        this.month = month;
    }

    @Override
    public int getCount() {
        return month.length;
    }

    @Override
    public Object getItem(int i) {
        return month[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
           view = LayoutInflater.from(context).inflate(R.layout.row_list, viewGroup, false);
        }

        TextView tvTitle = view.findViewById(R.id.tv_title);
        TextView subTitle = view.findViewById(R.id.tv_subtitle);

        tvTitle.setText(month[i]);
        subTitle.setText(month[i]);



        return view;
    }
}
