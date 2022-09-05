package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Mascota;


@WebServlet("/BuscarMascotasController")
public class BuscarMascotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BuscarMascotasController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jsp/catalogo.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jsp/catalogo.jsp").forward(request, response);
	}
}
