package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
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
		int id = Integer.parseInt(request.getParameter("idMascota"));
		/*String nombre = request.getParameter("nombreMascota");
		String especie = request.getParameter("especieMascota");
		String raza = request.getParameter("razaMascota");
		int edad = Integer.parseInt(request.getParameter("edadMascota"));
		String sexo = request.getParameter("sexoMascota");
		String ubi = request.getParameter("ubiMascota");*/
		// 2.- Llamar al Modelo
		
		Mascota mascotaModelo = DAOFactory.getFactory().getMascotaDAO().getById(id);
		System.out.println(mascotaModelo);
		/*mascotaModelo.setNombre(nombre);
		mascotaModelo.setEspecie(especie);
		mascotaModelo.setRaza(raza);
		mascotaModelo.setEdad(edad);
		mascotaModelo.setSexo(sexo);
		mascotaModelo.setUbicacion(ubi);*/
		
		DAOFactory.getFactory().getMascotaDAO().delete(mascotaModelo);

		// 3.- Llamar a la Vista
		request.getRequestDispatcher("ListarMascotasController").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
