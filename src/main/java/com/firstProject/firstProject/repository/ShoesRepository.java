package com.firstProject.firstProject.repository;

import com.firstProject.firstProject.models.Shoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes,Integer> {

    public Shoes findFirstById(int id);
}
