import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {


        String navn = request.getParameter("navnLogin");
        String kode = request.getParameter("kodeLogin");

//        System.out.println("vi ramte min login serlvet via Get med parametrene " + navn + ", " + kode );

        log("vi ramte min login serlvet via Get med parametrene " + navn + ", " + kode );

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        String navn = request.getParameter("navn");
        String kode1 = request.getParameter("kode1");
        String kode2 = request.getParameter("kode2");


        if (navn.equals("") || kode1.equals("") || kode2.equals("")) {

            log("bruger opl ikke udfyldt korekt ved opret bruger");
            String bested = "husk at udfylde alle felter !";
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }




      //  System.out.println("vi ramte min login serlvet via Post med parametrene " + navn + ", " + kode1 + "; " + kode2 );
        log("vi ramte min login serlvet via Post med parametrene " + navn + ", " + kode1 + "; " + kode2);

    }
}
