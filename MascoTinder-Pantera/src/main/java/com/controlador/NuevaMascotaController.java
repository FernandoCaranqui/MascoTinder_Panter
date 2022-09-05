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


@WebServlet("/NuevaMascotaController")
public class NuevaMascotaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public NuevaMascotaController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jsp/agregarMascota.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.-Obtener parametros  ${sessionScope.usuario.getID() type="hidden"
		//int id = Integer.parseInt(request.getParameter("txtId"));
		int edad = Integer.parseInt(request.getParameter("txtedad"));
		String especie = request.getParameter("txtespecie");
		String nombre = request.getParameter("txtnombre");
		String raza = request.getParameter("txtraza");
		String sexo = request.getParameter("txtsexo");
		String ubicacion = request.getParameter("txtubicacion");
		//2.-Llamar al modelo
		Mascota mascotaModelo = new Mascota();
		
		Mascota p = new Mascota();
		Duenio d= new Duenio();
		//d.setId(id);
		p.setEdad(edad);
		p.setEspecie(especie);
		p.setNombre(nombre);
		p.setRaza(raza);
		p.setSexo(sexo);
		p.setUbicacion(ubicacion);
		p.setDuenio(d);
		//mascotaModelo.create(p);
		DAOFactory.getFactory().getMascotaDAO().create(p);
		int idUsuario = Integer.parseInt(request.getParameter("user"));
		System.out.println(idUsuario);
		//3.- llamar a la vista
		request.getRequestDispatcher("ListarMascotasController").forward(request, response);
	}

}
