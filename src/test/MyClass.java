package test;

public class MyClass {

// i - here is a class level variable (instance variable)
    int i;

//method  with the name of class name. It means it is a constructor
    public MyClass(){
        i = 6;
    }
/*we can create multiple constructors in  a particular class
It is possible because we are using different arguments
 */
    public MyClass(int i){
            this.i=i;
    }

    public static void main(String[] args) {
    /*create a new instance of particular class,
    and we can use class object and access the variable*/
        MyClass myClass = new MyClass(7);
//        myClass.initialize();
        System.out.println(myClass.i);
    }

    public void initialize(){
            i = 5;
    }
}
