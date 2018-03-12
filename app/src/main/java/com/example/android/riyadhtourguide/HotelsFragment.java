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

public class HotelsFragment extends Fragment {
    private View view;
    private ArrayList<ListItem> hotelsList;
    private ListAdapter hotelAdapter;
    private ListView hotelsListView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.hotels_fragment, container, false);
        hotelsList = new ArrayList<>();

        hotelsList.add(new ListItem(R.string.the_ritz_carlton_hotel, R.string.the_ritz_carlton_desc, R.drawable.the_ritz_carlton_hotel));
        hotelsList.add(new ListItem(R.string.alfaisaliah_hotel, R.string.alfaisaliah_desc, R.drawable.alfaisaliah_hotel));
        hotelsList.add(new ListItem(R.string.four_seasons_hotel, R.string.four_seasons_desc, R.drawable.alfaisaliah_hotel));
        hotelsList.add(new ListItem(R.string.intercontinental_hotel, R.string.intercontinental_desc, R.drawable.intercontinental_hotel));
        hotelsList.add(new ListItem(R.string.kempinski_hotel, R.string.kempinski_desc, R.drawable.kempinski_hotel));
        hotelsList.add(new ListItem(R.string.moevenpick_hotel, R.string.moevenpick_desc, R.drawable.moevenpick_hotel));
        hotelsList.add(new ListItem(R.string.narcissus_hotel, R.string.narcissus_desc, R.drawable.narcissus_hotel));
        hotelsList.add(new ListItem(R.string.marriott_hotel, R.string.marriott_desc, R.drawable.marriott_hotel));
        hotelsList.add(new ListItem(R.string.rafal_hotel, R.string.rafal_desc, R.drawable.rafal_hotel));
        hotelsList.add(new ListItem(R.string.rosh_rayhaan_hotel, R.string.rosh_rayhaan_desc, R.drawable.rosh_rayhaan_hotel));

        hotelAdapter = new ListAdapter(getActivity(), hotelsList);
        hotelsListView = (ListView) view.findViewById(R.id.hotels_listview);
        hotelsListView.setAdapter(hotelAdapter);
        return view;
    }
}