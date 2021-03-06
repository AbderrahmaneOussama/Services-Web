/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
Cette function est le controlleur de la vue  
Elle assure la communication entre la vue et le modèle, une sorte de pont quoi!  
*/
              var ViewModel = function(categories) {  
              var self = this;  
        //représente la liste des catégories  
        //La fonction prend la réponse obtenue du serveur en paramètre  
        //Ici nous supposons que vous avez chargé la liste des catégories  
        //ko.utils.arrayMap itère sur la collection et pour chaque objet trouvé, elle crée une instance de categorie 
                //self.Categories = ko.observableArray([]);
                self.categories = ko.observableArray(ko.utils.arrayMap(categories, function(categorie) { return new Category(categorie);}));  
                                self.remove = function(categorie){
                   self.categories.remove(categorie);
                   console.log("lolo: "+JSON.stringify(categorie))
                    $.ajax({
                        url: "http://localhost:8080/tp1/webresources/categorie/"+categorie.id(),
                        type: "DELETE",
                        contentType: "application/json",
                        headers: {
                        Accept : "application/json"
                    }
                    })
                            .success(function(data, status, jq) {
                        // alert(status);
                        self.categories.remove(categorie);
                    })
                            .error(function(jq, status, error) {
                        $(".error").text(JSON.stringify(status + " " + error));

                    });
                };
                self.update = function(categorie){ 
                   self.categories;
                };
              };  
                 var getData = function() {  
                $.ajax({  
                        url: "http://localhost:8080/tp1/webresources/categorie",  
                        type: "GET",  
                         headers: {  
                            Accept: "application/json"  
                          }  
                       }).success(function(data, status, jq) {  
                         //Cette fonction indique à knockout d'appliquer les données aux éléments de la page   
                         //Elle est toujours appelée quand les données sont pretes et est appelée qu'une fois   
                        ko.applyBindings(new ViewModel(data));  
                        console.log("jj: "+JSON.stringify(data));
                        }).error(function(jq, status, error) {  
                         $(".error").text(JSON.stringify(status + " " + error));  
  
                        });  
                    };
                    
