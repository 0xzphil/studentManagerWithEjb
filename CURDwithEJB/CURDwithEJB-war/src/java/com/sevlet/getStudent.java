/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sevlet;

import com.studentSessionBeanLocal.StudentFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.json.Json;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

/**
 *
 * @author Fizz Buzz
 */
public class getStudent extends HttpServlet {

    @EJB
    private StudentFacadeLocal studentFacade;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        String id = request.getParameter("id");
        JSONObject js = new JSONObject();
        try {
            js.put("name" , studentFacade.find(Integer.parseInt(id)).getName());
            js.put("msv" , studentFacade.find(Integer.parseInt(id)).getMsv());
            js.put("qq" , studentFacade.find(Integer.parseInt(id)).getQq());
            js.put("email" , studentFacade.find(Integer.parseInt(id)).getEmail());
            js.put("sex" , studentFacade.find(Integer.parseInt(id)).getSex()==true?"Nam":"Nữ");
            js.put("phone_number" , studentFacade.find(Integer.parseInt(id)).getPhoneNumber());
            js.put("date_of_birth" , studentFacade.find(Integer.parseInt(id)).getDateOfBirth().toString());
        } catch (JSONException ex) {
            Logger.getLogger(getStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.getWriter().write(js.toString());
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
