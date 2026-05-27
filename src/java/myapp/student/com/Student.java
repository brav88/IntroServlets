/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myapp.student.com;

/**
 *
 * @author Personal
 */
public class Student {

    private String Name;
    private int Age;
    private String Career;

    public Student() {
    }

    public boolean isAdult() {
        return this.Age > 18;
    }

    public String isMinor() {
        if (this.Age < 18) {
            return "menor";
        } else {
            return "mayor";
        }
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setCareer(String Career) {
        this.Career = Career;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getCareer() {
        return Career;
    }
}
