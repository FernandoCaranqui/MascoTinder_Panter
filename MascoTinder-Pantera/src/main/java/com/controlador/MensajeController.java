package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;

@WebServlet("/MensajeController")
public class MensajeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MensajeController() {
        super();
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		procesarSolicitud(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		procesarSolicitud(req, resp);
	}
	
	private void procesarSolicitud(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Duenio d = (Duenio) req.getSession().getAttribute("usuario");
		req.setAttribute("mensajes", DAOFactory.getFactory().getMensajeDAO().getMensajes(d.getId()));
		getServletContext().getRequestDispatcher("/jsp/mensajes.jsp").forward(req, resp);
	}

}
