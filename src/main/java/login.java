import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet
{

    Map<String, Bruger> brugerMap = new HashMap<>();

    @Override
    public void init() throws ServletException
    {
       Bruger bruger1 = new  Bruger("nik", "1");
     Bruger bruger2 = new Bruger("lone", "2");

     brugerMap.put(bruger1.navn, bruger1);
     brugerMap.put(bruger2.navn, bruger2);

       // super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {


        String navn = request.getParameter("navnLogin");
        String kode = request.getParameter("kodeLogin");

//        System.out.println("vi ramte min login serlvet via Get med parametrene " + navn + ", " + kode );
        log("vi ramte min login serlvet via Get med parametrene " + navn + ", " + kode );

        if (navn.equals("") || kode.equals("")) {

            String loginFejl = "Noget gik galt, tjeck navn eller kode og prøv igen";
            request.setAttribute("LoginFejl",loginFejl);
            request.getRequestDispatcher("index.jsp").forward(request,response);

        }

        if (!brugerMap.containsKey(navn)) {

            String loginFejl = "Brugeren findes ikke, gå til opret bruger eller tjeck dit navn";
            request.setAttribute("LoginFejl",loginFejl);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }






    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        String navn = request.getParameter("navn");
        String kode1 = request.getParameter("kode1");
        String kode2 = request.getParameter("kode2");


        if (navn.equals("") || kode1.equals("") || kode2.equals("")) {

            log("bruger opl ikke udfyldt korekt ved opret bruger");

            String besked = "husk at udfylde alle felter !";

            request.setAttribute("besked", besked );
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        if (!kode1.equals(kode2)) {

            String besked = "Kodene du angiv var ikke ens !";
            request.setAttribute("besked", besked );

            request.getRequestDispatcher("index.jsp").forward(request, response);

        }



        log("oprettelse af brugeren gik fint ");
        request.setAttribute("navn", navn);
        request.getRequestDispatcher("WEB-INF/brugerSide.jsp").forward(request, response);






      //  System.out.println("vi ramte min login serlvet via Post med parametrene " + navn + ", " + kode1 + "; " + kode2 );
        // log("vi ramte min login serlvet via Post med parametrene " + navn + ", " + kode1 + "; " + kode2);

    }
}
