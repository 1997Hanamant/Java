package com.xworkz.honeybees.resort.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table (name="resort_info")
public class ResortEntity {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="checkinTime")
	private LocalTime checkinTime;
	@Column(name="checkoutTime")
	private LocalTime checkoutTime;
	@Column(name="createBy")
	private String createBy;
	@Column(name="createDate")
	private LocalDate createDate;
	@Column(name="updatedDate")
	private LocalDate updatedDate;
	@Column(name="ownerName")
	private String ownerName;
	@Column(name="pricePerDay")
	private double pricePerDay;
	
	

}
