package com.hamdy.android.lib.validation.FieldsValidation;

import android.content.Context;
import android.util.Log;

import com.hamdy.android.lib.validation.Errors.IVewError;
import com.hamdy.android.lib.validation.Errors.ValidationError;
import com.hamdy.android.lib.validation.ValidationRules.IValidationRule;

import java.util.ArrayList;
import java.util.List;


public class Validation {


    private  final String TAG = "Validation";
    private List<ValidationField> validationFields = new ArrayList<>();

    private ArrayList<ValidationError> validationErrors;


    public Validation() {
    }

    public Validation(List<ValidationField> validationFields) {
        this.validationFields = validationFields;
    }



    public Validation addValidationField(IVewError vewError , IValidationRule[] rules){

        validationFields.add( new ValidationField( vewError , rules));

        return this;
    }


    public Validation addValidationField(ValidationField validationField){

        validationFields.add(validationField);

        return this;
    }

    public void validate(Context context , IValidationHandler iValidationHandler){

        int errorNo = 0;
        validationErrors = new ArrayList<>();

        for(int i = 0 ; i < validationFields.size() ; i++ ){

            ValidationField validationField =  validationFields.get(i);

            IValidationRule[] rules = validationField.validationRules;

            String error = "";
            for(int j = 0 ; j < rules.length ; j++){
                 String mess = rules[j].validate(context);
                Log.e(TAG , "error : " + mess);
                if(mess != null) {
                    errorNo++;
                    error = mess;
//                    error += mess + "\n";
                    break;
                }
            }

            if(!error.equals(""))
                validationErrors.add(new ValidationError(error , validationField.view));
            else
                validationErrors.add(new ValidationError(null , validationField.view));
        }


        if (errorNo > 0) {
            iValidationHandler.onValidationFailed(validationErrors);
        }
        else {
            resetErrors();
            iValidationHandler.onValidationSuccessfull();
        }

    }

    private void resetErrors() {

        for(int i = 0; i < validationErrors.size() ; i++){
            validationErrors.get(i).displayError();
        }
    }

}
