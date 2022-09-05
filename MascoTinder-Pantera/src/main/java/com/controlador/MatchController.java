package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;

@WebServlet("/MatchController")
public class MatchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MatchController() {
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
		int id = Integer.parseInt(req.getParameter("idMascota"));
		req.setAttribute("matches", DAOFactory.getFactory().getMatchDAO().getMatches(id));
		//req.setAttribute("mascota", DAOFactory.getFactory().getMascotaDAO().getById(id));
		getServletContext().getRequestDispatcher("/jsp/listarMatch.jsp").forward(req, resp);
	}
}
