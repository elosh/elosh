import java.util.*;
class MAIN {

    public static void numberThree(){
    double[] numbers = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12, 8};

    double sum = 0;

    for(int i = 0; i < numbers.length; i++){
        sum += numbers[i];
    }

    double mean = sum/numbers.length;


    double median;

    if(numbers.length % 2 == 0){
        int middleIndex = numbers.length/2;
        median = (numbers[middleIndex] + numbers[middleIndex+1])/2;
    }
    else {
        int middleIndex = numbers.length/2;
        median = numbers[middleIndex];
    }

    int N = numbers.length;

    double devSum = 0;
    for(int i = 0; i < numbers.length; i++){
        devSum = numbers[i] - mean;
    }

    double standardDeviation = Math.sqrt((devSum*devSum)/N);

    System.out.println("Mean: " + mean + "\nMedian: " + median + "\nStandard Deviation: " + standardDeviation);
}
    public static void main(String[] args) {
 System.out.println("Question 3: \n");
    numberThree();
}
}
