package com.mcs.navigationdrawerexample.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.text.TextPaint;
import android.widget.Toast;

import com.mcs.navigationdrawerexample.R;

public class ShareDialogFragment extends DialogFragment
{
    public ShareDialogFragment() {
    }

    @Override
    public @NonNull
    Dialog onCreateDialog(final Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.AppCompatAlertDialogStyle);
        setCancelable(false);
        builder.setTitle("Share!");
        builder.setMessage("Share this example with your friends!");
        builder.setPositiveButton("okay!",  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showMsg("thanks! your awesome!");
                getDialog().dismiss();
            }
        });
        builder.setNegativeButton("never!",  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showMsg("okay...maybe later..");
                getDialog().dismiss();
            }
        });

        return builder.create();
    }
    private void showMsg(String msg){
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}