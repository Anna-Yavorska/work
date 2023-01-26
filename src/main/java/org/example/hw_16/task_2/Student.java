package org.example.hw_16.task_2;

public class Student implements Comparable<Student> {
    String name //private
    String surname; //private

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Student o) {
        int surnameResult = this.getSurname().compareTo(o.getSurname());
        if (surnameResult != 0) {
            return surnameResult;
        }
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
