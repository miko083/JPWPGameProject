package com.example.myapplication.Dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.Clickable;
import com.example.myapplication.R;


public class ExceptionWhileBackgroundMoving extends Dialog implements View.OnClickListener, Clickable {

    private Button ok;

    private Context context;

    public ExceptionWhileBackgroundMoving (Context context){
        super(context);
        this.context = context;
    }

    @Override
    public void onCreate (Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.exception_while_background_moving);

        ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.ok:
                dismiss();
                break;
                default:
                break;
        }
    }

    @Override
    public void actionOnClick (){
        ExceptionWhileBackgroundMoving exceptionWhileBackgroundMoving = new ExceptionWhileBackgroundMoving(context);
        exceptionWhileBackgroundMoving.show();

    }



}
