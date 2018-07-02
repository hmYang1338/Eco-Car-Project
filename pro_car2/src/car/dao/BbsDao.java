package car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import car.dto.BbsDto;
import car.util.DBUtil;

/**
 * 게시판에 관한 DAO
 * 
 * @author hyunmoYang
 */
public class BbsDao {

	private static String sql;

	/**
	 * 게시판에 글 추가시 DB에 Insert
	 * 
	 * @param bt
	 * @param bc
	 * @param id
	 * @param inDate
	 */
	public static void addBbs(String bt, String bc, String id, String inDate) {
		Connection con = null;
		PreparedStatement pstmt = null;
		sql = "insert into board values (board_seq.nextval,?,?,?,?)";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bt);
			pstmt.setString(2, bc);
			pstmt.setString(3, inDate);
			pstmt.setString(4, id);
			pstmt.executeQuery();
		} catch (SQLException e) {
			System.err.println("board insert에 관한 error");
		} finally {
			DBUtil.close(con, pstmt);
		}
	} // end of addBbs();

	/**
	 * 게시판 전체 글 DB에서 Select
	 * 
	 * @return list
	 */
	public static ArrayList<BbsDto> allViewBbs() {
		ArrayList<BbsDto> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		sql = "select * from board where rownum <=5 order by board_date desc";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new BbsDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4).substring(0, 10),
						rs.getString(5)));
			}
		} catch (SQLException e) {
			System.err.println("board select에 관한 error");
		} finally {
			DBUtil.close(con, pstmt, rs);
		}
		return list;
	} // end of allViewBbs()

} // end of class
