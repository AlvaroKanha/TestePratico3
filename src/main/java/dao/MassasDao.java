package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.MassasModel;

public class MassasDao {

	public void create(MassasModel massa) {
		String sql = "insert into massas(NAME_PRODUCT,CUSTOMIZATION,DISPLAY,DISPLAY_RESOLUTION,DISPLAY_SIZE,MEMORY,OPERATING_SYSTEM,PROCESSOR,TOUCHSCREEN,WEIGHT,COLOR) values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection conexao = null;
		PreparedStatement statement = null;
		try {
			conexao = ConnectionFactory.conexaoMysql();
			statement = conexao.prepareStatement(sql);

			statement.setString(1, massa.getNAME_PRODUCT());
			statement.setString(2, massa.getCUSTUMIZATION());
			statement.setString(3, massa.getDISPLAY());
			statement.setString(4, massa.getDISPLAY_RESOLUTION());
			statement.setString(5, massa.getDISPLAY_SIZE());
			statement.setString(6, massa.getMEMORY());
			statement.setString(7, massa.getOPERATION_SYSTEM());
			statement.setString(8, massa.getPROCESSOR());
			statement.setString(9, massa.getTOUCHSCREEN());
			statement.setString(10, massa.getWEIGHT());
			statement.setString(11, massa.getCOLOR());

			statement.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conexao != null) {
					conexao.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public List<MassasModel> read() {
		String sql = "SELECT * FROM massas";
		List<MassasModel> listaMassas = new ArrayList<MassasModel>();
		Connection conexao = null;
		PreparedStatement statement = null;
		ResultSet result = null;

		try {
			conexao = ConnectionFactory.conexaoMysql();
			statement = conexao.prepareStatement(sql);
			result = statement.executeQuery();
			while (result.next()) {
				MassasModel massa = new MassasModel();
				massa.setIDMASSAS(result.getInt("IDMASSAS"));
				massa.setNAME_PRODUCT(result.getString("NAME_PRODUCT"));
				massa.setCUSTUMIZATION(result.getString("CUSTOMIZATION"));
				massa.setDISPLAY(result.getString("DISPLAY"));
				massa.setDISPLAY_RESOLUTION(result.getString("DISPLAY_RESOLUTION"));
				massa.setDISPLAY_SIZE(result.getString("DISPLAY_SIZE"));
				massa.setMEMORY(result.getString("MEMORY"));
				massa.setOPERATION_SYSTEM(result.getString("OPERATING_SYSTEM"));
				massa.setPROCESSOR(result.getString("PROCESSOR"));
				massa.setTOUCHSCREEN(result.getString("TOUCHSCREEN"));
				massa.setWEIGHT(result.getString("WEIGHT"));
				massa.setCOLOR(result.getString("COLOR"));

				listaMassas.add(massa);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
				}
				if (conexao != null) {
					conexao.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return listaMassas;
	}

	public void update(MassasModel massa) {
		String sql = "UPDATE massas SET name_product = ?, customization = ?,display = ?,display_resolution = ?,display_size = ?,memory = ?,operating_system = ?,processor = ?,touchscreen = ?,weight = ?,color = ? "
				+ "WHERE idmassas = ?";
		Connection conexao = null;
		PreparedStatement statement = null;

		try {
			conexao = ConnectionFactory.conexaoMysql();
			statement = conexao.prepareStatement(sql);
			statement.setString(1, massa.getNAME_PRODUCT());
			statement.setString(2, massa.getCUSTUMIZATION());
			statement.setString(3, massa.getDISPLAY());
			statement.setString(4, massa.getDISPLAY_RESOLUTION());
			statement.setString(5, massa.getDISPLAY_SIZE());
			statement.setString(6, massa.getMEMORY());
			statement.setString(7, massa.getOPERATION_SYSTEM());
			statement.setString(8, massa.getPROCESSOR());
			statement.setString(9, massa.getTOUCHSCREEN());
			statement.setString(10, massa.getWEIGHT());
			statement.setString(11, massa.getCOLOR());
			statement.setInt(12, massa.getIDMASSAS());

			statement.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conexao != null) {
					conexao.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
	
	public void delete (MassasModel massa) {
	}

}
