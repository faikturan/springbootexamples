package com.example.springmongorestapi.repository;

import com.example.springmongorestapi.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepository extends MongoRepository<Kullanici, String> {

}
