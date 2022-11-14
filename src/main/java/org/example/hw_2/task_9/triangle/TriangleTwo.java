package org.example.hw_2.task_9.triangle;

public class MirrorTriangle {
    public static void main(String[] args) {
       for ( int i = 0; i < 4; i++){
           if (i == 0) {
               System.out.println("****");
           }else{
               if (i == 1) {
                   System.out.println(" ***");
               }else {
                   if (i == 2) {
                       System.out.println("  **");
                   }else {
                       if (i == 3){
                           System.out.println("   *");
                       }
                   }
               }
           }
       }
    }
}
