package com.cms.services;

import com.cms.dto.LogInDto;

public interface LogInService {

	public String validateEmail(String email);
	
	public long validateAndLogin(LogInDto cred);
}
