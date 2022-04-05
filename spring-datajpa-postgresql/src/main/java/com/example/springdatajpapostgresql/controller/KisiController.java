package com.example.springdatajpapostgresql.controller;

import com.example.springdatajpapostgresql.dto.KisiDto;
import com.example.springdatajpapostgresql.entity.Kisi;
import com.example.springdatajpapostgresql.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
public class KisiController {

    private final KisiService kisiService;

    @PostMapping
    public ResponseEntity<KisiDto> ekle(@RequestBody KisiDto kisiDto){
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }

    @GetMapping
    public ResponseEntity<List<KisiDto>> tumunuListele(){
        return ResponseEntity.ok(kisiService.getAll());
    }

}
