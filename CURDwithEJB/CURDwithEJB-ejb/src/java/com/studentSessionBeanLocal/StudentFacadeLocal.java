/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentSessionBeanLocal;

import com.studentEntites.Student;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Fizz Buzz
 */
@Local
public interface StudentFacadeLocal {

    void create(Student student);

    void edit(Student student);

    void remove(Student student);

    Student find(Object id);

    List<Student> findAll();

    List<Student> findRange(int[] range);

    public ArrayList<ArrayList<String>> getStudentData();
    
    int count();

    public void updateStudent(int id, int column, String value);

    public void removeStudent(int id);

    public void addStudent(String name, String msv, String qq, String email, String sdt, String birthday, String sex);
    
}
