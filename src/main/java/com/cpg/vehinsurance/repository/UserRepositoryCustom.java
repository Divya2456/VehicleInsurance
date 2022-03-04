package com.cpg.vehinsurance.repository;

import com.cpg.vehinsurance.entity.User;

public interface UserRepositoryCustom {
	 User findUser(String username, String password);

}
