package com.mcs.navigationdrawerexample.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mcs.navigationdrawerexample.R;


public class ShareFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String main1 = "main";
    private static final String camera2 = "camera";
    private static final String gallery3 = "gallery";
    private static final String slideshow4 = "camera";
    private static final String manage5 = "manage";
    private static final String share6 = "share";
    private static final String send7 = "send";


    // TODO: Rename and change types of parameters
    private String mMain;
    private String mCamera;
    private String mGallery;
    private String mSlideShow;
    private String mManage;
    private String mShare;
    private String mSend;



    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param main Parameter 1.
     * @param camera Parameter 2.
     * @param gallery Parameter 3.
     * @param slideshow Parameter 4.
     * @param share Parameter 5.
     * @param send Parameter 6.
     *
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShareFragment newInstance(String main, String camera, String gallery, String slideshow, String manage, String share, String send) {
        ShareFragment fragment = new ShareFragment();
        Bundle args = new Bundle();
        args.putString(main1, main);
        args.putString(camera2, camera);
        args.putString(gallery3, gallery);
        args.putString(slideshow4, slideshow);
        args.putString(manage5, manage);
        args.putString(share6, share);
        args.putString(send7, send);
        fragment.setArguments(args);
        return fragment;
    }

    public ShareFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMain = getArguments().getString(main1);
            mCamera = getArguments().getString(camera2);
            mGallery = getArguments().getString(gallery3);
            mSlideShow = getArguments().getString(slideshow4);
            mManage = getArguments().getString(manage5);
            mShare = getArguments().getString(share6);
            mSend = getArguments().getString(send7);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_share, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}