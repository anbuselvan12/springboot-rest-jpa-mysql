package com.sample.spring.project;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "diettracking")
public class DietTracking {
	
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRACKID")
	private Long trackId;
	
	@Column(name = "DIET_TYPE")
	private String dietType;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "USER_ID", nullable = false)
	private User user;
	
	

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "DIET_ID", nullable = false)
	private DietInfo dietInfo;
	
	@Column(name = "DATE_OF_DIET")
	private Timestamp dateOfDiet;
	
	public DietTracking() {
		// TODO Auto-generated constructor stub
	}
	
	public DietTracking(Long trackId,String dietType,User user,DietInfo dietInfo,Timestamp dateOfDiet	)	{
		this.trackId = trackId;
		this.dietType =dietType;
		this.user = user;
		this.dietInfo = dietInfo;
		this.dateOfDiet = dateOfDiet;
	}
	
	

}
