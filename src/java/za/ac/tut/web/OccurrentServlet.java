package za.ac.tut.web;

import java.io.IOException;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.WordOccurentSBLocal;

public class OccurrentServlet extends HttpServlet {
    
    @EJB private WordOccurentSBLocal manager;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String text = request.getParameter("text");
        
        Map<String, Integer> occurents = manager.countOccurent(text);
        
        request.setAttribute("occurents", occurents);
        
        request.getRequestDispatcher("output.jsp").forward(request, response);
    }

}
