/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remote;

import java.util.ArrayList;
import javax.ejb.Remote;

/**
 *
 * @author Fizz Buzz
 */
@Remote
public interface StudentClientRemote {
    public ArrayList<ArrayList<String>> getStudentData();
    
    public void updateStudent(int id, int column, String value);

    public void deleteStudentRecord(int id);

    public void addStudent(String name, String msv, String qq, String email, String sdt, String birthday, String sex);
}
