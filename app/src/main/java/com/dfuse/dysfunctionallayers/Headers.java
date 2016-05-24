package com.dfuse.dysfunctionallayers;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dfuse on 5/22/16.
 */
public class Headers extends Fragment {
    RecyclerView recyclerView;
    CardAdapter mAdapter;
    Intent intent;


    private static final Intent LAYERS_INSTALL =  new Intent().setComponent(new ComponentName(
            "com.lovejoy777.rroandlayersmanager", "com.lovejoy777.rroandlayersmanager.activities.OverlayDetailActivity"));


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.rv_layout, container, false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
        setupRecyclerView(recyclerView);
        recyclerView.setHasFixedSize(true);

        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.fab2);

        fab.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                intent = new Intent(LAYERS_INSTALL);
                intent.putExtra("PackageName",
                        getActivity(). getApplicationInfo().packageName);
                startActivity(intent);


            }
        });


        return rootView;
    }

    private void setupRecyclerView(RecyclerView recyclerView){
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        mAdapter = new CardAdapter();
        recyclerView .setAdapter(mAdapter);


    }






}
