/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentSessionBeanLocal;

import com.studentEntites.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Fizz Buzz
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "CURDwithEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public ArrayList<ArrayList<String>> getStudentData() {
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        for(int i = 0; i< findAll().size(); i++){
            ArrayList<String> studentInfo = new ArrayList<>();
            studentInfo.add(findAll().get(i).getId().toString());
            studentInfo.add(findAll().get(i).getName());
            studentInfo.add(findAll().get(i).getEmail());
            studentInfo.add(findAll().get(i).getSex()?"Nam":"Nữ");
            studentInfo.add(findAll().get(i).getQq());
            studentInfo.add(findAll().get(i).getMsv());
            studentInfo.add(findAll().get(i).getPhoneNumber());
            studentInfo.add(new SimpleDateFormat("yyyy-MM-dd").format(findAll().get(i).getDateOfBirth()));
            data.add(studentInfo);
            
        }
        return data;
    }

    @Override
    public void updateStudent(int id, int column, String value) {
        if(column ==  1){
            this.find(id).setName(value);
        }
        if(column ==  2){
            this.find(id).setMsv(value);
        }
        if(column ==  3){
            this.find(id).setEmail(value);
        }
        if(column ==  4){
            this.find(id).setQq(value);
        }
        if(column ==  5){
            try {
                this.find(id).setDateOfBirth((new SimpleDateFormat("yyyy-MM-dd")).parse(value));
            } catch (ParseException ex) {
                Logger.getLogger(StudentFacade.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(column ==  6){
            this.find(id).setSex("Nam".equals(value));
        }
        if(column ==  7){
            this.find(id).setPhoneNumber(value);
        }
    }

    @Override
    public void removeStudent(int id) {
        this.remove(this.find(id));
    }

    @Override
    public void addStudent(String name, String msv, String qq, String email, String sdt, String birthday, String sex) {
        try {
            this.create(new Student(Integer.SIZE, name, msv, qq, email, "Nam".equals(sex), sdt, new SimpleDateFormat("yyyy-MM-dd").parse(birthday)));
        } catch (ParseException ex) {
            Logger.getLogger(StudentFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
