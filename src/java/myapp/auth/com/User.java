/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myapp.auth.com;

/** Programacion Orientada a Objetos
 *
 * @author Personal
 */
public class User {
    
    private int Id;
    private String Name;
    private String LastName;
    private String Address;
    
    public User(){
        
    }
    
    public void setName(String _name){
        this.Name = _name;
    }
    
    public String getName(){
        return this.Name;
    }    
}
