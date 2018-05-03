package com.example;

/**
 * Created by asabagh on 3/25/18.
 */

public class student {
    int student_id;
    String firstname;
    String lastname;
    String univercity = "imamreza.ac";

    public student(int student_id, String firstname, String lastname){
        this.student_id = student_id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void welcome(){
        System.out.println("welcome " + firstname + " " + lastname + "(" + student_id + ") from " + univercity + " univercity" );
    }
}
