package com.xworkz.bar.dto;

import java.io.Serializable;

import com.xworkz.bar.constant.BarType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BarDTO implements Serializable {
	private Integer id;
	private String name;
	private String location;
	private BarType type=BarType.DEFALUT;
	private String avgCollectionPerDay;
	private String CollectionPerMonth;
	

}
