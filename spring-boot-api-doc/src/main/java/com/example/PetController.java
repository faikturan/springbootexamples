package com.example;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pet")
@Api(value = "Benim Pet API dökümantasyonum")
public class PetController {

    private List<Pet> petList = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Pet> ekle(@RequestBody Pet pet){
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping
    public ResponseEntity<List<Pet>> tumunuListele(){
        return ResponseEntity.ok(petList);
    }

}
