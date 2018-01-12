package br.com.nextel.architecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.nextel.architecture.web.controller.StausController;

/**
 * @author "Ricardo Amorim Rodrigues" Criada em: 06/12/2013
 * Alterada por: "(Ninguém)" Alterada em:
 *
 * Servlet implementation class WebServlet
 */
public class WebServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doControl(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doControl(request, response);
	}
	
	protected void doControl(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String STATE_CALL_ME = String.valueOf(request.getParameter("STATE_CALL_ME"));
		
		if(STATE_CALL_ME.equals("START")) {
			StausController.CONSULTA_STATUS = true;
			//new StartCallMeControl().startProcessCallMe();
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			pw.println("<html>");
			pw.println("<head><title>PROCESSO CALL ME AUTOMÁTICO!</title></title>");
			pw.println("<body><center>");
			pw.println("<h1>STATUS DO PROCESSO CALL ME: <br> <p style='color: #238E23; font-size: 24pt'>" + STATE_CALL_ME + " !</p> </h1>");
			pw.println("<br> <br> <button type='button' onClick='history.back();' >>VOLTAR<</button> ");
			pw.println("</center></body></html>");
			pw.flush();
			pw.close();
			
		} else if (STATE_CALL_ME.equals("STOP")) {
			StausController.CONSULTA_STATUS = false;
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			pw.println("<html>");
			pw.println("<head><title>PROCESSO CALL ME AUTOMÁTICO!</title></title>");
			pw.println("<body><center>");
			pw.println("<h1>STATUS DO PROCESSO CALL ME: <br> <p style='color: #FF0000; font-size: 24pt'>" + STATE_CALL_ME + " !</p> </h1>");
			pw.println("<br> <br> <button type='button' onClick='history.back();' >>VOLTAR<</button> ");
			pw.println("</center></body></html>");
			pw.flush();
			pw.close();
			
		} else if (STATE_CALL_ME.equals("STATUS")) {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String status = "";
			if (StausController.CONSULTA_STATUS == true){
				status = "RUNNING !";
			} else {
				status = "STOPPED !";
			}
			pw.println("<html>");
			pw.println("<head><title>PROCESSO CALL ME AUTOMÁTICO!</title></title>");
			pw.println("<body><center>");
			pw.println("<h1>STATUS DO PROCESSO CALL ME: <br> <p style='color: " + (StausController.CONSULTA_STATUS ? "#238E23" : "#FF0000") + "; font-size: 24pt'>" + status + " </p> </h1>");
			pw.println("<br> <br> <button type='button' onClick='history.back();' >>VOLTAR<</button> ");
			pw.println("</center></body></html>");
			pw.flush();
			pw.close();
		} else {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			pw.println("<html>");
			pw.println("<head> <title>PROCESSO CALL ME AUTOMÁTICO!</title></title>");
			pw.println("<body>");
			pw.println("<center><h1>PROCESSO CALL ME AUTOMÁTICO:");
			pw.println("<br> <br><input type='submit' id='Go' value='START' onclick=" +  "\" " + "document.location='/CallMeWeb/WebServlet?STATE_CALL_ME=START'" + "\" " + "; return false;' />");
			pw.println("<br> <br><input type='submit' id='Go' value='STOP' onclick=" +  "\" " + "document.location='/CallMeWeb/WebServlet?STATE_CALL_ME=STOP'" + "\" " + "; return false;' />");
			pw.println("<br> <br><input type='submit' id='Go' value='STATUS' onclick=" +  "\" " + "document.location='/CallMeWeb/WebServlet?STATE_CALL_ME=STATUS'" + "\" " + "; return false;' />");
			pw.println("</h1>");
			pw.println("</center></body></html>");
			pw.flush();
			pw.close();
		}
	}
}
