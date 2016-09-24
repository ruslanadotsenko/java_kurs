package ru.stqa.pft.sandbox;

/**
 * Created by ruslana on 24.09.16.
 */
public class Primes {

    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){   //i++ это то же что и  i=i+1 или i+=1
            if (n % i == 0) {          //%-получение остатка от деления (проверяем что число делится без остатка)
                return false;
            }
        }

    return true;
    }

    public static boolean isPrimeFast(int n){
        for (int i = 2; i < n / 2; i++){   //i++ это то же что и  i=i+1 или i+=1
            if (n % i == 0) {          //%-получение остатка от деления (проверяем что число делится без остатка)
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeFasts(int n){
        int m = (int) Math.sqrt(n);
        for (int i = 2; i < m; i++){
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    //эта же функция с использованием цикла while
        public static boolean isPrimeWhile(int n){
            int i = 2;
            while (i < n && n % i == 0) {
                i++;
            }
            return i == n;
        }


        public static boolean isPrime(long n){
            for (long i = 2; i < n; i++){
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
