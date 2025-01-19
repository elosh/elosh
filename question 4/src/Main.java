import java.util.*;
class MAIN {

    public static void numberFour(){
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Please enter value for index " + i + ": ");

            inputs[i] = scanner.nextLine();
        }

        for(int i = 0; i < 10; i++){
            System.out.println("You entered the value: " + inputs[i] + " in index " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Question 4: \n");
        numberFour();
    }
    }