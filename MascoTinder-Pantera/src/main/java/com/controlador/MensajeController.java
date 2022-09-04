package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;

@WebServlet("/MensajeController")
public class MensajeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MensajeController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void procesarSolicitud(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setAttribute("mensajes", DAOFactory.getFactory().getMensajeDAO().getMensajes());
		getServletContext().getRequestDispatcher("/jsp/mensajes.jsp").forward(req, resp);
	}

}
