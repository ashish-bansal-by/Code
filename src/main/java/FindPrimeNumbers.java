import java.util.*;
import java.lang.*;
import java.util.stream.*;

class FindPrimeNumber {
    public static void main(String args[]) {
        List<Integer> number = Arrays.asList(2,3,4,5,6,7,8,9,10);
        List<Integer> primeNumbers = number.stream().filter(n->isPrime(n)).
                collect(Collectors.toList());
        System.out.println(primeNumbers);
    }
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}