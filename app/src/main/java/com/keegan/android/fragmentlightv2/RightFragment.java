package com.keegan.android.fragmentlightv2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class RightFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_right, container, false);
    }

    public void setRedLight(){
        View fragmentView = getView();
        TextView redLight = (TextView) fragmentView.findViewById(R.id.red_light);
        TextView yellowLight = (TextView) fragmentView.findViewById(R.id.yellow_light);
        redLight.setBackgroundColor(Color.RED);
        yellowLight.setBackgroundColor(Color.TRANSPARENT);
    }

    public void setGreenLight(){
        View fragmentView = getView();
        TextView greenLight = (TextView) fragmentView.findViewById(R.id.green_light);
        TextView redLight = (TextView) fragmentView.findViewById(R.id.red_light);
        greenLight.setBackgroundColor(Color.GREEN);
        redLight.setBackgroundColor(Color.TRANSPARENT);
    }

    public void setYellowLight(){
        View fragmentView = getView();
        TextView yellowLight = (TextView) fragmentView.findViewById(R.id.yellow_light);
        TextView greenLight = (TextView) fragmentView.findViewById(R.id.green_light);
        yellowLight.setBackgroundColor(Color.YELLOW);
        greenLight.setBackgroundColor(Color.TRANSPARENT);
    }
}
