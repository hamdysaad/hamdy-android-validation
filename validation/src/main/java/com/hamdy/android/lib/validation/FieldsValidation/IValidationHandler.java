package com.hamdy.android.lib.validation.FieldsValidation;


import com.hamdy.android.lib.validation.Errors.ValidationError;

import java.util.List;

/**
 * Created by Hamdy on 4/23/2017.
 */

public interface IValidationHandler {


    void onValidationSuccessfull();
    void onValidationFailed(List<ValidationError> validationErrors);
}
