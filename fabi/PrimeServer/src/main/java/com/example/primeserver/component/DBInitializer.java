package com.example.primeserver.component;

import com.example.primeserver.model.PrimeNumber;
import com.example.primeserver.repository.PrimeNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DBInitializer {

    @Autowired
    private PrimeNumberRepository primeNumberRepository;

    @EventListener(ApplicationReadyEvent.class)
    @Transactional
    public void handleApplicationReady(){
        PrimeNumber primeNumber = new PrimeNumber(1);
        primeNumberRepository.save(primeNumber);
    }

}
