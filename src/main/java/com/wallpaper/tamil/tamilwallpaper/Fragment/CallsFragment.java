package com.wallpaper.tamil.tamilwallpaper.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wallpaper.tamil.tamilwallpaper.HttpHandler;
import com.wallpaper.tamil.tamilwallpaper.R;



/**
 * A simple {@link Fragment} subclass.
 */
public class CallsFragment extends Fragment {

    HttpHandler apiService=new HttpHandler();
    apiService.

    public CallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false);
    }

}
