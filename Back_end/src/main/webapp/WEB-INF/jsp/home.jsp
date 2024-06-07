<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Accueil</title>
</head>
<body>
<h2>Bienvenue sur la Page d'Accueil</h2>
<p>Cette page est la page d'accueil de votre application.</p>
<p><a href="${pageContext.request.contextPath}/employees">Voir la Liste des Employés</a></p>
<p><a href="${pageContext.request.contextPath}/assignEmployee.jsp">Affecter un Employé à un Projet</a></p>
</body>
</html>
