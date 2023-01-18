package org.example.hw_14.task_1;

// а зачем каждый раз наследоваться от Clipper? Ты можешь создать поле типа Т и оставить typeOfClipper
public class Clipper<T> {
    private String typeOfClipper;

    public <E> Clipper(E[] type) { // Можно сделать и массив, но в задании был один аргумент. В твоем случае тип всегда будет "массив чего-нибудь"
        typeOfClipper = type.getClass().getName();
    }

    public String getTypeOfClipper() {
        return typeOfClipper;
    }
}
