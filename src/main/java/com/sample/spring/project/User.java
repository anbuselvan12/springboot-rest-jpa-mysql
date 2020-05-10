package com.sample.spring.project;


import java.util.Date;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name ="user")
public class User {
	
	
	@Column(name ="USER_NAME")
	private String userName;
	
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name ="USER_ID" ,unique = true)
	private Integer userId;
	
	@Column(name ="AGE")
	private Integer age;
	
	@Column(name ="PREVIOUS_WEIGHT")
	private Double previouseWeight;
	
	@Column(name ="CURRENT_WEIGHT")
	private Double currentWeight;
	
	@Column(name ="DATE_CREATE")
	private Date dateCreated;
	
	@Column(name ="DATE_UPDATED")
	private Date dateUpdated;
	
	 @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	private Set<DietTracking> diettracking;
	
	 public User() {
		// TODO Auto-generated constructor stub
	}
	 public User(Integer userId,String userName,Integer age,Double previouseWeight, Double currentWeight, Date dateCreated, Date dateUpdated) {
		 
		 this.userId =userId;
		 this.userName = userName;
		 this.age = age;
		 this.previouseWeight = previouseWeight;
		 this.currentWeight = currentWeight;
		 this.dateCreated = dateCreated;
		 this.dateUpdated = dateUpdated;
		 
		 
	 }
	 
	 public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Double getPreviouseWeight() {
			return previouseWeight;
		}
		public void setPreviouseWeight(Double previouseWeight) {
			this.previouseWeight = previouseWeight;
		}
		public Double getCurrentWeight() {
			return currentWeight;
		}
		public void setCurrentWeight(Double currentWeight) {
			this.currentWeight = currentWeight;
		}
		public Date getDateCreated() {
			return dateCreated;
		}
		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}
		public Date getDateUpdated() {
			return dateUpdated;
		}
		public void setDateUpdated(Date dateUpdated) {
			this.dateUpdated = dateUpdated;
		}
		public Set<DietTracking> getDiettracking() {
			return diettracking;
		}
		public void setDiettracking(Set<DietTracking> diettracking) {
			this.diettracking = diettracking;
		}

}
