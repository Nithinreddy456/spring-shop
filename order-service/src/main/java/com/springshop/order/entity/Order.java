package com.springshop.order.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Order implements Serializable{

	private static final long serialVersionUID = 8454348387944935696L;
	
	@Id
	private String id;
	private String productName;
	private String customerName;
	private String address;
	
}
