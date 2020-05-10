package com.sample.spring.project;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name ="dietinfo")
public class DietInfo {

	
	@Column(name = "DIET_NAME")
	private String dietName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "DIET_ID")
	private Long dietId;
	
	@Column(name = "CALORISE")
	private Long calorise;
	
	@Column(name = "DATE_CREATED")
	private Date dateCrated;
	
    @OneToMany(mappedBy = "dietInfo", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<DietTracking> diettracking;
	
	public DietInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public DietInfo(String dietName,Long dietId,Long calorise,Date dateCreated) {
		this.dietName = dietName;
		this.dietId = dietId;
		this.calorise = calorise;
		this.dateCrated = dateCreated;
	}
}
