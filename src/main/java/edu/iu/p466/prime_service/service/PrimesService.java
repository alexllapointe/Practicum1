package edu.iu.p466.prime_service.service;

public class PrimesService implements IPrimeService{

    @Override
    public boolean isPrime(long n){
        if (n==2) return true;
        for(int i = 2; i < n; i++){
            if (n% i == 0) return false;
        }
        return true;
    }

}
