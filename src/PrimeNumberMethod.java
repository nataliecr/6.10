import java.util.Scanner;

public class PrimeNumberMethod {
    public static void main(String[] args) {
       int count = 0;
       
       for (int i = 2; i < 10000; i++){
         if (isPrime(i) == true)
           count++;  
       } // for
       
       System.out.println("The number of primes less than 10000 is " + count);
    } // main

   public static void printPrimeNumbers(int numberOfPrimes) {
     final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
     int count = 0; // Count the number of prime numbers
     int number = 2; // A number to be tested for primeness

     // Repeatedly find prime numbers
     while (count < numberOfPrimes) {
       // Print the prime number and increase the count
       if (isPrime(number)) {
         count++; // Increase the count
         if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
           // Print the number and advance to the new line
           System.out.printf("%-5s\n", number);
         } // if
         else
           System.out.printf("%-5s", number);
       } // if

       // Check whether the next number is prime
       number++;
     } // while
   } // printPrimeNumbers

 /** Check whether number is prime */
   public static boolean isPrime(int number) {
     for (int divisor = 2; divisor <= number / 2; divisor++) {
       if (number % divisor == 0) { // If true, number is not prime
       return false; // Number is not a prime
       } // if  
     } // for
    
     return true; // Number is prime
   } // isPrime

} // PrimeNumberMethod