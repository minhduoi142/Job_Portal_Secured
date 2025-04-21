package com.Minh.SpringBootWeb1.repo;

import com.Minh.SpringBootWeb1.model.JobPost;

import org.springframework.stereotype.Component;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import java.util.List;

@Repository
@Component
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>();
    public List<JobPost> getAllJobs()
    {
        return jobs;
    }
    public void addJob(JobPost job)
    {
        jobs.add(job);
    }
}
