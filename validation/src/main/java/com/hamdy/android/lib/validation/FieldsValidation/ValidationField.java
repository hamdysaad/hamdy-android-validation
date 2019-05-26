package com.hamdy.android.lib.validation.FieldsValidation;


import com.hamdy.android.lib.validation.Errors.IVewError;
import com.hamdy.android.lib.validation.ValidationRules.IValidationRule;

/**
 * Created by Hamdy on 4/23/2017.
 */

public class ValidationField {


    public IVewError view;
    public IValidationRule[] validationRules;

    public ValidationField(IVewError view, IValidationRule[] validationRules) {

        this.view = view;
        this.validationRules = validationRules;
    }


}
