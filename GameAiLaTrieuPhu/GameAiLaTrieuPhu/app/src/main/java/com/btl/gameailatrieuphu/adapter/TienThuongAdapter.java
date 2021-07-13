package com.btl.gameailatrieuphu.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.btl.gameailatrieuphu.R;

import java.util.ArrayList;
import java.util.List;

public class TienThuongAdapter extends ArrayAdapter<String> {
    Context mct;
    ArrayList<String> arr;
    int viTriCauHoi =1;
    public TienThuongAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        this.mct = context;
        this.arr = new ArrayList<>(objects);
    }

    public void setViTriCauHoi(int viTriCauHoi) {
        this.viTriCauHoi = viTriCauHoi;
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)mct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_tien, null);
        }
        if(arr.size()>0){
            int pos = 15 - position;
            TextView txvtienthuong = convertView.findViewById(R.id.txvtienthuong);
            if(pos%5==0){
                txvtienthuong.setTextColor(Color.parseColor("#FFFFFF"));
            }else{
                txvtienthuong.setTextColor(Color.parseColor("#FB450B"));
            }
            String Khoangtrang;
            if(pos/10>0){
                Khoangtrang = "     ";
            }
            else {
                Khoangtrang = "       ";
            }
            String texthienthi = pos+Khoangtrang+"$"+arr.get(position);
            txvtienthuong.setText(texthienthi);

            if(pos == viTriCauHoi){
                txvtienthuong.setBackgroundColor(Color.parseColor("#FFE927"));
                txvtienthuong.setTextColor(Color.parseColor("#9C27B0"));
            }else{
                txvtienthuong.setBackgroundColor(Color.parseColor("#00FF9800"));

            }
        }
        return  convertView;
    }
}

