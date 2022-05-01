<h3>Introduction</h3>
<p>Sécuriser L'accès à l'application qui permet de gérer les Patients en utilisant Spring Security</p>
<p>Trois Stratégies utilisées:</p>
<ul>
 <li> InMemoryAuthentication</li>
 <li> JDBCAuthentication</li>
 <li> UserDetailsService</li>
</ul>
<h5>Objectif:</h5>
<p>L'accès à l'application doit nécessite une Authentification avec username et un mot de passe.</p>

<p>Un utilisateur peut avoir plusieurs roles :</p>
<p>- ROLE_USER: permettant de chercher des patients</p>
<p>- ROLE_ADMIN: permettant d'ajouter, Mettre à jour et supprimer les patients</p>
<hr>
<h5>Architecure:</h5>
<img src="images/arch.PNG">
<br>
<img src="images/Capture.PNG">

<hr>
<p>Page home</p>
<img src="images/cap.PNG">
<hr>

<h4>Interface de l'entité Patient</h4>
<h5>Role Admin:</h5>

<p>Page index</p>
<img src="images/homeAD.PNG">

<p>Formulaire d'ajout</p>
<img src="images/ajouterP.PNG">

<p>Formulaire pour éditer</p>
<img src="images/modifierP.PNG">

<p>Rechercher un patient</p>
<img src="images/searchP.PNG">

<br>
<br>
<h5>Role User:</h5>
<p>Page index</p>
<img src="images/homeUS.PNG">

<p>Rechercher un Patient</p>
<img src="images/searchPUser.PNG">

<hr>
<hr>
<h4>Interface de l'entité Medecin</h4>
<h5>Role Admin:</h5>
<p>Page index</p>
<img src="images/indexADMED.PNG">

<h5>Role User:</h5>
<p>Page index</p>
<img src="images/indexUserMED.PNG">


<hr>
<p>Formulaire Login</p>
<img src="images/login.PNG">
