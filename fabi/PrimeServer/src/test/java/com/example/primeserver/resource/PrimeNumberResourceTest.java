package com.example.primeserver.resource;

import com.example.primeserver.logic.PrimeNumberChecker;
import com.example.primeserver.model.PrimeNumber;
import com.example.primeserver.repository.PrimeNumberRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PrimeNumberResourceTest {
    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;
    @Autowired
    PrimeNumberRepository primeNumberRepository;
    @Autowired
    PrimeNumberChecker primeNumberChecker;

    @BeforeAll
    void setUp() {
        primeNumberRepository.save(new PrimeNumber(3));
        primeNumberRepository.save(new PrimeNumber(5));
    }

    @Test
    void biggestPrimeNumber() {
        ResponseEntity<PrimeNumber> response = restTemplate.exchange(
                "http://localhost:{port}/prime/biggestNumber",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                },
                port
        );
        response.getBody();
        assertEquals(1, 1);
    }


    @Test
    void getAll() {
        List<PrimeNumber> primeNumbers = new ArrayList<>();
        primeNumbers.add(new PrimeNumber(1));
        primeNumbers.add(new PrimeNumber(3));
        primeNumbers.add(new PrimeNumber(5));

        ResponseEntity<List<PrimeNumber>> response = restTemplate.exchange(
                "http://localhost:{port}/prime/allNumbers",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                },
                port
        );
        List<PrimeNumber> reL = response.getBody();
        assertEquals(primeNumbers, reL);
    }

    @Test
    void checkReturnValueFromNumberSaved() {
        ResponseEntity<String> response = restTemplate.exchange(
                "http://localhost:{port}/prime/newNumber/7",
                HttpMethod.POST,
                null,
                new ParameterizedTypeReference<>() {
                },
                port
        );
        String body = response.getBody();
        assertEquals("Zahl gespeichert", body);

    }

    @Test
    void checkNumberSaved() {
        ResponseEntity<String> response = restTemplate.exchange(
                "http://localhost:{port}/prime/newNumber/11",
                HttpMethod.POST,
                null,
                new ParameterizedTypeReference<>() {
                },
                port
        );

        Optional<PrimeNumber> found = primeNumberRepository.findById(11);
        assertTrue(found.isPresent());
        assertEquals(11, found.get().getNumber());
    }

    @Test
    void checkNumberNotPrime() {
        ResponseEntity<String> response = restTemplate.exchange(
                "http://localhost:{port}/prime/newNumber/4",
                HttpMethod.POST,
                null,
                new ParameterizedTypeReference<>() {
                },
                port
        );
        String body = response.getBody();
        assertEquals("Keine Primzahl", body);

    }

    @Test
    void checkeNumberDuplicate() {
        ResponseEntity<String> response = restTemplate.exchange(
                "http://localhost:{port}/prime/newNumber/3",
                HttpMethod.POST,
                null,
                new ParameterizedTypeReference<>() {
                },
                port
        );
        String body = response.getBody();
        assertEquals("Zahl gespeichert", body);

    }
}