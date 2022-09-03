package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.entidades.Mascota;

@WebServlet("/EliminarMascotaController")
public class EliminarMascotaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EliminarMascotaController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. Obtener parámetros
		int di = Integer.parseInt(request.getParameter("idMascota"));
		// 2.- Llamar al Modelo
		Mascota mascotaModelo = new Mascota();
		mascotaModelo.delete(id);

		// 3.- Llamar a la Vista
		request.getRequestDispatcher("ListarMascotasController").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
