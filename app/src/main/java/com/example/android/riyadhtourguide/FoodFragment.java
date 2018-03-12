package com.example.android.riyadhtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ghada on September/4/2017 AD.
 */

public class FoodFragment extends Fragment {
    private View view;
    private ArrayList<ListItem> restList;
    private ListAdapter restAdapter;
    private ListView restListView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.food_fragment, container, false);
        restList = new ArrayList<>();

        restList.add(new ListItem(R.string.alorjouan_rest, R.string.alorjouan_desc, R.drawable.alorjouan_rest));
        restList.add(new ListItem(R.string.lusin_rest, R.string.lusin_desc, R.drawable.lusin_rest));
        restList.add(new ListItem(R.string.nozomii_rest, R.string.nozomi_desc, R.drawable.nozomi_rest));
        restList.add(new ListItem(R.string.theglobe_rest, R.string.theglobe_desc, R.drawable.theglobe_rest));
        restList.add(new ListItem(R.string.sultanSteakhouse_rest, R.string.sultanSteakhouse_desc, R.drawable.sultan_steakhouse_rest));
        restList.add(new ListItem(R.string.tugra_rest, R.string.tugra_desc, R.drawable.tugra_rest));
        restList.add(new ListItem(R.string.kampai_rest, R.string.kampai_desc, R.drawable.kampai_rest));
        restList.add(new ListItem(R.string.chorisia_rest, R.string.chorisia_desc, R.drawable.chorisia_rest));
        restList.add(new ListItem(R.string.hong_rest, R.string.hong_desc, R.drawable.hong_rest));
        restList.add(new ListItem(R.string.elements_rest, R.string.elements_desc, R.drawable.elements_rest));

        restAdapter = new ListAdapter(getActivity(), restList);
        restListView = (ListView) view.findViewById(R.id.food_listview);
        restListView.setAdapter(restAdapter);
        return view;
    }
}