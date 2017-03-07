/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentWeb.MB;

import com.studentEntites.Student;
import com.studentSessionBeanLocal.StudentFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Fizz Buzz
 */
@Named(value = "studentMB")
@Dependent
@ManagedBean
@ViewScoped
public class studentMB {

    @EJB
    private StudentFacadeLocal studentFacade;
    
    private List<Student> listStudent;
    /**
     * Creates a new instance of studentMB
     */
    public studentMB() {
    }

    public List<Student> getListStudent() {
        
        listStudent = studentFacade.findAll();
        System.out.print(listStudent);
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
    
    public String test(){
        return "test";
    }
    
    public List<Student> test2(){
        ArrayList<String> data = new ArrayList<>();
        for ( int i = 0; i< studentFacade.findAll().size(); i++){
            data.add(studentFacade.findAll().get(i).getId().toString());
        }
        
        return studentFacade.findAll();
    }
    
    
    
}
