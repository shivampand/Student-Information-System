/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginregistrationproject;

/**
 *
 * @author ASUS
 */
public class Student_Bean {
    
    private int id;
    private String name;
    private float fees;
    private String dob;
    private byte[] photo;
    
    public Student_Bean(int id,String name,float fees,String dob,byte[]photo){
          this.id=id;
          this.name=name;
         this.fees=fees;
         this.dob=dob;
         this.photo=photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    
    
}
