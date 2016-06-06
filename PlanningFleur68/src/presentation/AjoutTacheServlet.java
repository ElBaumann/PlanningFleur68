package presentation;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entite.Employe;
import metier.EmployeUtil;
import metier.PlanningUtil;

/**
 * Servlet implementation class DispoEmployeServlet
 */
@WebServlet("/AjoutTacheServlet")
public class AjoutTacheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjoutTacheServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat();

		AjoutTacheBean bean = new AjoutTacheBean("", "", "","" , "" , "", "");
		String typeDeTache = "";
		String adresse = "";
		Date dateDebut = new Date();
		Date dateFinReal = new Date();
		String nom = "";
		String prenom = "";
		String etat = "";

		if (request.getParameter("NOM") != null) {
			nom = request.getParameter("NOM");
			prenom = request.getParameter("PRENOM");
			typeDeTache = request.getParameter("TYPEDETACHE");
			adresse = request.getParameter("ADRESSE");
			try {
				dateDebut = sdf.parse(request.getParameter("DATEDEBUT"));
				dateFinReal = sdf.parse(request.getParameter("DATEFIN"));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			

			EmployeUtil eu = EmployeUtil.getInstance();
			PlanningUtil pu = PlanningUtil.getInstance();

			try {
				if (eu.rechercheEmployee(nom, prenom).getNom() == null) {
					eu.createEmploye(nom, prenom);
					pu.addTache(eu.rechercheEmployee(nom, prenom), typeDeTache, adresse, dateDebut, dateFinReal);
				}
				else {
					pu.addTache(eu.rechercheEmployee(nom, prenom), typeDeTache, adresse, dateDebut, dateFinReal);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// try {
			// eu.createEmploye(nom, prenom);
			etat = " a été ajouté à la base de données avec succes";
			// } catch (SQLException e) {
			// etat = " n'a pas été ajouté à la base de données";
			// }

			bean = new AjoutTacheBean(nom, prenom, typeDeTache, adresse, dateDebut.toString(), dateFinReal.toString(), etat);
		}

		request.setAttribute("bean", bean);
		request.getRequestDispatcher("/vue_ajoutemploye.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
