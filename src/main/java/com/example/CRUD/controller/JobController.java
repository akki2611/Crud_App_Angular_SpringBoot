package com.example.CRUD.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUD.exception.ResourceNotFoundException;
import com.example.CRUD.model.Job;
import com.example.CRUD.repository.JobRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class JobController {
	
	@Autowired
	private JobRepository jobRepository;
	
	@GetMapping("/jobs")
	public List<Job> getAllJobs(){
		return jobRepository.findAll();
	}
	
	@PostMapping("/jobs")
	public Job createJob(@RequestBody Job job) {
		return jobRepository.save(job);
	}
	
	@GetMapping("/jobs/{id}")
	public ResponseEntity<Job> getJobById(@PathVariable(name = "id") Long id) {
	    Job job = jobRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Job does not exist with id:" + id));
	    return ResponseEntity.ok(job);
	}
	
	@PutMapping("/jobs/{id}")
	public ResponseEntity<Job> updateJob(@PathVariable(name = "id") Long id, @RequestBody Job jobDetails){
		Job job = jobRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Job not exist with id: " + id));
		job.setCampaign(jobDetails.getCampaign());
		job.setEmployment_Type(jobDetails.getEmployment_Type());
		job.setGrade(jobDetails.getGrade());
		job.setJob_Description(jobDetails.getJob_Description());
		job.setJob_Title(jobDetails.getJob_Title());
		job.setLocation(jobDetails.getLocation());
		job.setMax_Work_Exp(jobDetails.getMax_Work_Exp());
		job.setMin_Work_Exp(jobDetails.getMin_Work_Exp());
		job.setNo_of_Openings(jobDetails.getNo_of_Openings());
		job.setTentative_Joining(jobDetails.getTentative_Joining());
		
		Job updatedJob = jobRepository.save(job);
		return ResponseEntity.ok(updatedJob);
	}
	
	@DeleteMapping("/jobs/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteJob(@PathVariable(name = "id") Long id) {
	    Job job = jobRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Job does not exist with id:" + id));
	    jobRepository.delete(job);
	    Map<String, Boolean> response = new HashMap<>();
	    response.put("Deleted", Boolean.TRUE);
	    return ResponseEntity.ok(response);
	}

	
}
