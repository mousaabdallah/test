package com.firstProject.firstProject.controllers;

import com.firstProject.firstProject.models.Shoes;
import com.firstProject.firstProject.repository.ShoesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(path = "/main")
@Slf4j
public class MainController {

    @Autowired
    private ShoesRepository shoesRepository;

    @RequestMapping(path = "/sub44",method = RequestMethod.GET)
    public String getName44() {
        return "ahmad44";
    }
    @RequestMapping(path = "/sub55",method = RequestMethod.GET)
    public String getName55(){
        return "ahmad33";
    }



    @RequestMapping(path = "/sub33",method = RequestMethod.GET)
    public String getName33(){
        return "ahmad33";

    }

    @RequestMapping(path = "/sub",method = RequestMethod.GET)
    public String getName(){
        return "ahmad";
    }

    @RequestMapping(path = "/shoes",method = RequestMethod.GET,produces="application/json")
    public List<Shoes> getShoes(){
        List<Shoes> shoes = shoesRepository.findAll();
        return shoes;
    }

    @RequestMapping(path = "/shoe",method = RequestMethod.GET,produces="application/json")
    public Shoes getShoe(){
        log.info("Hellooooooooo");
        Shoes shoe = shoesRepository.findFirstById(2);
        return shoe;
    }

    @RequestMapping(path = "/shoe123",method = RequestMethod.GET,produces="application/json")
    public Shoes getShoe123(){
        log.info("Hellooooooooo");
        Shoes shoe = shoesRepository.findFirstById(2);
        return shoe;
    }

    @RequestMapping(path = "/shoe123444",method = RequestMethod.GET,produces="application/json")
    public Shoes getShoe1234444(){
        log.info("Hellooooooooo");
        Shoes shoe = shoesRepository.findFirstById(2);
        return shoe;
    }


}
