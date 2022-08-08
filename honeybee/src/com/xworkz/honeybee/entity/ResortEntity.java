package com.xworkz.honeybee.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class ResortEntity {
private Integer id;
private String name;
private String location;
private LocalTime checkinTime;
private LocalTime checkouTtime;
private String createdBy;
private LocalDate createDate;
private LocalDate updatedDate;
private String owner;
private double priceperDay;



}
