package car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import car.dto.StationDto;
import car.util.DBUtil;

/**
 * 충전소에 관한 DAO
 * 
 * @author hyunmoYang
 */
public class StationDao {

	public static String sql;

	/**
	 * 모든 충전소를 리스트에 추가하기 위해 DB에 select
	 * 
	 * @return list
	 */
	public static ArrayList<StationDto> getAllList() {
		ArrayList<StationDto> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		sql = "select * from station";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				list.add(new StationDto(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getString(5), rset.getString(6), rset.getInt(7)));
			}
		} catch (SQLException e) {
			System.err.println("station select에 관한 error");
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	} // end of getAllList()

	/**
	 * sId로 충전소를 찾기 위해 DB에 select
	 * 
	 * @param sId
	 * @return list
	 */
	public static ArrayList<StationDto> getIdList(int sId) {
		ArrayList<StationDto> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		sql = "select * from station where s_id=?";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sId);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				list.add(new StationDto(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getString(5), rset.getString(6), rset.getInt(7)));
			}
		} catch (SQLException e) {
			System.err.println("station select에 관한 error");
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}

	/**
	 * addrNum(addr_num)으로 충전소 찾기 위해 DB에 select _ 지역별
	 * 
	 * @param addrNum
	 * @return list
	 */
	public static ArrayList<StationDto> getAddrList(int addrNum) {
		ArrayList<StationDto> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		sql = "select * from station where addr_num=?";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, addrNum);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				list.add(new StationDto(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getString(5), rset.getString(6), rset.getInt(7)));
			}
		} catch (SQLException e) {
			System.err.println("station select에 관한 error");
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	} // end of getAddrList

	/**
	 * 검색어에 따라 충전소를 찾기 위해 DB에 select
	 * 
	 * @param words
	 * @return list
	 */
	public static ArrayList<StationDto> getWordsList(String words) {
		ArrayList<StationDto> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		sql = "select * from station" + " where s_name like '%" + words + "%'" + " or addr like '%" + words + "%'"
				+ " or type like '%" + words + "%'";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				list.add(new StationDto(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getString(5), rset.getString(6), rset.getInt(7)));
			}
		} catch (SQLException e) {
			System.err.println("station select에 관한 error");
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	} // end of getWordsList
	
	/**
	 *  사용자의 GPS 위치에 따라 충전소를 찾기 위해 DB에 select
	 * 
	 * @param words
	 * @return list
	 */
	public static ArrayList<StationDto> getGPSList(double latitude, double longitude) {
		ArrayList<StationDto> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		sql = "SELECT * FROM station WHERE (latitude BETWEEN ? AND ?) AND (longitude BETWEEN ? AND ?)";
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, latitude-0.04);
			pstmt.setDouble(2, latitude+0.04);
			pstmt.setDouble(3, longitude-0.04);
			pstmt.setDouble(4, longitude+0.04);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				list.add(new StationDto(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getString(5), rset.getString(6), rset.getInt(7)));
			}
		} catch (SQLException e) {
			System.err.println("station select에 관한 error");
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	} // end of getWordsList

} // end of class
