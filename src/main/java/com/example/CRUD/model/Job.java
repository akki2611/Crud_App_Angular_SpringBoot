package com.example.CRUD.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jobs")
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "job_title") 
	private String job_Title;
	
	@Column(name = "job_description")
	private String job_Description;
	
	@Column(name = "no_of_openings")
	private int no_of_Openings;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "employment_type")
	private String employment_Type;
	
	@Column(name = "min_work_exp")
	private int min_Work_Exp;
	
	@Column(name = "max_work_exp")
	private int max_Work_Exp;
	
	@Column(name = "campaign")
	private String campaign;
	
	@Column(name = "Tentative_Joining")
	private String tentative_Joining;
	
	@Column(name = "grade")
	private String grade;
	
	public Job() {
		
	}
	
	
	public Job(String Job_Title, String Job_Description, int No_of_Openings, String Location, String Employment_Type,
			int Min_Work_Exp, int Max_Work_Exp, String Campaign, String Tentative_Joining, String Grade) {
		super();
		job_Title = Job_Title;
		job_Description = Job_Description;
		no_of_Openings = No_of_Openings;
		location = Location;
		employment_Type = Employment_Type;
		min_Work_Exp = Min_Work_Exp;
		max_Work_Exp = Max_Work_Exp;
		campaign = Campaign;
		tentative_Joining = Tentative_Joining;
		grade = Grade;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getJob_Title() {
		return job_Title;
	}
	public void setJob_Title(String Job_Title) {
		job_Title = Job_Title;
	}
	public String getJob_Description() {
		return job_Description;
	}
	public void setJob_Description(String Job_Description) {
		job_Description = Job_Description;
	}
	public int getNo_of_Openings() {
		return no_of_Openings;
	}
	public void setNo_of_Openings(int No_of_Openings) {
		no_of_Openings = No_of_Openings;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String Location) {
		location = Location;
	}
	public String getEmployment_Type() {
		return employment_Type;
	}
	public void setEmployment_Type(String Employment_Type) {
		employment_Type = Employment_Type;
	}
	public int getMin_Work_Exp() {
		return min_Work_Exp;
	}
	public void setMin_Work_Exp(int Min_Work_Exp) {
		min_Work_Exp = Min_Work_Exp;
	}
	public int getMax_Work_Exp() {
		return max_Work_Exp;
	}
	public void setMax_Work_Exp(int Max_Work_Exp) {
		max_Work_Exp = Max_Work_Exp;
	}
	public String getCampaign() {
		return campaign;
	}
	public void setCampaign(String Campaign) {
		campaign = Campaign;
	}
	public String getTentative_Joining() {
		return tentative_Joining;
	}
	public void setTentative_Joining(String Tentative_Joining) {
		tentative_Joining = Tentative_Joining;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String Grade) {
		grade = Grade;
	}
	
}
