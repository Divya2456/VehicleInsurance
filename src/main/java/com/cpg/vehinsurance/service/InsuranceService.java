package com.cpg.vehinsurance.service;

import java.util.List;

import com.cpg.vehinsurance.entity.Insurance;


public interface InsuranceService {
	     List<Insurance> getAllInsurance();
	
		public Insurance  addInsurance(Insurance insurance);
		public Insurance updateInsurance(Insurance insurance);
		public boolean deleteInsuranceById(int  ins_id);
		public Insurance getInsuranceById(int ins_id);
		
	}

