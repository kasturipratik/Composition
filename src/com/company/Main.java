package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Person person = new Person();

        ArrayList<String> jobList = new ArrayList<>();
        jobList.add("Teacher");
        jobList.add("Programmer");
        jobList.add("Driver");
        jobList.add("Painter");

        ArrayList<String> listOfSchool = new ArrayList<>();
        listOfSchool.add("UMD");
        listOfSchool.add("Peace Zone");
        listOfSchool.add("CCBC");
        listOfSchool.add("UMBC");
        listOfSchool.add("Montgomery Community College");
        listOfSchool.add("UMUC");
        listOfSchool.add("Trump University");
        listOfSchool.add("Essex CCBC");

        //calling the variable name used to instantiated in person class
        person.job.setJobs(jobList);
        person.edu.setSchools(listOfSchool);


        System.out.println("List of school the person went are: ");
        System.out.println(person.job.toString());
        System.out.println(":::::::::::::::::::::::::::::::::::");
        System.out.println("List of jobs the person did are: ");
        System.out.println(person.edu.toString());

    }
    }

