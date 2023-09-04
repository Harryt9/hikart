package com.hikart.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="SubCategories")

public class SubCategories implements Serializable {

	   @Id
	   private int id;
	   private String subCategoryName;
	    
}