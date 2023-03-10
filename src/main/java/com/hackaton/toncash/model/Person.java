package com.hackaton.toncash.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Builder
@Document(collection = "persons")
public class Person {
    @Id
    private long id;

    private String username;

    private Set<String> currentOrders;
    private Set<String> finishedOrders;
    private Set<String> badOrders;

    private Set<String> community;
    private float rank;

    public Person() {
        this.currentOrders = new HashSet<>();
        this.finishedOrders = new HashSet<>();
        this.badOrders = new HashSet<>();
        this.community = new HashSet<>();
    }
}
