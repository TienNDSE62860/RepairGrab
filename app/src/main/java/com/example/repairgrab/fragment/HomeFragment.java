package com.example.repairgrab.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.repairgrab.R;
import com.example.repairgrab.activity.MapsActivity;

public class HomeFragment extends Fragment {

    private CardView findRepairer;
    private CardView consultRepairer;


    @Override
    public void onStart() {
        super.onStart();
        findRepairer = getActivity().findViewById(R.id.find_repairer);
        findRepairer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MapsActivity.class);
                startActivity(intent);
            }
        });

        consultRepairer = getActivity().findViewById(R.id.consult_repairer);
        consultRepairer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaintenanceFragment maintenanceFragment = new MaintenanceFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, maintenanceFragment).commit();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
