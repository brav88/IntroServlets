/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package myapp.student.com;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import myapp.database.com.DatabaseHelper;
import java.sql.*;

/**
 *
 * @author Personal
 */
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            DatabaseHelper db = new DatabaseHelper();

            PreparedStatement pstmt = db.getConnection().prepareStatement("SELECT * FROM Student;");
            ResultSet rs = pstmt.executeQuery();

            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet LoginServlet</title>");
                out.println("</head>");
                out.println("<body>");
                while (rs.next()) {
                    out.println("<h1>" + rs.getString("FirstName") + " " + rs.getString("LastName") + "</h1>");
                    out.println("<p>DOB: " + rs.getString("DOB") + " Career: " + rs.getString("Career") + "</p>");
                }
                out.println("</body>");
                out.println("</html>");
            }
        } catch (SQLException ex) {
            System.getLogger(StudentServlet.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            String lastName = request.getParameter("lastName");
            String DOB = request.getParameter("DOB");
            String careerOption = request.getParameter("careerOption");
            
            DatabaseHelper db = new DatabaseHelper();

            PreparedStatement pstmt = 
            db.getConnection().prepareStatement("INSERT INTO Student (FirstName, LastName, DOB, Career) VALUES (?, ?, ?, ?);");
            
            pstmt.setString(1, name);
            pstmt.setString(2, lastName);
            pstmt.setString(3, DOB);
            pstmt.setString(4, careerOption);            
            
            pstmt.execute();  
            
            response.sendRedirect("StudentServlet");
            
        } catch (SQLException ex) {
            System.getLogger(StudentServlet.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
