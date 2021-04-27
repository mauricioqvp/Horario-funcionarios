package com.stepinformatica.estudo.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stepinformatica.estudo.entities.Point;

@RestController
@RequestMapping(value = "/points")
public class PointResource {
	
	@GetMapping
	public ResponseEntity<List<Point>> findAll(){
		List<Point> points = new ArrayList<>();
		Point p1 = new Point(1L, Instant.now(),Instant.now(),Instant.now(),Instant.now(),Instant.now(),Instant.now());
		Point p2 = new Point(2L, Instant.now(),Instant.now(),Instant.now(),Instant.now(),Instant.now(),Instant.now());
		points.add(p1);
		points.add(p2);
		return ResponseEntity.ok().body(points);
	}

}
