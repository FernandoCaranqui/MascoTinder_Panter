package com.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Departamento;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Persona;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.- Obtener Parametros
		String usuario = request.getParameter("usuario"); // parametro del jsp
		String password = request.getParameter("password");
		// 2.- Hablar con el Modelo

		Duenio p = DAOFactory.getFactory().getDuenioDAO().autorizar(usuario, password);

		// List<Departamento> lista =
		// DAOFactory.getFactory().getDepartamentoDAO().getByPersona(p);
		// Persona p = modelo.autorizar(usuario, password);

		if (p != null) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuarioLogeado", p);
			System.out.println("Logeado");
			// 3.- Enviar los datos a la Vista
			response.sendRedirect("ListarPersonasController");
		} else {
			System.out.println("No Logeado");
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		}
	}

	private void procesar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("usuario") == null && request.getParameter("password") == null) {
			request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
		} else {
			System.out.println("ingreso");
			// Validar que las credenciales de la persona sean válidas
			// 1.- Obtengo los parámetros
			String usuario = request.getParameter("usuario");
			String password = request.getParameter("password");

			// 2.- Verifico que las idenficiaciones correspondne con una persona en la BDD

			Duenio duenioAutenticado = DAOFactory.getFactory().getDuenioDAO().autorizarDuenio(usuario, password);

			if (duenioAutenticado != null) {
				// Creamos la sesión
				HttpSession misession = request.getSession(true);
				misession.setAttribute("usuario", duenioAutenticado);
				request.getRequestDispatcher("ListarMascotasController").forward(request, response);
			} else {
				System.out.println("al login");
				request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
			}
		}

	}
}
