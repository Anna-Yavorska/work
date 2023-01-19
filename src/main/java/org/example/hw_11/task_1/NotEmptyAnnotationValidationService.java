package org.example.hw_11.task_1;

import java.lang.reflect.Field;

public class NotEmptyAnnotationValidationService implements LegoAnnotationService {
    @Override
    public LegoValidationResult validate(Object object) throws IllegalAccessException {
        LegoValidationResult legoValidationResult = new LegoValidationResult();

        Field[] declaredFields = object.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            NotEmpty annotation = declaredField.getAnnotation(NotEmpty.class);

            if (annotation != null) {
                declaredField.setAccessible(true);
                String fieldValue = (String) declaredField.get(object);

                boolean validationResult = fieldValue.length() > 0;
                legoValidationResult.setValidationPassed(false);
                legoValidationResult.setMessage("Type and serial can't be empty, please contact our support");
            }
        }

        return null;
    }
}
