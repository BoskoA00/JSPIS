/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Laptop
 */
@WebServlet(urlPatterns = {"/JSPIS"})
public class JSPIS extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String prvi,drugi,treci,cetvrti,peti;
        prvi=request.getParameter("Broj1");
        drugi=request.getParameter("Broj2");
        treci=request.getParameter("Broj3");
        cetvrti=request.getParameter("Broj4");
        peti=request.getParameter("Broj5");
        
        int o1,o2,o3,o4,o5,i=0;
        
        try
        {
        o1=Integer.parseInt(prvi);
        o2=Integer.parseInt(drugi);
        o3=Integer.parseInt(treci);
        o4=Integer.parseInt(cetvrti);
        o5=Integer.parseInt(peti);
        if(o1==70){i++;}else{}
        if(o2==400){i++;}else{}
        if(o3==502){i++;}else{}
        if(o4==535){i++;}else{}
        if(o5==214){i++;}else{}
        }
        catch(Exception e)
        {
            
        }
        try {
            /* TODO output your page here. You may use following sample code. */
         if(i!=0){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Rezultat</title>");            
            out.println("</head>");
            out.println("<style>");
             out.println("*{text-align:center;}");
             out.println("</style>");
            out.println("<body>");
            out.println("<h1>Vas rezultat je " + i + "</h1>");
            out.println("</body>");
            out.println("</html>");
         }
         else if(i==0)
         {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Rezultat</title>");            
            out.println("</head>");
            out.println("<style>");
             out.println("*{text-align:center;}");
             out.println("</style>");
            out.println("<body>");
            out.println("<h1>Nemate tacnih odgovora</h1>");
            out.println("</body>");
            out.println("</html>");
         }
         }
        catch(Exception e)
        {
        }
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
