package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.entidades.Mascota;


@WebServlet("/BuscarMascotasController")
public class BuscarMascotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BuscarMascotasController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jsp/preferencias.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarSolicitud( request, response);
	}
	private void procesarSolicitud(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		int edad = Integer.parseInt(req.getParameter("txtedad"));
		String especie = req.getParameter("txtespecie");
		String raza = req.getParameter("txtraza");
		String sexo = req.getParameter("txtsexo");
		String ubicacion = req.getParameter("txtubicacion");
		
		Mascota p = new Mascota();
		p.setEdad(edad);
		p.setEspecie(especie);
		p.setRaza(raza);
		p.setSexo(sexo);
		p.setUbicacion(ubicacion);
		//mascotaModelo.create(p);
		//DAOFactory.getFactory().getMascotaDAO().create(p);
		
		//3.- llamar a la vista
		//request.getRequestDispatcher("CatalogoController").forward(request, response);
		req.setAttribute("usuarios", p );
		getServletContext().getRequestDispatcher("/jsp/catalogo.jsp").forward(req, resp);

	}
}
