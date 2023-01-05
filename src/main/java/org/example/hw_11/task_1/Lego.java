package org.example.hw_11.task_1;

public class Lego {
    @NotEmpty
    private String type;

    @Quantity(min = 5, max = 30)
    private Integer elementsQuantity;

    @NotEmpty
    private String serial;
    @Color
    LegoColor red = LegoColor.RED;

    public Lego(String type, Integer elementsQuantity, String serial, LegoColor red) {
        this.type = type;
        this.elementsQuantity = elementsQuantity;
        this.serial = serial;
        this.red = red;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getElementsQuantity() {
        return elementsQuantity;
    }

    public void setElementsQuantity(Integer elementsQuantity) {
        this.elementsQuantity = elementsQuantity;
    }

    public String getSerial() {
        return serial;
    }

    public LegoColor getRed() {
        return red;
    }

    public void setRed(LegoColor red) {
        this.red = red;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
