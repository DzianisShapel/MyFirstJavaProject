package test;

public class MyClass {

    public static void main(String[] args) {
        /**
        MySubClass mySubClass = new MySubClass("constructor string from myClass");
        mySubClass.superClassMethod();
        System.out.println(mySubClass.superStr);
        mySubClass.subClassMethod();
        mySubClass.printCommonString();
        mySubClass.printCommonMethod();*/

        Employee e = new FullTime();
        System.out.println("Full time employee salary is: " + e.salary());

        FullTime f = new FullTime();
        f.myMethod();

        e = new Contractor();
        System.out.println("Contractor salary is: " + e.salary());
        //we do not use instance. we use class name directly
        System.out.println(Employee.designation());
        System.out.println(FullTime.designation());
        System.out.println(Contractor.designation());

        MyOverloadingClass myOverloadingClass = new MyOverloadingClass();
        MyOverloadingClass.myMethod(5);
        MyOverloadingClass.myMethod("my string", 5);
        MyOverloadingClass.myMethod("my String");


    }



}
