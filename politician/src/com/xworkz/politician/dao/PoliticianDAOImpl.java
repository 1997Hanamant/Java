package com.xworkz.politician.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.politician.dto.PoliticianDTO;
import com.xwrokz.politician.constant.PartyNameProperties;
import com.xwrokz.politician.constant.PartySymbolProperties;
import com.xwrokz.politician.constant.PresidentProperties;

import static com.xwrokz.politician.constant.MysqlProperties.*;

public class PoliticianDAOImpl implements PoliticianDAO {

	@Override
	public boolean save(PoliticianDTO dto) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String insertSql = "insert into politician.politician_info value(?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insertSql);
			statement.setInt(1, dto.getPId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getPartyname().getName());
			statement.setString(4, dto.getPresident().getPresident());
			statement.setInt(5, dto.getTotalMember());
			statement.setDouble(6, dto.getTotalBudget());
			statement.setString(7, dto.getPartySymbol().getBySymbol());
			statement.setString(8, dto.getLocation());
			statement.setString(9, dto.getHeadQuater());
			int rowsAffected = statement.executeUpdate();
			System.out.println(rowsAffected);
			return rowsAffected > 0 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public PoliticianDTO findById(int id) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String selectSql = "Select * From politician.politician_info where pid=?";
			PreparedStatement statement = connection.prepareStatement(selectSql);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int pk = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String presidents = resultSet.getString(4);
				Integer totalMemebres = resultSet.getInt(5);
				Double totalBudget = resultSet.getDouble(6);
				String partySymbol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String headquater = resultSet.getString(9);
				PoliticianDTO politicianDTO = new PoliticianDTO();
				politicianDTO.setPId(pk);
				politicianDTO.setName(name);
				politicianDTO.setPartyname(PartyNameProperties.getByValue(partyName));
				politicianDTO.setPresident(PresidentProperties.getByValue(presidents));
				politicianDTO.setTotalMember(totalMemebres);
				politicianDTO.setTotalBudget(totalBudget);
				politicianDTO.setPartySymbol(PartySymbolProperties.getByValue(partySymbol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuater(headquater);
				return politicianDTO;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDTO findBYIdAndPresident(int id, String president) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String selectSql = "SELECT * FROM politician.politician_info where pid=? and president=?";
			PreparedStatement statement = connection.prepareStatement(selectSql);
			statement.setInt(1, id);
			statement.setString(2, president);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int pk = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String presidents = resultSet.getString(4);
				Integer totalMember = resultSet.getInt(5);
				Double totalBudget = resultSet.getDouble(6);
				String partySymbol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String headQuater = resultSet.getString(9);
				PoliticianDTO politicianDTO = new PoliticianDTO();
				politicianDTO.setPId(pk);
				politicianDTO.setName(name);
				politicianDTO.setPartyname(PartyNameProperties.getByValue(partyName));
				politicianDTO.setPresident(PresidentProperties.getByValue(presidents));
				politicianDTO.setTotalMember(totalMember);
				politicianDTO.setTotalBudget(totalBudget);
				politicianDTO.setPartySymbol(PartySymbolProperties.getByValue(partySymbol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuater(headQuater);
				return politicianDTO;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDTO findBYIdAndPresidentAndName(int id, String president, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String selectSql = "Select * from politician.politician_info where pid=? and president=? and name=?";
			PreparedStatement statament = connection.prepareStatement(selectSql);
			statament.setInt(1, id);
			statament.setString(2, president);
			statament.setString(3, name);
			ResultSet resultSet = statament.executeQuery();
			while (resultSet.next()) {
				Integer pk = resultSet.getInt(1);
				String names = resultSet.getString(2);
				String partyname = resultSet.getString(3);
				String presidents = resultSet.getString(4);
				Integer totalMember = resultSet.getInt(5);
				Double totalBudget = resultSet.getDouble(6);
				String partySymabol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String headQuater = resultSet.getString(9);
				PoliticianDTO politicianDTO = new PoliticianDTO();
				politicianDTO.setPId(pk);
				politicianDTO.setName(names);
				politicianDTO.setPartyname(PartyNameProperties.getByValue(partyname));
				politicianDTO.setPresident(PresidentProperties.getByValue(presidents));
				politicianDTO.setTotalMember(totalMember);
				politicianDTO.setTotalBudget(totalBudget);
				politicianDTO.setPartySymbol(PartySymbolProperties.getByValue(partySymabol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuater(headQuater);
				return politicianDTO;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDTO findBYIdAndName(int id, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String selectSql = "Select * from politician.politician_info where pid=? and name=?";
			PreparedStatement statment = connection.prepareStatement(selectSql);
			statment.setInt(1, id);
			statment.setString(2, name);
			ResultSet resultSet = statment.executeQuery();
			while (resultSet.next()) {
				Integer pk = resultSet.getInt(1);
				String names = resultSet.getString(2);
				String partyname = resultSet.getString(3);
				String presidents = resultSet.getString(4);
				Integer totalMember = resultSet.getInt(5);
				Double totalBudget = resultSet.getDouble(6);
				String partySymabol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String headQuater = resultSet.getString(9);
				PoliticianDTO politicianDTO = new PoliticianDTO();
				politicianDTO.setPId(pk);
				politicianDTO.setName(names);
				politicianDTO.setPartyname(PartyNameProperties.getByValue(partyname));
				politicianDTO.setPresident(PresidentProperties.getByValue(presidents));
				politicianDTO.setTotalMember(totalMember);
				politicianDTO.setTotalBudget(totalBudget);
				politicianDTO.setPartySymbol(PartySymbolProperties.getByValue(partySymabol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuater(headQuater);
				return politicianDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String findNameById(int id) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String selectSql = "Select * From politician.politician_info where pid= ?";
			PreparedStatement statment = connection.prepareStatement(selectSql);
			statment.setInt(1, id);
			ResultSet resultSet=statment.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString(8);
				return name;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findPresidentByIdAndName(int id, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String SelectSql = "Select * from politician.politician_info where pid=? and name=?";
			PreparedStatement statement = connection.prepareStatement(SelectSql);
			statement.setInt(1, id);
			statement.setString(2, name);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				String presidents = resultSet.getString(2);
				return presidents;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int getTotal() {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String SelectSql = "Select * from politician.politician_info";
			PreparedStatement statment = connection.prepareStatement(SelectSql);
			ResultSet resultSet = statment.executeQuery();
			AtomicInteger auto = new AtomicInteger();
			while (resultSet.next()) {
				auto.incrementAndGet();
			}
			System.out.println(auto.get());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public PoliticianDTO findPartyByMaxMembers() {
		try(Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			String selectSql="Select max(totalMembers) as maximumMember From politician.politician_info";
			PreparedStatement statement=connection.prepareStatement(selectSql);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next()) {
				int pk =resultSet.getInt(1);
				String name =resultSet.getString(1);
				String partyName =resultSet.getString(1);
				String president=resultSet.getString(1);
				Integer totalMembers=resultSet.getInt(1);
				Double totalBudget=resultSet.getDouble(1);
				String partySymbol=resultSet.getString(1);
				String location=resultSet.getString(1);
				String headQuater=resultSet.getString(1);
				PoliticianDTO politicianDTO=new PoliticianDTO();
				politicianDTO.setPId(pk);
				politicianDTO.setName(name);
				politicianDTO.setPartyname(PartyNameProperties.getByValue(partyName));
				politicianDTO.setPresident(PresidentProperties.getByValue(president));
				politicianDTO.setTotalMember(totalMembers);
				politicianDTO.setTotalBudget(totalBudget);
				politicianDTO.setPartySymbol(PartySymbolProperties.getByValue(partySymbol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuater(headQuater);
				return politicianDTO;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
