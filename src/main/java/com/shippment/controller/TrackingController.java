package com.shippment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shippment.dto.MessageDTO;
import com.shippment.model.Tracking;
import com.shippment.service.TrackingService;

@RestController
public class TrackingController {

	@Autowired
	TrackingService service;

	@PostMapping("tracking/addRequirment")
	public ResponseEntity<?> insertTracking(@RequestBody Tracking tracking) {
		try {
			Tracking list = service.insert(tracking);
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {

			MessageDTO message = new MessageDTO(e.getMessage());
			return new ResponseEntity<>(message.getMessage(), HttpStatus.BAD_REQUEST);

		}

	}
	
	@GetMapping("tracking/GetAllDetails")
	public ResponseEntity<?> getAllDetails() {
		try {
			List<Tracking> list = service.GetAll();
			return new ResponseEntity<>(list, HttpStatus.OK);
		}catch(Exception e) {
			
			MessageDTO message = new MessageDTO(e.getMessage());
			return new ResponseEntity<>(message.getMessage(), HttpStatus.BAD_REQUEST);
			
		}
	}

	// @GetMapping("tracking/updateLocation")

}
