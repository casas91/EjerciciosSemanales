
package servlet;

import java.io.IOException;
import java.util.LinkedHashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "VotacionSv", urlPatterns = {"/VotacionSv"})
public class VotacionSv extends HttpServlet {

    public static LinkedHashMap<String, Integer> resultados = new LinkedHashMap<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");

        if ("votar".equals(action)) {
            votar(request, response);
        } else if ("mostrarResultados".equals(action)) {
            mostrarResultados(request, response);
        } else {
            response.getWriter().println("Acción no válida");
        }
    }

    private void votar(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String voto = request.getParameter("voto");

        if (resultados.containsKey(voto)) {
            resultados.put(voto, resultados.get(voto) + 1);
        } else {
            resultados.put(voto, 1);
        }

        response.sendRedirect("index.jsp");
    }

    private void mostrarResultados(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("mostrarResultados", true);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }
}