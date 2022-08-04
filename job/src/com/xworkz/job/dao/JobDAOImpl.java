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
				jobDTO.setDesignation(DesignationProperties.getByValue(designation));
				jobDTO.setSalaryPackage(salaryPackage);
				jobDTO.setQualification(QualificationProperties.getByValue(qualifaction));
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
	public JobDTO findByIdAndDesignation(Integer id, String designation) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String SelectSql = "Select * from job.job_application_info where jid=? and designation=?";
			PreparedStatement statement = connection.prepareStatement(SelectSql);
			statement.setInt(1, id);
			statement.setString(2, designation);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int pk = resultSet.getInt(1);
				String desigantion = resultSet.getString(2);
				Double salaryPackage = resultSet.getDouble(3);
				String qualification = resultSet.getString(4);
				Double percentage = resultSet.getDouble(5);
				String fresher = resultSet.getString(6);
				JobDTO jobDTO = new JobDTO();
				jobDTO.setId(pk);
				jobDTO.setDesignation(DesignationProperties.getByValue(desigantion));
				jobDTO.setSalaryPackage(salaryPackage);
				jobDTO.setQualification(QualificationProperties.getByValue(qualification));
				jobDTO.setPercentage(percentage);
				jobDTO.setFresher(fresher);
				return jobDTO;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignationAndQualification(int id, String designation, String qualifucation) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String selectSql = "Select * From job.job_application_info where jid=? and designation=? and qualifucation=?";
			PreparedStatement statement = connection.prepareStatement(selectSql);
			statement.setInt(1, id);
			statement.setString(2, designation);
			statement.setString(3, qualifucation);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int pk = resultSet.getInt(1);
				String desiganation = resultSet.getString(2);
				Double salaryPackage = resultSet.getDouble(3);
				String qualifications = resultSet.getString(4);
				Double percenatge = resultSet.getDouble(5);
				String fresher = resultSet.getString(6);
				JobDTO jobDTO = new JobDTO();
				jobDTO.setId(pk);
				jobDTO.setDesignation(DesignationProperties.getByValue(desiganation));
				jobDTO.setSalaryPackage(salaryPackage);
				jobDTO.setQualification(QualificationProperties.getByValue(qualifications));
				jobDTO.setPercentage(percenatge);
				jobDTO.setFresher(fresher);
				return jobDTO;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getTotal() {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String selectSql = "Select * From job.job_application_info";
			PreparedStatement statement = connection.prepareStatement(selectSql);
			ResultSet resultSet = statement.executeQuery();
			AtomicInteger auto = new AtomicInteger();
			while (resultSet.next()) {
				auto.incrementAndGet();
				int pk = resultSet.getInt(1);
				String designation = resultSet.getString(2);
				Double salaryPackage = resultSet.getDouble(3);
				String qualification = resultSet.getString(4);
				Double percenatge = resultSet.getDouble(5);
				String fresher = resultSet.getString(6);
				System.out.println(pk + " " + designation + " " + salaryPackage + " " + qualification + " " + percenatge
						+ " " + fresher + " ");

			}
			System.out.println(auto.get());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean isFresherById(int id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String selectSql = "Select * from job.job_application_info where jid=?";
			PreparedStatement statement = connection.prepareStatement(selectSql);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int pk = resultSet.getInt(1);
				String designation = resultSet.getString(2);
				Double salaryPackage = resultSet.getDouble(3);
				String qualification = resultSet.getString(4);
				Double percentage = resultSet.getDouble(5);
				String fresher = resultSet.getString(6);
				JobDTO jobDTO = new JobDTO();
				jobDTO.setId(pk);
				jobDTO.setDesignation(DesignationProperties.getByValue(designation));
				jobDTO.setSalaryPackage(salaryPackage);
				jobDTO.setQualification(QualificationProperties.getByValue(qualification));
				jobDTO.setPercentage(percentage);
				jobDTO.setFresher(fresher);
				if(jobDTO.getFresher().equals("YES")) {
				return true;	
				}else {
					return false;		
					}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public double getMaxPercenatge() {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String selectSql="Select max(percenatge) As MaximumPercentage from job.job_application_info";
			PreparedStatement statement	=connection.prepareStatement(selectSql);
			ResultSet resultSet= statement.executeQuery();
	       Double max=0.00;
	       while(resultSet.next()) {
	    Double percentage=resultSet.getDouble(1);
	    if(percentage>max) {
	    	max=percentage;
	    }
	    	 return max;  
	       }

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
