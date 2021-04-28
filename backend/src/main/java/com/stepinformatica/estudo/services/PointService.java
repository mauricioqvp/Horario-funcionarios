package com.stepinformatica.estudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stepinformatica.estudo.entities.Point;
import com.stepinformatica.estudo.repositories.PointRepository;

@Service
public class PointService {

	@Autowired
	private PointRepository pointRepository;
	
	public List<Point>findAll() {
		return pointRepository.findAll();
	}
}
