package test;

public class ControlStructures {

    enum myChar{
        A,
        B
    }

    public static void main(String[] args) {
       // ifElseCheck();
      //  forLoopCheck();
      //  forEachLoopCheck();
      //  whileLoopCheck();
        switchCheck();
    }

    public static void ifElseCheck(){
        boolean flag = true;
        String str = "myStr";

        if(str.equalsIgnoreCase("myStr") && flag){
            System.out.println("I am in if");
        } else {
            System.out.println("I am in else");
        }
    }

    public static void forLoopCheck(){
        for(int i = 0; i < 5; i++){
            System.out.println("i is " + i);
            if(i == 2){
                continue;
            }
        }
    }

    public static void forEachLoopCheck(){
            String[] myArray = {"a", "b", "c"};

            for(String str : myArray){
                System.out.println(str);
                if(str.equalsIgnoreCase("b")){
                    break;
                }
            }
    }

    public static void whileLoopCheck(){
        int i = 5;

        while (i > 0){
            System.out.println("i is " + i);
            i--;
            if(i == 3){
                break;
            }
        }
    }

    public static void switchCheck(){
        String str = "d";
        myChar nowChar = myChar.B;

        switch(nowChar){
            case A:
                System.out.println(nowChar);
                break;
            case B:
                System.out.println(nowChar);
                break;
        }
    }


}
