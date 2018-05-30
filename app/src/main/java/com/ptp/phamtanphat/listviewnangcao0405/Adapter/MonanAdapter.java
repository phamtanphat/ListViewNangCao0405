package com.ptp.phamtanphat.listviewnangcao0405.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ptp.phamtanphat.listviewnangcao0405.Model.Monan;
import com.ptp.phamtanphat.listviewnangcao0405.R;

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

    class ViewHolder{
        ImageView imgMonan;
        TextView txtTenmonan,txtGiamonan;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.dong_item_listview_mon_an, null);
            viewHolder = new ViewHolder();
            viewHolder.imgMonan = convertView.findViewById(R.id.imageviewMonan);
            viewHolder.txtTenmonan = convertView.findViewById(R.id.textviewTenMonan);
            viewHolder.txtGiamonan = convertView.findViewById(R.id.textviewGiaMonan);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Monan monan = (Monan) getItem(position);

        viewHolder.imgMonan.setImageResource(monan.getHinhanh());
        viewHolder.txtTenmonan.setText(monan.getTenmonan());
        viewHolder.txtGiamonan.setText(monan.getGiamonan() + " Dong");

        return convertView;
    }
}
