package lab2;

public class Main {

    public static void main(String[] args) {

        int x=10;
        int y=5;
        float result = sum(x,y) ;
        System.out.println(result);
        result = substract(x,y);
        System.out.println(result);
        result = average(x,y);
        System.out.println(result);
        result = division(x,y);
        System.out.println(result);


    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static int substract(int first, int second) {

        int substract = second - first;
                return substract;

    }
    public static int average(int first, int second) {

        int average = second * first;
        return average;

    }
    public static int division(int first, int second) {

        int divition = second / first;
        return divition;

    }


}
