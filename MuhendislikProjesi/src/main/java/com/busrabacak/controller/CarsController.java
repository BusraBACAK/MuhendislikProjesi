package com.busrabacak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.busrabacak.entity.Cars;
import com.busrabacak.repository.CarsRepository;

@RestController
@RequestMapping("cars")
public class CarsController {

	@Autowired
	CarsRepository carsRepository;
	
	@GetMapping
	public ResponseEntity<List<Cars>> getCars()
	{
		return new ResponseEntity<List<Cars>>(carsRepository.findAll(),HttpStatus.OK);
	}
	
	
	@GetMapping("search")
	public ResponseEntity<List<Cars>> serachCars(@RequestParam("s") String s)
	{
		return new ResponseEntity<List<Cars>>(carsRepository.getSearch(s),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> setCars(@RequestBody Cars cars)
	{
		carsRepository.save(cars);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Void> updateCars(@RequestBody Cars cars)
	{
		carsRepository.save(cars);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> deleteCars(@RequestParam("id") int id)
	{
		carsRepository.delete(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	

}
