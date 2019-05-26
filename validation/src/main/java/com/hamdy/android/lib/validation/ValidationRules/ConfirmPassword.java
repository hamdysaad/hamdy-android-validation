package com.hamdy.android.lib.validation.ValidationRules;

import android.content.Context;


public class ConfirmPassword implements IValidationRule {


    private final String msg;
    String password;
    String ConfirmPassword;

    public ConfirmPassword(String password , String ConfirmPassword , String msg) {
        this.password = password;
        this.ConfirmPassword = ConfirmPassword;
        this.msg = msg;
    }

    @Override
    public String validate(Context context) {



        if(password != null && ConfirmPassword != null){

            if(!ConfirmPassword.equals(password))
                return msg;
        }


        return null;
    }

}
