package com.suy.rach.testapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AjoutDepotFragment extends Fragment
 implements View.OnClickListener{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frag_ajout_depot, container, false);

        view.findViewById(R.id.frag_add_depot_btn).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.frag_add_depot_btn){
            DialogAddDepot dialog = new DialogAddDepot();
            assert getFragmentManager() != null;
            dialog.show(getFragmentManager(), "ADD_DEPOT");
        }
    }
}
