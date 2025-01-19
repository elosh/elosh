import java.util.*;
class MAIN {
public static void numberTwoA(){
    for(int a = 0; a < 6; a++){
        if(a < 3){
            System.out.println("****======");
        }
        else {
            System.out.println("==========");
        }
    }
}

public static void numberTwoB(){
    for(int i = 0; i < 6; i++){
        for(int j = 0; j < 10; j++){
            if(i < 3 && j < 4){
                System.out.print("*");
            }
            else {
                System.out.print("=");
            }
        }
        System.out.print("\n");
    }
}
public static void main(String[] args) {
 System.out.println("Question 2a: \n");
    numberTwoA();
        System.out.println("Question 2b: \n");
    numberTwoB();
}
}