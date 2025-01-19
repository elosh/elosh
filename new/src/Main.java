
import java.util.*;
class MAIN {

    public static void numberOneA(){
        for(int a = 0; a < 4; a++){
            System.out.println("****====****");
        }
    }

    public static void numberOneB(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("*");
            }
            for(int k = 0; k < 4; k++){
                System.out.print("=");
            }
            for(int l = 0; l < 4; l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }   public static void main(String[] args) {
        System.out.println("Question 1a: \n");
        numberOneA();
        System.out.println("Question 1b: \n");
        numberOneB();
    }
}