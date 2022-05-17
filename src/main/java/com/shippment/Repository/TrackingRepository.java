package com.shippment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shippment.model.Tracking;

public interface TrackingRepository extends JpaRepository<Tracking, Integer> {


}
