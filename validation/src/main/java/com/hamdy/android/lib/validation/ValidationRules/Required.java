package com.hamdy.android.lib.validation.ValidationRules;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;


public class Required implements IValidationRule {
    private  final String TAG = "Required" ;
    private final String msg;
    private boolean mBooleanValue;
    private String value;


    public Required(String value , String msg) {
        this.value = value;
        this.msg = msg;
    }

    @Override
    public String validate(Context context) {

        Log.e(TAG , "value : " + value);

        return value != null && !TextUtils.isEmpty(value) ? null : msg;
    }


}
