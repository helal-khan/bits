package com.bits.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bits.model.District;
import com.bits.repository.DistrictRepository;

@RestController
@RequestMapping("/api/v1/districts")
public class DistrictController {
	
	@Autowired
	private DistrictRepository districtRepository;
	
	//get all
	@GetMapping
	public List<District> getAllDistrict(){
		return districtRepository.findAll();
	}
	//get
	//create
	//update
	//delete

}
