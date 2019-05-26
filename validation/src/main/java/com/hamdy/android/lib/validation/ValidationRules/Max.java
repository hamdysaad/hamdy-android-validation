package com.hamdy.android.lib.validation.ValidationRules;

import android.content.Context;


/**
 * Created by Hamdy on 4/23/2017.
 */


/*
* to use this validation rule you must insert
* strings in strings file
 *     <string name="validation_max">The number of characters must be less than or equal to</string>
 *     <string name="validation_max">عدد الحروف يجب ان تكون أقل من او تساوي</string>
* */

public class Max implements IValidationRule {


    private String value;
    private String message;
    private int max;

    public Max(String value , int max , String message) {
        this.max = max;
        this.message = message;
        this.value = value;

    }

    public Max(String value , int max) {
        this.max = max;
        this.value = value;
    }



    @Override
    public String validate(Context context) {

        String message = null;
        if(value != null){

            if(value.length() > max) {
                message = this.message == null ?
                        context.getString(context.getResources().getIdentifier("validation_max", "string", context.getPackageName()))
                        : this.message;

                message += " " + max;
            }
        }

        return message;
    }


}
