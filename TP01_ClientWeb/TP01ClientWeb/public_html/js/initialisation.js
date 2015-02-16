/*
 * Initialisation au chargement de la page
 */

//Initialisation de la gestion des événements onClick sur la page
function initialiser()
{
	//Création d'un tableau associant l'id d'un élément et la fonction à appeler en cas de clic sur cet élement
	window.evenementsClic = {
        btnAfficherClassePersonne : afficherClassePersonne,
        btnAfficherInstances : afficheInstance,
        btnAfficherInstancesPropres : afficheInstancePropres,
        btnComparerLesFonctions : comparerLesFonctions
	};

	//Ajout d'un écouteur d'événement onClick sur la page
	window.addEventListener('click', gererClic, true);
}

//Gestion des événements onClick de la page
function gererClic(evenement)
{
	//Récupère l'id de l'élément sur lequel l'utilisateur a cliqué
	var targetID = evenement.target.id;

	//Exécute le gestionnaire d'événement onClick correspondant à l'élément cible
	if(window.evenementsClic[targetID])
	{
		window.evenementsClic[targetID](evenement);
	}
}

//Lie la fonction initialiser au gestionnaire d'événément onLoad de la page
window.onload = initialiser;
