package edu.unapec.opensource.controller;

import edu.unapec.opensource.logic.ExcelDataReader;
import edu.unapec.opensource.models.ViewInformation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LENOVO on 19/07/2016.
 */
@WebServlet("/processForm")
public class ExcelControllerProcessor extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        ExcelDataReader excelDataReader= new ExcelDataReader();
        ViewInformation viewInformation= excelDataReader.getNewCalculation();
        excelDataReader.updateFile();
        request.setAttribute("information",viewInformation);
        request.getRequestDispatcher("result.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {



    }
}
