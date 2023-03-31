package com.airbnb.dao;

import java.util.ArrayList;

import com.airbnb.dto.HomeInfoDTO;

public interface IHomeInfoDAO {

	HomeInfoDTO select(int home_id);

	int insert();
}
