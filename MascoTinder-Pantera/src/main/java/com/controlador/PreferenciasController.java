package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;
import com.modelo.entidades.Preferencia;

/**
 * Servlet implementation class PreferenciasController
 */
@WebServlet("/PreferenciasController")
public class PreferenciasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PreferenciasController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jsp/preferencias.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarSolicitud(request, response);
	}
	
	private void procesarSolicitud(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Preferencia p = new Preferencia();
		//p.setEdad(Integer.parseInt(req.getParameter("edad-max")));
		p.setSexo(req.getParameter("sexo"));
		p.setEspecie(req.getParameter("especie"));
		p.setUbicacion(req.getParameter("ubicacion"));
		p.setDuenioPreferencia((Duenio)req.getAttribute("usuario"));
		//p.setRaza(req.getParameter("especie"));
		
		//3.- llamar a la vista
		req.setAttribute("preferencias", DAOFactory.getFactory().getPreferenciaDAO().getPreferencias(p));
		getServletContext().getRequestDispatcher("/jsp/catalogo.jsp").forward(req, resp);

	}

}
