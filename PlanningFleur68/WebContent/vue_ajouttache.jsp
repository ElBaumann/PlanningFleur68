<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="espacevert.css">

<title>Ajout tache</title>
</head>
<body>


<nav>
	<ul>
		<li><a href="vue_accueil.jsp">Accueil</a></li>
		<li><a href="vue_planning.jsp">Planning</a></li>
		<li><a href="vue_ajoutemploye.jsp">Gestion des employés</a></li>
		<li><a href="vue_dispoemploye.jsp">Disponibilité des employés</a></li>
		<li class="active"><a href="vue_ajoutache.jsp">Gestion des tâches</a></li>
		
	</ul>
	</nav>

<section id="photo"> <img src="tondeuse.jpg" title="tondeuse"
		alt="tondeuse" id="tondeuse" />
		</section>

	<div id="addTache">
		<form action="AjoutTacheServlet" method="get">
			Type de tâche: <input type="text" NAME="TYPEDETACHE" value="${bean.TypeDeTache}" /><br />
			Adresse : <input type="text" NAME="ADRESSE" value="${bean.Adresse}" /><br />
			Nom : <input type="text" NAME="NOM" value="${bean.nom}" /><br />
			Prenom : <input type="text" NAME="PRENOM" value="${bean.prenom}" /><br />
			Date de début : <input type="text" NAME="DATEDEBUT" value="${bean.DateDeDebut}" /><br />
			Date de fin : <input type="text" NAME="DATEFIN" value="${bean.DateDeFin}" /><br />
			<input type="submit" NAME="SUBDATE" value="valider" />
		</form>
	</div>

	<div id="result">${bean.TypeDeTache}${bean.Adresse}${bean.nom}${bean.prenom}${bean.DateDeDebut}${bean.DateDeFin}</div>


</body>
</html>