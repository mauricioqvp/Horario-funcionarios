package com.stepinformatica.estudo.entities;

import java.util.ArrayList;
import java.util.List;

public class PointOfMonth {

	private List<Point> month = new ArrayList<Point>();

	public void addDay(Point pt) {
		month.add(pt);
	}

}
