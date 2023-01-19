package org.example.hw_11.task_1;

import java.lang.reflect.Field;

public class ColorAnnotationValidationService implements LegoAnnotationService {
    ColorAnnotationValidationService colorValidation = new ColorAnnotationValidationService();
    private LegoColor[] restrictedColors = {LegoColor.BLACK, LegoColor.RED};

    @Override
    public LegoValidationResult validate(Object object) throws IllegalAccessException {
        Field[] declaredFields = object.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            Color annotation = declaredField.getAnnotation(Color.class);

            if (annotation != null) {
                declaredField.setAccessible(true);
                Object fieldValue = declaredField.get(object);

                boolean validationResult = fieldValue != restrictedColors;
            }
        }

        return null; // TODO: 19/12/2022 add validation

    }
}
