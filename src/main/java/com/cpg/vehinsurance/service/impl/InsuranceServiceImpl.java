package com.cpg.vehinsurance.service.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpg.vehinsurance.entity.Insurance;
import com.cpg.vehinsurance.repository.InsuranceRepository;
import com.cpg.vehinsurance.repository.UserRepository;
import com.cpg.vehinsurance.repository.VehicleRepository;
import com.cpg.vehinsurance.service.InsuranceService;



@Service
public class InsuranceServiceImpl implements InsuranceService {
	@Autowired
	private InsuranceRepository insuranceRepository;

	// Invoking other repostory properties//
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private VehicleRepository vehicleRepository;

	public InsuranceServiceImpl(InsuranceRepository insuranceRepository, UserRepository userRepository,
			VehicleRepository vehicleRepository) {
		super();
		this.insuranceRepository = insuranceRepository;
		this.vehicleRepository = vehicleRepository;
		this.userRepository = userRepository;

	}

	@Override
	public List<Insurance> getAllInsurance() {
		// TODO Auto-generated method stub
		return insuranceRepository.findAll();
	}

	@Override
	public Insurance addInsurance(Insurance insurance) {

		insuranceRepository.save(insurance);
		// TODO Auto-generated method stub
		return insuranceRepository.save(insurance);

	}

	@Override
	public Insurance updateInsurance(Insurance insurance) {

		return insuranceRepository.save(insurance);
	}

	@Override
	public Insurance getInsuranceById(int ins_id) {
		// TODO Auto-generated method stub
		return insuranceRepository.findById(ins_id).get();
	}

	@Override
	public boolean deleteInsuranceById(int ins_id) {
		insuranceRepository.deleteById(ins_id);
		return false;
	}

}
