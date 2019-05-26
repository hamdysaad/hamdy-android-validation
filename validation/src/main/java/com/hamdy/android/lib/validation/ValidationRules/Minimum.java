package com.hamdy.android.lib.validation.ValidationRules;

import android.content.Context;


/**
 * Created by Hamdy on 4/23/2017.
 */

/*
* to use this validation rule you must insert
* strings in strings file
 *     <string name="validation_min">يجب ان بكون عدد الحروف اكبر من او تساوي</string>

 * <string name="validation_min">The number of characters must be greater than or equal</string>
* */

public class Minimum implements IValidationRule {


    private final String value;
    private int min;

    public Minimum(String value , int min) {
        this.min = min;
        this.value = value;
    }

    @Override
    public String validate(Context context) {

        String message = null;
        if(value != null){

            if(value.length() < min)
                message = context.getString(context.getResources().getIdentifier("validation_min" , "string" , context.getPackageName())) + " " + min;
        }

        return message;
    }


}
