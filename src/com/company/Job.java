package com.company;

import java.util.ArrayList;

public class Job {

   ArrayList<String> jobs;

    public Job() {

    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<String> jobs) {
        this.jobs = jobs;
    }

    // overriding the toString() built in method in the java system
    @Override
    public String toString() {
        String display ="";
    for(String job: jobs){
        display += job +"\n";
    }
        return display;

    }
}