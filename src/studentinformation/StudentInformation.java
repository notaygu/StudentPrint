/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformation;

/**
 *
 * @author notay
 */
public class StudentInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] list = new Student[3];
        Student s1 = new Student();
        s1.setName("peter");
        s1.setAge(20);
        list[0] = s1;
        System.out.println(list[0].getName()+ list[0].getAge());
                
    }
    
}
