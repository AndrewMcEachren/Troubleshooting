/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 * This class models students.
 * Students have a name, student ID, and a program
 * @author andre
 */
public class Student {
    private String name;
    private String StudentID;
    private String program;


public void setName(String givenName) {
    name = givenName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the StudentID
     */
    public String getStudentID() {
        return StudentID;
    }

    /**
     * @param StudentID the StudentID to set
     */
    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
}