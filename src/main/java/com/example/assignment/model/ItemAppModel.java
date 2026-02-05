package com.example.assignment.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ItemAppModel {
	private Long id;

	@NotBlank(message = "Name is required")
	private String name;
	    
	@NotBlank(message = "Product company name required")
	private String companyName;

	@NotBlank(message = "Description is required")
	private String description;

    @NotNull(message = "Price is required")
	private Double price;
}
