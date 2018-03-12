package com.example.android.riyadhtourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ghada on September/4/2017 AD.
 */

public class ListAdapter extends ArrayAdapter<ListItem> {
    private Context mContext;

    public ListAdapter(Context context, ArrayList<ListItem> item) {
        super(context, 0, item);
        mContext = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        ListItem currentItem = getItem(position);
        holder.itemName.setText(currentItem.getName());
        holder.itemDesc.setText(currentItem.getDesc());
        holder.imageItem.setImageResource(currentItem.getImg());
        holder.imageItem.setVisibility(View.VISIBLE);
        return convertView;
    }

    class ViewHolder {
        @BindView(R.id.item_img)
        ImageView imageItem;
        @BindView(R.id.item_name)
        TextView itemName;
        @BindView(R.id.item_desc)
        TextView itemDesc;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}