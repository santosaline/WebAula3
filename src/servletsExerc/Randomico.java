package servletsExerc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/randomico")
public class Randomico extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException{
		
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Quest 4</h1>");
		writer.println("<h1>Olá Mundo</h1>");
		writer.println("<h1>Olá Mundo</h1>");
		PrintWriter out = resp.getWriter();
		out.println("<h3>Quest 4</h3>");
		Random geradorDeNumeros = new Random();
		
		out.println("<h4>Numero aleatorio: "+geradorDeNumeros.nextInt(100)+"</h4>");
		out.println("<a href=\"mega-sena\">Question 5</a>"+
		"<p></p>"+

		"<a href=\"template.jsp\">Question 6</a>");
	}

}
