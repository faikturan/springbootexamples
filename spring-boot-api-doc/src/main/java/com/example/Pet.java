package com.example;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Benim Pet Nesnem", description = "Benim Pet")
public class Pet {
    private int id;
    private String name;
    private Date date;


}
