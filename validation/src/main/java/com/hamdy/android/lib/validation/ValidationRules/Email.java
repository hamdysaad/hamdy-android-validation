package com.hamdy.android.lib.validation.ValidationRules;

import android.content.Context;


public class Email implements IValidationRule {


    private final String email;
    private final String msg;

    public Email(String email , String msg) {
        this.email = email;
        this.msg = msg;
    }

    @Override
    public String validate(Context context) {


        if(email != null){

            if(!validateEmail(email))
                return msg;
        }

        return null;



    }

    private static boolean validateEmail(String email) {

         return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
//        Pattern pattern;
//        Matcher matcher;
//
//        String EMAIL_PATTERN =
//                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
//                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
//
//        pattern = Pattern.compile(EMAIL_PATTERN);
//        matcher = pattern.matcher(email);
//        return matcher.matches();

    }


}
