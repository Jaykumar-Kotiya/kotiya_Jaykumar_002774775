/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jkoti
 */
public class Employee {
    
     private String name;
    private int empId;
    private int age;
    private String gender;
    private String startDate;
    private String level;
    private String teamInfo;
    private String positionTitle;
    private int phoneNumber;
    private String emailAddress;
    //private String photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

   // public int getPhoneNumber() {
  //      return phoneNumber;
   // }

  //  public void setPhoneNumber( phoneNumber) {
   //     this.phoneNumber = phoneNumber;
  //  }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
 //       public String getEmailId() {
   //     return emailAddress;
   // }
   // public void setEmailId(String emailAddress) {
   //     this.emailAddress = emailAddress;
   // }  
    public String getStartDt() {
        return startDate;
    }
    public void setStartDt(String startDate) {
        this.startDate = startDate;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public int getCellNo() {
        return phoneNumber;
    }
    public void setCellNo(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString(){
         String date = null;
        return date;
    }
    
}
