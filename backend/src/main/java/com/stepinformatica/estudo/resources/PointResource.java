package com.stepinformatica.estudo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stepinformatica.estudo.entities.Point;
import com.stepinformatica.estudo.services.PointService;

@RestController
@RequestMapping(value = "/points")
public class PointResource {

	@Autowired
	private PointService pointService;

	@GetMapping
	public ResponseEntity<List<Point>> findAll() {
		List<Point> points = pointService.findAll();
		return ResponseEntity.ok().body(points);
	}

}
