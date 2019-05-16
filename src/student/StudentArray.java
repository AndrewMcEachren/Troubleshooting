/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author andre
 */
public class StudentArray {
    public static void main(String[] args) {
     //1. create an array of Students of length 5
     Student[] classList = new Student[5];
     //2. populate the array with 4 friends plus yourself
     //only add name and program
     Student liz = new Student();
     liz.setName("Liz");
     liz.setProgram("Systems Analyst");
     
     //add student to the array
     classList[0] = liz;
     
     Student marco = new Student();
     marco.setName("Marco");
     marco.setProgram("Computer Programmer");
     
     classList[1] = marco;
     
     Student vivian = new Student();
     vivian.setName("Vivian");
     vivian.setProgram("Systems Analyst");
     
     classList[2] = vivian;
     
     Student andrew = new Student();
     andrew.setName("Andrew");
     andrew.setProgram("Computer Programmer");
     
     classList[3] = andrew;
     
     Student lenny = new Student();
     lenny.setName("Lenny");
     lenny.setProgram("Criminology");
     
     classList[4] = lenny;
     
     //iterate over the array and print each Student's name
     for(int i=0; i<classList.length; i++){
         System.out.println(classList[i].getName());
     }
    }  
}
