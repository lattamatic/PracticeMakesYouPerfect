package com.example.sandeep_chi.practicemakesyouperfect;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import java.lang.reflect.Array;

/**
 * Created by sandeep_chi on 11/23/2016.
 */

public class ListDialog extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setItems(R.array.listDialog, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getActivity()," " + which,Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
    }
}
