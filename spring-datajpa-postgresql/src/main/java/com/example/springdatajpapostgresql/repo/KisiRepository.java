package com.example.springdatajpapostgresql.repo;

import com.example.springdatajpapostgresql.entity.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KisiRepository extends JpaRepository<Kisi, Long> {
}
