package com.example.springdatajpapostgresql.dto;

import com.sun.istack.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class KisiDto {

    private Long id;

    @NotNull
    private String adi;

    private String soyadi;

    private List<String> adresler;
}
