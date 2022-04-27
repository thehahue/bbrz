package com.example.primeserver.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "primenumber")
public class PrimeNumber {
    @Id
    int number;
}
