/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
var Personne = function()
{
    //déclaration des propriétés
    var nom = "";
    var prenom = "";
    var dateDeNaissance = new Date();
    
    //declaration des accesseurs en écriture
    this.setNom = function(valeur){
        nom = valeur;
    };
    this.setPrenom = function(valeur){
        prenom = valeur;
    };
    this.setDateDeNaissance = function(valeur){
        dateDeNaissance.setDate(valeur);
    };
    
    //declaration des accesseurs en lecture
    this.getNom = function(){
        return nom;
    };
    this.getPrenom = function(){
        return prenom;
    };
    this.getDateDeNaissance = function(){
        return dateDeNaissance.toDateString();
    };
};

