/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var personne1 = new Personne();
personne1.nom = "LeGrand";
personne1.prenom = "Patrick";
personne1.dateDeNaissance.setDate(10);

var personne2 = new Personne();
personne2.nom = "LePetit";
personne2.prenom = "Robert";
personne2.dateDeNaissance.setDate(20);

function afficheInstance(){
    console.log(personne1);
    console.log(personne2);
}