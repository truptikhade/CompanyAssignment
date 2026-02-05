package com.example.assignment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.model.ItemAppModel;
import com.example.assignment.service.ItemAppService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/items")
public class ItemAppController {
	 private final ItemAppService itemAppService;
	 
	 public ItemAppController(ItemAppService itemAppService) {
		 this.itemAppService = itemAppService;
	 }

	 // Add new item
	 @PostMapping
	 public ResponseEntity<ItemAppModel> addItem(@Valid @RequestBody ItemAppModel itemAppModel) {
		 ItemAppModel savedItem = itemAppService.addItem(itemAppModel);
	     return ResponseEntity.ok(savedItem);
	 }

	 // Get item by ID
	 @GetMapping("/{id}")
	 public ResponseEntity<ItemAppModel> getItemById(@PathVariable Long id) {
	     return itemAppService.getItemById(id)
	    		 .map(ResponseEntity::ok)
	    		 .orElse(ResponseEntity.notFound().build());
	 }
}
