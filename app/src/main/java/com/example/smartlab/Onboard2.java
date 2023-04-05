package com.example.smartlab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

/**
 * A fragment representing a list of Items.
 */
public class Onboard2 extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 2;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public Onboard2() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static Onboard2 newInstance(int columnCount) {
        Onboard2 fragment = new Onboard2();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }
}

