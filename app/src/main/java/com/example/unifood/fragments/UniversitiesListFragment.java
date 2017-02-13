package com.example.unifood.fragments;

import android.os.Bundle;

import com.example.unifood.R;
import com.example.unifood.adapters.UniversityListAdapter;

import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class UniversitiesListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_universities_list, container, false);
        return rootView;
    }

    public void updateRecycler(UniversityListAdapter mAdapter){
        RecyclerView universityListRecyclerView = (RecyclerView) getView().findViewById(R.id.admin_university_list);
        universityListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        universityListRecyclerView.setAdapter(mAdapter);
    }
}
