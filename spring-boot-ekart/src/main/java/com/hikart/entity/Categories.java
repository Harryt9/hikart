package com.hikart.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Categories")

public class Categories implements Serializable {
       
	   @Id
	   private int id;
	   private String categoryName;
	   
	   @OneToMany
	   @JoinColumn(name="subCategoriesId")
	   private SubCategories subCategories;
	   
	
}