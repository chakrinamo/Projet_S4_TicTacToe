/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var personne1 = new Personne();
personne1.setNom("LeGrand");
personne1.setPrenom("Patrick");
personne1.setDateDeNaissance(10);

var personne2 = new Personne();
personne2.setNom("LePetit");
personne2.setPrenom("Robert");
personne2.setDateDeNaissance(20);

function afficheInstancePropres(){
    console.log(personne1);
    console.log(personne2);
}