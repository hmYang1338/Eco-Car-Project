package car.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import car.dto.AddressDto;
import car.util.DBUtil;

/**
 * 17개의 지역에 관한 Data Access Object
 * 
 * @author hyunmoYang
 */
public class AddressDao {

	private static String sql;

	/**
	 * 모든 지역 리스트 추가
	 * 
	 * @return list
	 */
	public static ArrayList<AddressDto> getAllList() {
		ArrayList<AddressDto> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		sql = "select * from address";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				list.add(new AddressDto(rset.getInt(1), rset.getString(2)));
			}
		} catch (SQLException e) {
			System.err.println("address select에 관한 DB error");
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	} // end of getAllList()

} // end of class
