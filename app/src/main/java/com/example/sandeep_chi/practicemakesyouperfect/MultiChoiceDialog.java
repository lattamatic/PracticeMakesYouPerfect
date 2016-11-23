package com.example.sandeep_chi.practicemakesyouperfect;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by sandeep_chi on 11/23/2016.
 */

public class MultiChoiceDialog extends DialogFragment {

    ArrayList checked = new ArrayList();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMultiChoiceItems(R.array.singleChoiceDialog, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if(isChecked){
                    checked.add(which);
                }else if (checked.contains(which)){
                    checked.remove(Integer.valueOf(which));
                }
            }
        }).setTitle("Select one or many").setPositiveButton("SET", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String printer = "";
                for (int i=0;i<checked.size();i++){
                    printer = printer + " " + checked.get(i);
                }

                Toast.makeText(getActivity(),printer,Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Canceled", Toast.LENGTH_SHORT).show();
            }
        });

        return builder.create();
    }
}
