package org.example.hw_17.task_1;

//+
public class ConvertingService {
    String convertToString(Integer integer) {
        String toString = integer.toString();

        if (toString.endsWith("11") | toString.endsWith("12") | toString.endsWith("13") | toString.endsWith("14") | toString.endsWith("15") | toString.endsWith("16") | toString.endsWith("17") | toString.endsWith("18") | toString.endsWith("19")) {
            return toString.concat(" гривен");
        }
        if (toString.endsWith("1")) {
            return toString.concat(" гривна");
        }
        if (toString.endsWith("2") | toString.endsWith("3") | toString.endsWith("4")) {
            return toString.concat(" гривны");
        } else {
            return toString.concat(" гривен");
        }
    }
}
