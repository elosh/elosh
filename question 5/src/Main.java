
import java.util.*;
class MAIN {
    public static void numberFive(){
        Scanner scanner = new Scanner(System.in);
        String[][] inputs = new String[10][10];

        for(int i = 0; i < 10; i++){
            String[] inner = new String[10];

            for(int j = 0; j < 10; j++){
                System.out.println("Please enter value for index where X:" + i + ", Y:" + j + " : ");
                inner[j] = scanner.nextLine();
            }

            inputs[i] = inner;
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.println("You entered the value: " + inputs[i][j] + " in X: " + i + ", Y:" + j);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Question 5: \n");
        numberFive();
    }
}
