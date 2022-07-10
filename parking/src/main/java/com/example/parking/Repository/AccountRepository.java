package com.example.parking.Repository;

import com.example.parking.models.Account;
import com.example.parking.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, Integer> {
}
