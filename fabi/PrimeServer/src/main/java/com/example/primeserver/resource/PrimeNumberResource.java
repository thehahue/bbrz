package com.example.primeserver.resource;

import com.example.primeserver.logic.PrimeNumberChecker;
import com.example.primeserver.model.PrimeNumber;
import com.example.primeserver.repository.PrimeNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/prime")
public class PrimeNumberResource {
    @Autowired
    private PrimeNumberChecker primeNumberChecker;

    @Autowired
    private PrimeNumberRepository primeNumberRepository;

    @GetMapping("/biggestNumber")
    public int biggestPrimeNumber() {
        int index = primeNumberRepository.findAll().size();
        List<PrimeNumber> primeNumbers = primeNumberRepository.findAll();
        PrimeNumber primeNumber = primeNumbers.get(index - 1);
        return primeNumber.getNumber();
    }

    @GetMapping("/allNumbers")
    public List<PrimeNumber> getAll() {
        List<PrimeNumber> primeNumbers = primeNumberRepository.findAll();
        return primeNumbers;
    }

    @PostMapping("/newNumber/{number}")
    public String createNumber(@PathVariable String number) {
        int newNumber = Integer.parseInt(number);
        if (!primeNumberChecker.checkDuplicateNumber(newNumber)) {
            if (primeNumberChecker.checkPrimeNumber(newNumber)) {
                PrimeNumber primeNumber = new PrimeNumber(newNumber);
                primeNumberRepository.save(primeNumber);
                return "Zahl gespeichert";
            } else {
                return "Keine Primzahl";
            }
        }
        return "Nummer schon vorhanden";
    }


}
