package com.ptp.phamtanphat.listviewnangcao0405;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 30/5/2018.
 */

public class MonanAdapter extends BaseAdapter {
    Context context;
    ArrayList<Monan> monanArrayList;

    public MonanAdapter(Context context, ArrayList<Monan> monanArrayList) {
        this.context = context;
        this.monanArrayList = monanArrayList;
    }

    @Override
    public int getCount() {
        return monanArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return monanArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.dong_item_listview_mon_an, null);

        ImageView imgMonan = convertView.findViewById(R.id.imageviewMonan);
        TextView txtTenmonan = convertView.findViewById(R.id.textviewTenMonan);
        TextView txtGiamonan = convertView.findViewById(R.id.textviewGiaMonan);

        Monan monan = (Monan) getItem(position);

        imgMonan.setImageResource(monan.getHinhanh());
        txtTenmonan.setText(monan.getTenmonan());
        txtGiamonan.setText(monan.getGiamonan() + " Dong");

        return convertView;
    }
}
