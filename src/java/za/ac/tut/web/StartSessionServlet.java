
package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StartSessionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        int numberOfEnterdedWord = 0, numberOfPalindrome = 0;
        
        session.setAttribute("numberOfPalindrome", numberOfPalindrome);
        session.setAttribute("numberOfEnterdedWord", numberOfPalindrome);
      
        request.getRequestDispatcher("start.html").forward(request, response);
    }

}
