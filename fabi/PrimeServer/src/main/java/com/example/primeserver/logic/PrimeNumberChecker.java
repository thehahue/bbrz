package com.example.primeserver.logic;

import com.example.primeserver.model.PrimeNumber;
import com.example.primeserver.repository.PrimeNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrimeNumberChecker {
    @Autowired
    private PrimeNumberRepository primeNumberRepository;

    public boolean checkPrimeNumber(int number) {

        int count = 100;
        if (number < 100) {
            count = number - 1;
        }
        for (int i = 2; i <= count; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkDuplicateNumber(int number) {

        List<PrimeNumber> primeNumbers = primeNumberRepository.findAll();
        if (primeNumbers.contains(number)) {
            return true;
        }
        return false;
    }
}
