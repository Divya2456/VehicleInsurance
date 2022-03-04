package com.cpg.vehinsurance.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpg.vehinsurance.entity.Insurance;



@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {
	
	//purchasing policy based on vehicle type//
	// public boolean purchaseInsurance(String policyType);

}
