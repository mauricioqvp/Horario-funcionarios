package com.stepinformatica.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stepinformatica.estudo.entities.Point;

@Repository
public interface PointRepository extends JpaRepository<Point, Long>{

}
