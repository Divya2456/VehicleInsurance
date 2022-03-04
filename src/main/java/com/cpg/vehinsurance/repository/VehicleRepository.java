package com.cpg.vehinsurance.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpg.vehinsurance.entity.Vehicle;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
 
	
	//List<Vehicle> findById(int veh_id);
	//Vehicle findByVehicleID(Long veh_id);//

}
