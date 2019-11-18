package com.firstProject.firstProject.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor
public class Shoes implements Serializable {

    @Id
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String type;

    @Getter
    @Setter
    private String color;

    @Getter
    @Setter
    int size;

}
