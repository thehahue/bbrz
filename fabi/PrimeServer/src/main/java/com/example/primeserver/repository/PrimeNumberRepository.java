package com.example.primeserver.repository;

import com.example.primeserver.model.PrimeNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimeNumberRepository extends JpaRepository<PrimeNumber, Integer> {

}
