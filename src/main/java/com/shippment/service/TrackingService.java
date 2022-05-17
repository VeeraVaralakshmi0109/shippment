package com.shippment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.shippment.Repository.TrackingRepository;
import com.shippment.model.Tracking;

@Configuration
public class TrackingService {

	@Autowired
	TrackingRepository repository;

	public List<Tracking> GetAll() throws Exception {
		List<Tracking> list = null;
		try {
			list = repository.findAll();
		} catch (Exception e) {
			throw new Exception("records not fount");
		}
		return list;

	}

	public Tracking insert(Tracking sipment) throws Exception {
		Tracking list = null;
		try {
			list = repository.save(sipment);
		} catch (Exception e) {
			throw new Exception("records not fount");
		}
		return list;

	}

}
