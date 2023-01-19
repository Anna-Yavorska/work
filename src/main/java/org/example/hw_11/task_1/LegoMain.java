package org.example.hw_11.task_1;

public class LegoMain {
    public static void main(String[] args) throws IllegalAccessException {
        Lego lego = new Lego("", 0, " ", LegoColor.RED);
LegoValidationResult legoValidationResult = new LegoValidationResult();
        LegoAnnotationService[] validationServices = new LegoAnnotationService[3];
        validationServices[0] = new QuantityAnnotationValidationService();
        validationServices[1] = new NotEmptyAnnotationValidationService();
       // validationServices[2] = new ColorAnnotationValidationService();

        for (LegoAnnotationService validationService : validationServices) {
            LegoValidationResult validate = validationService.validate(lego);
        }
    }
}