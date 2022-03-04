package com.cpg.vehinsurance.service;


import java.util.List;
import com.cpg.vehinsurance.entity.Insurance;
import com.cpg.vehinsurance.entity.Vehicle;
import com.cpg.vehinsurance.exception.VehicleNotFoundException;


public interface VehicleService {
	List<Vehicle> getAllVehicle();
	public Vehicle addVehicle(Vehicle vehicle);
	public Vehicle editVehicle(Vehicle vehicle);
	public boolean deleteVehicle(int  veh_id);
	public List<Vehicle> findVehiclesByUserId(long userId)throws VehicleNotFoundException; 
	public List<Vehicle> updateVehiclesByInsuranceId(long userId, int ins_id )throws VehicleNotFoundException;
	public Insurance findInsuranceByUserId(Long userId)throws VehicleNotFoundException;
}

