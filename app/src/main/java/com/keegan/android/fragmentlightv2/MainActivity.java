package com.keegan.android.fragmentlightv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        if(fragmentManager.findFragmentById(R.id.rightFragment) == null)
        {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            RightFragment rightFragment = new RightFragment();
            transaction.add(R.id.rightFragment, rightFragment);
            transaction.commit();
        }
    }

    public void updateLight(View view){
        clickCount += 1;
        FragmentManager fragmentManager = getSupportFragmentManager();
        RightFragment rightFragment = (RightFragment) fragmentManager.findFragmentById(R.id.rightFragment);
        /*View rightFragmentView = rightFragment.getView();
        TextView lightButton = (TextView) rightFragmentView.findViewById(R.id.traffic_light);*/

        if(clickCount == 1)
        {
            rightFragment.setGreenLight();
        }
        else if(clickCount == 2)
        {
            rightFragment.setYellowLight();
        }
        else{       //yellow light
            rightFragment.setRedLight();
            clickCount = 0;
        }
    }
}