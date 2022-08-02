package com.xworkz.job.dao;

import static com.xworkz.job.constant.MySqlProperties.SECRET;
import static com.xworkz.job.constant.MySqlProperties.URL;
import static com.xworkz.job.constant.MySqlProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.job.constant.DesignationProperties;
import com.xworkz.job.constant.QualificationProperties;
import com.xworkz.job.dto.JobDTO;

public class JobDAOImpl implements JobDAO {

	@Override
	public boolean save(JobDTO jobDTO) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String insertSql = "insert into job.job_application_info value(?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insertSql);
			statement.setInt(1, jobDTO.getId());
			statement.setString(2, jobDTO.getDesignation().getDesignation());
			statement.setDouble(3, jobDTO.getSalaryPackage());
			statement.setString(4, jobDTO.getQualification().getQualification());
			statement.setDouble(5, jobDTO.getPercentage());
			statement.setString(6, jobDTO.getFresher());
			int rowsAffected = statement.executeUpdate();
			return rowsAffected > 1 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public JobDTO findById(Integer id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String SelectSql = "Select * from job.job_application_info where jid=?";
			PreparedStatement statement = connection.prepareStatement(SelectSql);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			AtomicInteger auto = new AtomicInteger();
			while (resultSet.next()) {
				auto.incrementAndGet();
				int pk = resultSet.getInt(1);
				String designation = resultSet.getString(2);
				Double salaryPackage = resultSet.getDouble(3);
				String qualifaction = resultSet.getString(4);
				Double percenatge = resultSet.getDouble(5);
				String fresher = resultSet.getString(6);

				JobDTO jobDTO = new JobDTO();
				jobDTO.setId(pk);
				jobDTO.setDesignation(DesignationProperties.valueOf(designation));
				jobDTO.setSalaryPackage(salaryPackage);
				jobDTO.setQualification(QualificationProperties.valueOf(qualifaction));
				jobDTO.setPercentage(percenatge);
				jobDTO.setFresher(fresher);
				return jobDTO;

			}
			System.out.println(auto.get());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignation(int id, String designation) {
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignationAndQualification(int id, String designation, String qualification) {
		return null;
	}

	@Override
	public int getTotal() {
		return 0;
	}

	@Override
	public boolean isFresherById(int id) {
		return false;
	}

	@Override
	public double getMaxPercenatge() {
		return 0;
	}
}
