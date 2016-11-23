package com.example.sandeep_chi.practicemakesyouperfect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button simpleDialog, listDialog, singleChoice, multiChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleDialog= (Button) findViewById(R.id.bSimpleDialog);
        listDialog = (Button) findViewById(R.id.bListDialog);
        singleChoice = (Button) findViewById(R.id.bSingleChoiceDialog);
        multiChoice = (Button) findViewById(R.id.bMultiChoiceDialog);

        simpleDialog.setOnClickListener(this);
        listDialog.setOnClickListener(this);
        singleChoice.setOnClickListener(this);
        multiChoice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bSimpleDialog:
                SimplDialog sd = new SimplDialog();
                sd.show(getFragmentManager(),"Simple Dialog");
                break;
            case R.id.bListDialog:
                ListDialog ld = new ListDialog();
                ld.show(getFragmentManager(),"List Dialog");
                break;
            case R.id.bSingleChoiceDialog:
                SingleChoiceDialog scd = new SingleChoiceDialog();
                scd.show(getFragmentManager(), "Single Choice Dialog");
                break;
            case R.id.bMultiChoiceDialog:
                MultiChoiceDialog mcd = new MultiChoiceDialog();
                mcd.show(getFragmentManager(),"Multi choice Dialog");
                break;
        }
    }
}
