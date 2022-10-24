//Uses a linked list to implement the sieve of 
//Eratosthenes algorithm for finding prime numbers.

import java.util.*;

public class primeSieve {
    public static void main(String[] args) {
        System.out.print("This program will tell you all prime ");
        System.out.println("numbers up to a given maximum.");
        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int max = console.nextInt();

        List<Integer> primes = sieve(max);
        System.out.println(primes);
    }

    // Returns a list of all prime numbers up to given max
    // using the sieve of Eratosthenes algorithm.
    public static List<Integer> sieve(int max) {
        List<Integer> primes = new LinkedList<Integer>();

        // add all numbers from 2 to max to a list
        // only add number 2 and all other odd numbers
        List<Integer> numbers = new LinkedList<Integer>();

        if (max >= 2)
            numbers.add(2);

        for (int i = 3; i <= max; i += 2) {
            numbers.add(i);
        }

        while (!numbers.isEmpty()) {
            // remove a prime number from the front of the list
            int front = numbers.remove(0);
            primes.add(front);

            // remove all multiples of this prime number
            // stops when the first element of the numbers list is greater than
            // the square root of the maximum
            if ((double) front > Math.sqrt((double) numbers.get(numbers.size() - 1)))
                break;

            Iterator<Integer> itr = numbers.iterator();
            while (itr.hasNext()) {
                int current = itr.next();
                if (current % front == 0)
                    itr.remove();
            }
        }

        // add all leftover elements from numbers list to primes list
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            primes.add(itr.next());
            itr.remove();
        }
        return primes;
    }
}