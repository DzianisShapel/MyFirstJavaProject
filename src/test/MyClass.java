package test;

public class MyClass {

    public static void main(String[] args) {
        MySubClass mySubClass = new MySubClass("constructor string from myClass");
        mySubClass.superClassMethod();
        System.out.println(mySubClass.superStr);
        mySubClass.subClassMethod();
        mySubClass.printCommonString();
        mySubClass.printCommonMethod();
    }



}
