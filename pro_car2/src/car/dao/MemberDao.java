package car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import car.util.DBUtil;

/**
 * 회원에 관한 DAO
 * 
 * @author hyunmoYang
 */
public class MemberDao {

	private static String sql;

	/**
	 * 로그인시 id&pw 확인 위해 DB에 select
	 * 
	 * @param id
	 * @param pw
	 * @return result
	 */
	public static int loginCheck(String id, String pw) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		sql = "select * from member where id=? and pw=?";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("member select에 관한 error");
			e.printStackTrace();
		} finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	} // end of loginCheck()

	/**
	 * 회원가입시 DB에 insert
	 * 
	 * @param id
	 * @param pw
	 * @param name
	 * @param email
	 * @return result
	 */
	public static int insertMember(String id, String pw, String name, String email) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		sql = "insert into member values(?,?,?,?)";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("member insert에 관한 error");
			e.printStackTrace();
		} finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	} // end of insertMember()

} // end of class
