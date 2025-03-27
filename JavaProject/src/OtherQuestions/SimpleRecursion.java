package OtherQuestions;

public class SimpleRecursion {


    public int sumOfNumbers(int n){

        if(n == 0){
            return 0;
        }

        return n + sumOfNumbers(n-1);

    }

    public int factorialOfNumber(int n){
        if(n == 1){
            return 1;
        }

        return n*factorialOfNumber(n - 1);
    }

    public static void main(String[] args) {
        SimpleRecursion sr = new SimpleRecursion();
        System.out.println(sr.sumOfNumbers(6));
        System.out.println(sr.factorialOfNumber(3));
    }


}
