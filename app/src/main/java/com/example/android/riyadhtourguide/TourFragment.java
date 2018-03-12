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

public class TourFragment extends Fragment{
    private View view;
    private ArrayList<ListItem> toursList;
    private ListAdapter toursAdapter;
    private ListView toursListView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tour_fragment, container, false);
        toursList = new ArrayList<>();

        toursList.add(new ListItem(R.string.al_nakheel_mall, R.string.al_nakheel_mall_desc, R.drawable.al_nakheel_mall));
        toursList.add(new ListItem(R.string.alfaisaliah_mall, R.string.alfaisaliah_mall_desc, R.drawable.alfaisaliah_mall));
        toursList.add(new ListItem(R.string.masmak_fort, R.string.masmak_fort_desc, R.drawable.masmak_fort));
        toursList.add(new ListItem(R.string.king_abdullah_park, R.string.king_abdullah_park_desc, R.drawable.king_abdullah_park));
        toursList.add(new ListItem(R.string.turki_bin_abdullah_mosque, R.string.turki_bin_abdullah_mosque_desc, R.drawable.turki_bin_abdullah_mosque));
        toursList.add(new ListItem(R.string.kingdom_tower, R.string.kingdom_tower_desc, R.drawable.kingdom_tower));
        toursList.add(new ListItem(R.string.national_museum, R.string.national_museum_desc, R.drawable.national_museum));
        toursList.add(new ListItem(R.string.wadi_namar, R.string.wadi_namar_desc, R.drawable.wadi_namar));
        toursList.add(new ListItem(R.string.salam_park, R.string.salam_park_desc, R.drawable.salam_park));
        toursList.add(new ListItem(R.string.wadi_hanifah, R.string.wadi_hanifah_desc, R.drawable.wadi_hanifah));

        toursAdapter = new ListAdapter(getActivity(), toursList);
        toursListView = (ListView) view.findViewById(R.id.tours_listview);
        toursListView.setAdapter(toursAdapter);
        return view;
        }
    }