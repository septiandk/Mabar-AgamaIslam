package com.book.dk.PAI;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    ListView listView;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.listview_activity, container, false);
        listView =(ListView) rootView.findViewById(R.id.cardListView);
        String[] values = new String[] {
                "Introduction",
                "Pelajaran 2 - Aku Cinta Al-Qur'an",
                "Pelajaran 3 - Iman kepad Allah SWT",
                "Pelajaran 4 - Bersih itu Sehat",
                "Pelajaran 5 - Cinta Nabi dan Rasul",
                "Pelajaran 6 - Ayo Belajar",
                "Pelajaran 7 - Ayo Belajar Al-Qur'an",
                "Pelajaran 8 - Allah SWT. Maharaja",
                "Pelajaran 9 - Ayo kita Salat",
                "Penutup"

        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_custom, R.id.textView1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                listView.getItemAtPosition(position);
                if (position == 0) {
                    Pdf_sampleFragment sampleFragment = new Pdf_sampleFragment();
                    Bundle args = new Bundle();
                    args.putInt("key", 0);
                    sampleFragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();

                }
                else if (position == 1) {
                    Pdf_sampleFragment sampleFragment = new Pdf_sampleFragment();
                    Bundle args = new Bundle();
                    args.putInt("key", 1);
                    sampleFragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 2) {
                    Pdf_sampleFragment sampleFragment = new Pdf_sampleFragment();
                    Bundle args = new Bundle();
                    args.putInt("key", 2);
                    sampleFragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 3) {
                    Pdf_sampleFragment sampleFragment = new Pdf_sampleFragment();
                    Bundle args = new Bundle();
                    args.putInt("key", 3);
                    sampleFragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 4) {
                    Pdf_sampleFragment sampleFragment = new Pdf_sampleFragment();
                    Bundle args = new Bundle();
                    args.putInt("key", 4);
                    sampleFragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 5) {
                    Pdf_sampleFragment sampleFragment = new Pdf_sampleFragment();
                    Bundle args = new Bundle();
                    args.putInt("key", 5);
                    sampleFragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 6) {
                    Pdf_sampleFragment sampleFragment = new Pdf_sampleFragment();
                    Bundle args = new Bundle();
                    args.putInt("key", 6);
                    sampleFragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 7) {
                    Pdf_sampleFragment sampleFragment = new Pdf_sampleFragment();
                    Bundle args = new Bundle();
                    args.putInt("key", 7);
                    sampleFragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 8) {
                    Pdf_sampleFragment sampleFragment = new Pdf_sampleFragment();
                    Bundle args = new Bundle();
                    args.putInt("key", 8);
                    sampleFragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 9) {
                    Pdf_sampleFragment sampleFragment = new Pdf_sampleFragment();
                    Bundle args = new Bundle();
                    args.putInt("key", 9);
                    sampleFragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }

            }

        });
        return rootView;



    }


}