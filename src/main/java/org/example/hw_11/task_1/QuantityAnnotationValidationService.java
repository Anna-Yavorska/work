package org.example.hw_11.task_1;

import java.lang.reflect.Field;

public class QuantityAnnotationValidationService implements LegoAnnotationService {
    @Override
    public LegoValidationResult validate(Object object) throws IllegalAccessException {
        LegoValidationResult  legoValidationResult = new LegoValidationResult();

        Field[] declaredFields = object.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            Quantity annotation = declaredField.getAnnotation(Quantity.class);

            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();

                declaredField.setAccessible(true);
                Object fieldValue = declaredField.get(object);

                if (fieldValue instanceof Integer) {

                    Integer integerFieldValue = (Integer) fieldValue;

                    boolean validationResult = integerFieldValue > min && integerFieldValue < max;
                    legoValidationResult.setValidationPassed(false);
                    legoValidationResult.setMessage("Details quantity must be from 5 to 30");
                }
            }
        }

        return null;
    }
}
