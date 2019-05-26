package com.hamdy.android.lib.validation.ValidationRules;

import android.content.Context;


public class Mobile implements IValidationRule {

    private final String value;
    private final String msg;

    public Mobile(String value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    @Override
    public String validate(Context context) {

        String message = null;

        if(value != null){

            if(!validatePhoneNumber(value))
                return msg;
        }

        return message;
    }


    private static boolean validatePhoneNumber(String phoneNo) {
        //validate phone numbers of format "1234567890"
        if (phoneNo.matches("[+][0-9]{12}")) return true;
            //validating phone number with -, . or spaces
        else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
            //validating phone number with extension length from 3 to 5
        else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
            //validating phone number where area code is in braces ()
        else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
            //return false if nothing matches the input
        else return false;

    }



}
