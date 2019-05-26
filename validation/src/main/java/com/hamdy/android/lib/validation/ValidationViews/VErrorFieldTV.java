package com.hamdy.android.lib.validation.ValidationViews;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

import com.hamdy.android.lib.validation.Errors.IVewError;
import com.hamdy.android.lib.validation.R;


/**
 * Created by Hamdy on 4/24/2017.
 */

public class VErrorFieldTV implements IVewError {


    private TextView textView;
    private IErrorMessageHandler messageHandler;

    public VErrorFieldTV(TextView textView) {
        this.textView = textView;
    }

    public VErrorFieldTV(TextView textView, IErrorMessageHandler messageHandler) {
        this.textView = textView;
        this.messageHandler = messageHandler;
    }

    @Override
    public void setError(String message) {


        textView.setText(message);

        if(messageHandler!= null)
            messageHandler.setErrorToModel(message);
        else {
            textView.setTextColor(ContextCompat.getColor(textView.getContext() , android.R.color.holo_red_dark
            ));
            textView.setVisibility(message == null ? View.GONE : View.VISIBLE);
        }
    }


    public  interface  IErrorMessageHandler{

        void setErrorToModel(String message);
    }
}
