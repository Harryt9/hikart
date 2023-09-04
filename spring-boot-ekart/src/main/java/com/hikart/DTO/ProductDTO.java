package com.hikart.DTO;

import com.hikart.entity.Categories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	   
	private int productId;
	private String productName;
	private Categories category;

}
