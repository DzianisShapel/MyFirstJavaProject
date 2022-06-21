package test;

public class FullTime extends Employee{

    @Override
    int salary(){
        return base + 20000;
    }

    void myMethod(){
        System.out.println();
    }

    static String designation(){
        return "full time";
    }
}
