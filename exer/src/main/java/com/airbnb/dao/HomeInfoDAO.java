package com.airbnb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.airbnb.dto.HomeDTO;
import com.airbnb.dto.HomeInfoDTO;
import com.airbnb.utils.DBHelper;

public class HomeInfoDAO implements IHomeInfoDAO {

	private Connection conn;
	private DBHelper dbHelper;
	
	
	public HomeInfoDAO() {
		dbHelper = new DBHelper();
		conn= dbHelper.getConnection();
	}

	@Override
	public HomeInfoDTO select(int home_id) {
		HomeInfoDTO homeInfoDTO = null;
		homeInfoDTO = new HomeInfoDTO(); 
		
		String strQry = " SELECT * FROM homeinfo  "
				+ " WHERE home_id =  ?  ";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(strQry);
			pstmt.setInt(1, home_id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				homeInfoDTO.setTitle(rs.getString("title"));
				homeInfoDTO.setLocation(rs.getString("location"));
				homeInfoDTO.setImage1(rs.getString("image1"));
				homeInfoDTO.setImage2(rs.getString("image2"));
				homeInfoDTO.setImage3(rs.getString("image3"));
				homeInfoDTO.setImage4(rs.getString("image4"));
				homeInfoDTO.setImage5(rs.getString("image5"));
				homeInfoDTO.setHost(rs.getString("host"));
				homeInfoDTO.setInfo(rs.getString("info"));
				homeInfoDTO.setSideimage1(rs.getString("sideimage1"));
				homeInfoDTO.setSideInfo1(rs.getString("sideInfo1"));
				homeInfoDTO.setSideInfo1_1(rs.getString("sideInfo1_1"));
				homeInfoDTO.setSideimage2(rs.getString("sideimage2"));
				homeInfoDTO.setSideInfo2(rs.getString("sideInfo2"));
				homeInfoDTO.setSideInfo2_1(rs.getString("sideInfo2_1"));
				homeInfoDTO.setSideimage3(rs.getString("sideimage3"));
				homeInfoDTO.setSideInfo3(rs.getString("sideInfo3"));
				homeInfoDTO.setSideInfo3_1(rs.getString("sideInfo3_1"));
			}
		} catch (SQLException e) {
			System.out.println("homeinfo select 에러 발생");
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return homeInfoDTO;
	}

	@Override
	public int insert() {
		return 0;
	}

}
