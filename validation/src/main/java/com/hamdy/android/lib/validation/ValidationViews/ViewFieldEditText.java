package com.hamdy.android.lib.validation.ValidationViews;

import android.widget.EditText;

import com.hamdy.android.lib.validation.Errors.IVewError;


/**
 * Created by Hamdy on 4/24/2017.
 */

public class ViewFieldEditText implements IVewError {


    private EditText editText;

    public ViewFieldEditText(EditText editText) {
        this.editText = editText;
    }

    @Override
    public void setError(String message) {
        editText.setError(message);
    }
}
