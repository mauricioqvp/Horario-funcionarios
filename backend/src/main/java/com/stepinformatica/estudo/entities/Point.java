package com.stepinformatica.estudo.entities;

import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_points")
public class Point implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant dayDate;
	private Instant arrival;
	private Instant lunch;
	private Instant returnToWork;
	private Instant departure;
	private Instant total;
		
	LocalDateTime inicio = LocalDateTime.of(2017, 1, 25, 10, 00, 00);
	LocalDateTime termino = LocalDateTime.of(2017, 12, 26, 11, 20, 15);
	
	public Point() {
	}

	public Point(Long id, Instant dayDate, Instant arrival, Instant lunch, Instant returnToWork, Instant departure,
			Instant total) {
		super();
		this.id = id;
		this.dayDate = dayDate;
		this.arrival = arrival;
		this.lunch = lunch;
		this.returnToWork = returnToWork;
		this.departure = departure;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getDayDate() {
		return dayDate;
	}

	public void setDayDate(Instant dayDate) {
		this.dayDate = dayDate;
	}

	public Instant getArrival() {
		return arrival;
	}

	public void setArrival(Instant arrival) {
		this.arrival = arrival;
	}

	public Instant getLunch() {
		return lunch;
	}

	public void setLunch(Instant lunch) {
		this.lunch = lunch;
	}

	public Instant getReturnToWork() {
		return returnToWork;
	}

	public void setReturnToWork(Instant returnToWork) {
		this.returnToWork = returnToWork;
	}

	public Instant getDeparture() {
		return departure;
	}

	public void setDeparture(Instant departure) {
		this.departure = departure;
	}

	public Instant getTotal() {
		return total;
	}

	public void setTotal(Instant total) {
		this.total = total;
	}

	public Instant calcDifference() {
		Duration duracao = Duration.between(inicio.toLocalDate(), termino.toLocalDate());
		return null;
	}

	public Instant calcSum() {
		return null;
	}

	public Integer instantToInt() {
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
