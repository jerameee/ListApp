package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInfalter;
    String[] items;
    String[] prices;
    String[] descriptions;
    private int i;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d) {

        items = i;
        prices = p;
        descriptions = d;
        mInfalter = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {

        return items.length;
    }

    @Override
    public Object getItem(int position) {

        return items[i];
    }

    @Override
    public long getItemId(int position) {

        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInfalter.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.priceTextView);

        String name = items[i];
        String desc = descriptions[i];
        String cost = prices[i];

        nameTextView.setText(name);
        descriptionTextView.setText(desc);
        priceTextView.setText(cost);


        return v;
    }
}
