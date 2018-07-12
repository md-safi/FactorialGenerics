public class Main {

    public static void main(String[] args) {

        Factorial<Integer> factorial=n->{
            int sum = 1;
            for (int i = 1; i <=n ; i++) {
                sum*=i;
            }
            return sum;
        };
        System.out.println(factorial.factorial(10));

    }
}
