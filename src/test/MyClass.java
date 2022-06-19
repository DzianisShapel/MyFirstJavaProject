package test;

public class MyClass {

    int i = 5;
    String str = "Hello World";

    public MyClass(){

    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.stringCheck();

    }

    public MyClass initialize(){
        i = 6;
        return this;
    }

    public void stringCheck(){
        str = str.concat(" !!");
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        /** str = str.substring(6);
        System.out.println(str);*/
        str = str.substring(6, 11);
        System.out.println(str);
        boolean flag = str.equalsIgnoreCase("WORLD");
        System.out.println(flag);

        str = "5";
        int i = Integer.parseInt(str);
        System.out.println(i);

        i = 6;
        str = String.valueOf(i);
        System.out.println(i);

    }

}
