package com.hamdy.android.lib.validation.FieldsValidation;

import android.content.Context;

import java.util.List;


/**
 * Created by Hamdy on 10/17/2017.
 */

public class ValidateFields {


    private Validation validation = new Validation();

    public ValidateFields(IFieldValidation[] iFieldValidations) {

        for (IFieldValidation iFieldValidation : iFieldValidations ){
            validation.addValidationField(iFieldValidation.getValidationField());
        }

    }

    public ValidateFields(List<IFieldValidation> iFieldValidations) {

        for (IFieldValidation iFieldValidation : iFieldValidations ){
            validation.addValidationField(iFieldValidation.getValidationField());
        }

    }

    public void validate(Context context, IValidationHandler iValidationHandler) {
        validation.validate(context ,iValidationHandler);
    }
}
