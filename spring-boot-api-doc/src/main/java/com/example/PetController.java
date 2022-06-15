package com.example;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pet")
@Api(value = "Benim Pet API dökümantasyonum")
public class PetController {

    private List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init(){
        petList.add(new Pet(1,"Test Pet", new Date()));
    }

    @PostMapping
    @ApiOperation(value = "Yeni Pet nesnesi ekleme metodu", notes = "Bu metodu kullanıken dikkatli olmalısın.")
    public ResponseEntity<Pet> ekle(@RequestBody @ApiParam(value = "hayvan") Pet pet){
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping
    @ApiOperation(value = "Pet Listesi metodu", notes = "Bu metod tümünü getirir.")
    public ResponseEntity<List<Pet>> tumunuListele(){
        return ResponseEntity.ok(petList);
    }

}
