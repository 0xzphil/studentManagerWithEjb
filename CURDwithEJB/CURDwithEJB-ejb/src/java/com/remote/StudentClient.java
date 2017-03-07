/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remote;

import com.studentEntites.Student;
import com.studentSessionBeanLocal.StudentFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Fizz Buzz
 */
@Stateless
public class StudentClient implements StudentClientRemote {

    @EJB
    private StudentFacadeLocal studentFacade;
    
    @Override
    public ArrayList<ArrayList<String>> getStudentData() {
        ArrayList<ArrayList<String>> data = studentFacade.getStudentData();
        return data;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void updateStudent(int id, int column, String value) {
        studentFacade.updateStudent(id, column, value);
    }

    @Override
    public void deleteStudentRecord(int id) {
        studentFacade.removeStudent(id);
    }

    @Override
    public void addStudent(String name, String msv, String qq, String email, String sdt, String birthday, String sex) {
        studentFacade.addStudent( name,  msv, qq, email, sdt, birthday, sex);
    }
}
