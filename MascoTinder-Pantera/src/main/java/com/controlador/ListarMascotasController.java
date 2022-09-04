package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;

@WebServlet("/ListarMascotasController")
public class ListarMascotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		procesarSolicitud(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		procesarSolicitud(req, resp);
	}

	private void procesarSolicitud(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setAttribute("mascotas", DAOFactory.getFactory().getMascotaDAO().getMascotas());
		getServletContext().getRequestDispatcher("/jsp/ListarMascotas.jsp").forward(req, resp);
	}

}
