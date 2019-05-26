package com.hamdy.android.lib.validation.ValidationRules;

import android.content.Context;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hamdy on 4/23/2017.
 */



/*
* to use this validation rule you must insert
* strings in strings file
* <string name="validation_email">Email must be valid email address</string>
* <string name="validation_email">يحب ان يكون البريد الإلكتروني صحيحاً</string>
* */

public class CustomPattern implements IValidationRule {


    private final String pattern;
    private final String message;
    private final String value;

    public CustomPattern(String pattern , String value , String message) {
        this.pattern = pattern;
        this.message = message;
        this.value = value;
    }

    @Override
    public String validate(Context context) {

        String message = null;

        if(value != null){

            if(!validateCustomPattern(value))
                message = this.message;
        }


        return message;
    }



    private  boolean validateCustomPattern(String value) {

        // return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile(this.pattern);
        matcher = pattern.matcher(value);
        return matcher.matches();

    }

}
