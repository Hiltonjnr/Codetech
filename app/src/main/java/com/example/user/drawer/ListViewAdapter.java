package com.example.user.drawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {

    // Declare Variables
    Context context;
    String[] EmergencyTitle;
    String[] TelNo;
    int[] imageId;
    LayoutInflater inflater;

    public ListViewAdapter(Context context, String[] EmergencyTitle, String[] TelNo, int[] imageId) {
        this.context = context;
        this.EmergencyTitle = EmergencyTitle;
        this.imageId = imageId;
        this.TelNo = TelNo;
    }

    @Override
    public int getCount() {
        return EmergencyTitle.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtName;
        TextView txtTelNo;
        ImageView imgLogo;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.emergency_item, parent, false);

        // Locate the TextViews in listview_item.xml
        txtName = (TextView) itemView.findViewById(R.id.tvTitle);
        txtTelNo = (TextView) itemView.findViewById(R.id.tvNumbers);

        imgLogo = (ImageView) itemView.findViewById(R.id.imgIcon);

        // Capture position and set to the TextViews
        txtName.setText(EmergencyTitle[position]);
        txtTelNo.setText(TelNo[position]);

        // Capture position and set to the ImageView
        imgLogo.setImageResource(imageId[position]);

        return itemView;
    }
}