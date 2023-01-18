package org.example.hw_14.task_1;

public class DogClipper <T> extends Clipper<T>{
    /*
    у тебя Е и Т - это разные типы, получается бессмысленный дженерик, т.к. я могу сделать что-то вроде:
    
    DogClipper<Integer> integerClipper = new DogClipper<>(new String[] {}); - т.е. дженерик вроде Integer,
    а передаю в конструктор массив String и это будет работать
    */
    public <E> DogClipper(E[] type) {
        super(type);
    }
}
