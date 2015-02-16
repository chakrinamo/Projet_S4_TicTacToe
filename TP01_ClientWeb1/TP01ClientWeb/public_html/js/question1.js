/**
 * Code de la question 1
 */
function afficherClassePersonne()
{
    //Si la classe Personne est définie
    if(typeof(Personne) !== "undefined")
        console.log(Personne);
    else
        console.log("Vous n'avez pas encore déclaré la classe 'Personne' !");
}