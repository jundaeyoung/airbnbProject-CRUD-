package com.airbnb.service;

import java.util.ArrayList;

import com.airbnb.dao.HomeInfoDAO;
import com.airbnb.dto.HomeInfoDTO;

public class homeInfoService {

	private HomeInfoDAO homeInfoDAO;
	public homeInfoService() {
		homeInfoDAO = new HomeInfoDAO();
	}
	public HomeInfoDTO homeInfoSelect(int home_id) {
		HomeInfoDTO resultDTO = homeInfoDAO.select(home_id);
		return resultDTO;
		
	}
	
}
