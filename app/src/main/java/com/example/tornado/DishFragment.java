package com.example.tornado;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DishFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DishFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "name";
    private static final String ARG_PARAM2 = "price";
    private static final String ARG_PARAM3 = "ing";

    // TODO: Rename and change types of parameters
    private String mname;
    private String mprice;
    private String ming;

    public DishFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param mname Parameter 1.
     * @param mprice Parameter 2.
     * @param ming Parameter 3.
     * @return A new instance of fragment DishFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DishFragment newInstance(String mname, String mprice, String ming) {
        DishFragment fragment = new DishFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, mname);
        args.putString(ARG_PARAM2,mprice );
        args.putString(ARG_PARAM3, ming);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mname = getArguments().getString(ARG_PARAM1);
            mprice = getArguments().getString(ARG_PARAM2);
            ming = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_menu, container, false);
    }
}
