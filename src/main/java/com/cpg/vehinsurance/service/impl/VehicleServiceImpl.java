package com.cpg.vehinsurance.service.impl;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.cpg.vehinsurance.entity.Insurance;
import com.cpg.vehinsurance.entity.User;
import com.cpg.vehinsurance.entity.Vehicle;
import com.cpg.vehinsurance.exception.VehicleNotFoundException;
import com.cpg.vehinsurance.repository.InsuranceRepository;
import com.cpg.vehinsurance.repository.VehicleRepository;
import com.cpg.vehinsurance.service.VehicleService;



@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private VehicleRepository vehicleRepository;
    
	private InsuranceRepository insuranceRepository;
	public VehicleServiceImpl(VehicleRepository vehicleRepository, InsuranceRepository insuranceRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
		this.insuranceRepository = insuranceRepository;

	}

	@Override
	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		return vehicleRepository.findAll();
	}

	@Override // add vehicle details//
	public Vehicle addVehicle(Vehicle vehicle) {

		vehicleRepository.save(vehicle);
		return vehicleRepository.save(vehicle);
	}

	@Override
	public Vehicle editVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteVehicle(int veh_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Vehicle> findVehiclesByUserId(long userId) throws VehicleNotFoundException {
		// TODO Auto-generated method stub
		List<Vehicle> vehicleList = null;//vehicleRepository.findAll();
		vehicleList=vehicleRepository.findAll();
		
		System.out.println(vehicleList.size());
		boolean flag=false;
		//System.out.println(vehicleList);
		User user=null;
		List<Vehicle> vehicleList2=new ArrayList();
		for( Vehicle vehicle :vehicleList) {
			//System.out.println(vehicle.getVeh_id());
			//System.out.println(vehicle.getUser().getUserId()+ " "+ userId);
			user  = vehicle.getUser();
			if ( user.getUserId() == userId) {
				flag = true;
				vehicleList2.add(vehicle);
				
			}
			
		}
		System.out.println("$$$$$$"+ vehicleList2.size());
	
		
			
		
		
		  if(flag) {
		  
		  return vehicleList2; } else {
		  
			  throw  new VehicleNotFoundException("VehicleNotFound");/// have to throw excp // } //original code//
		  
		  }
		 
	}

	@Override
	public List<Vehicle> updateVehiclesByInsuranceId(long userId, int ins_id) throws VehicleNotFoundException {
		List<Vehicle> vehicleList=null;//findVehiclesByUserId(userId);
		vehicleList =findVehiclesByUserId(userId);
		 Insurance insurance =insuranceRepository.findById(ins_id).get();
		
		 for(Vehicle vehicle:vehicleList) {
			 vehicle.setInsurance(insurance);
				vehicleRepository.save(vehicle);
				 
		 }
		 
		return vehicleList;
	}

	@Override
	public Insurance findInsuranceByUserId(Long userId) throws VehicleNotFoundException {
		List<Vehicle> vehicleList=findVehiclesByUserId(userId);
		Insurance insurance=vehicleList.iterator().next().getInsurance();
		System.out.println( insurance.getIns_id());
		return insurance;
	}
	
	}

