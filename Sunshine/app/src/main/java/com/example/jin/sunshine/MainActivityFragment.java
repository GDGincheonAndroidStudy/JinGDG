package com.example.jin.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> adt;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment_main,container);

        ArrayList<String> textList=new ArrayList<>();
        textList.add("Today-Sunny-88/63");
        textList.add("Tommorow-Sunny-88/63");
        textList.add("Monday-Sunny-88/63");
        textList.add("Tuesday-Sunny-88/63");
        textList.add("Today-Sunny-88/63");

         adt=new ArrayAdapter<String>(this.getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,textList);
        //ArrayAdapter (the current Context of getActivity, )

//        rootView.findViewById()
        ListView listView=(ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(adt);

//        return inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }
}
