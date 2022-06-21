package test;

public class MyOverloadingClass {

    public static void myMethod(String str){
        System.out.println(str);
    }

    public static void myMethod(String str, int i){
        System.out.println(str + i);
    }

    public static void myMethod(int i){
        System.out.println(i);
    }


}
