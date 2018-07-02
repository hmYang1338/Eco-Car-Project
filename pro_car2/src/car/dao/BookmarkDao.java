package car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import car.dto.StationDto;
import car.util.DBUtil;

/**
 * 즐겨찾기에 관한 DAO
 * 
 * @author hyunmoYang
 */
public class BookmarkDao {

	private static String sql;

	/**
	 * 즐겨찾기 추가시 DB에 insert
	 * 
	 * @param id
	 * @param sId
	 * @return result
	 */
	public static int insert(String id, String sId) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		sql = "insert into bookmark values (bookmark_seq.nextval,?,?)";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, sId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("bookmark insert에 관한 error");
		} finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	} // end of insert()

	/**
	 * 중복되는 즐겨찾기인지 확인하기 위해 select
	 * 
	 * @param id
	 * @param sId
	 * @return result
	 */
	public static int removeOverlap(String id, String sId) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		sql = "select * from bookmark where id=? and s_id=?";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, sId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("bookmark select에 관한 error");
		} finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	} // end of removeOverlap()

	/**
	 * 즐겨찾기 목록을 DB에서 select
	 * 
	 * @param id
	 * @return list
	 */
	public static List<StationDto> getBookmarkList(String id) {
		List<StationDto> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		sql = "select s.s_id, s.s_name, s.addr, s.type, s.latitude, s.longitude, s.addr_num from station s"
				+ " inner join bookmark b on s.s_id = b.s_id" + " where b.id=?";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				list.add(new StationDto(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getString(5), rset.getString(6), rset.getInt(7)));
			}
		} catch (SQLException e) {
			System.err.println("bookmark select에 관한 error");
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	} // end of getBookmarkList()

	/**
	 * 즐겨찾기를 삭제시 DB에서 delete
	 * 
	 * @param id
	 * @param sId
	 * @return result
	 */
	public static int delete(String id, String sId) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		sql = "delete from bookmark where id=? and s_id=?";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, sId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("bookmark delete에 관한 error");
		} finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	} // end of delete()

} // end of class
