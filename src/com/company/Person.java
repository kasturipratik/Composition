package com.company;

public class Person {
    //composition has-a relationship
    // Creating a instance of job class and education class
     Job job;
     Education edu;

    /*
         Constructor
    */
    public Person(){
    // initializing the instance previously created
        this.job=new Job();
        this.edu = new Education();

    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Education getEdu() {
        return edu;
    }

    public void setEdu(Education edu) {
        this.edu = edu;
    }
}