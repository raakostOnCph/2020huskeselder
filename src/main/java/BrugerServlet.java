import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@WebServlet(name = "BrugerServlet", value = "/BrugerServlet")
public class BrugerServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession();
        session.invalidate();
        log("nedlægger session og returnere til indexsiden");
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession();

        Set<String> emneListe = (Set<String>) session.getAttribute("emneListe");

        if (emneListe == null) {
            emneListe = new TreeSet<>();   // opretter listen vis den ikke allerede findes på sessionscopet

        }

        String emne = request.getParameter("emne");   // tilføjer emne til listen

        emneListe.add(emne);
        session.setAttribute("emneListe",emneListe); // hænger listen op på sessionscopet

        System.out.println(emneListe.toString());

        request.getRequestDispatcher("WEB-INF/brugerSide.jsp").forward(request, response);


    }
}
