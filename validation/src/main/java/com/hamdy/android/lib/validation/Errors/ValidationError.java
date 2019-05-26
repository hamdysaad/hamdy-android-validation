package com.hamdy.android.lib.validation.Errors;

/**
 * Created by Hamdy on 4/24/2017.
 */

public class ValidationError {


    String message;
    IVewError vewError;

    public ValidationError(String message, IVewError vewError) {
        this.message = message;
        this.vewError = vewError;
    }

    public void displayError(){

        vewError.setError(message);
    }
}
