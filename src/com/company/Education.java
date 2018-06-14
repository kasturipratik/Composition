package com.company;

import java.util.ArrayList;

public class Education {
    ArrayList<String> schools;

    public Education() {
    }

    public ArrayList<String> getSchools() {
        return schools;
    }

    public void setSchools(ArrayList<String> schools) {
        this.schools = schools;
    }

    // overriding the toString() built in method in the java system
    @Override
    public String toString(){
        String display="";
        for(String educ:schools){
            display += educ +"\n";
        }
        return display;
    }
}
