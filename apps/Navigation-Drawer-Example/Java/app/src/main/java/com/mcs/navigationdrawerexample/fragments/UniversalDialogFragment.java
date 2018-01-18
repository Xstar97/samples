package com.mcs.navigationdrawerexample.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import com.mcs.navigationdrawerexample.R;

public class UniversalDialogFragment extends DialogFragment
{
    public UniversalDialogFragment() {
    }

    @Override
    public @NonNull
    Dialog onCreateDialog(final Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.AppCompatAlertDialogStyle);
        setCancelable(false);
        builder.setTitle(setTitle());
        builder.setMessage(setMessage());
        builder.setPositiveButton(setPositiveButton(),  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showMsg(setPositiveMessage());
                getDialog().dismiss();
            }
        });
        builder.setNegativeButton(setNegativeButton(),  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showMsg(setNegativeMessage());
                getDialog().dismiss();
            }
        });

        return builder.create();
    }
    private void showMsg(String msg){
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
    private String setTitle(){
        return getArguments().getString("title", "dialog title");
    }
    private String setMessage(){
        return getArguments().getString("message", "dialog message");
    }
    private String setPositiveButton(){
        return getArguments().getString("+button", "dialog button 'cancel'");
    }
    private String setPositiveMessage(){
        return getArguments().getString("+message", "dialog button 'ok'");
    }
    private String setNegativeButton(){
        return getArguments().getString("-button", "dialog button 'cancel'");
    }
    private String setNegativeMessage(){
        return getArguments().getString("-message", "dialog negative message");
    }
}