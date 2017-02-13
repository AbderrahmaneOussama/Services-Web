/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.miage.ntdp.bibliotheque.services;

import com.miage.ntdp.bibliotheque.beans.AbstractFacade;
import com.miage.ntdp.bibliotheque.entities.Categorie;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Tien
 */
@Path("categorie")
public class CategorieRessource extends AbstractFacade<Categorie> {
    @PersistenceContext(unitName = "TP1_TESTPU")
    private EntityManager em;

    public CategorieRessource() {
        super(Categorie.class);
    }
    
@GET
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public List<Categorie> list(){
    return super.findAll();
}
@POST
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//{"nom":"Categorie","description":"Descriiiption"}
@Override
public void create(Categorie c){
    super.create(c);
}

@PUT
@Path("{id}")
@Consumes({"application/xml", "application/json"})
public void edit(@PathParam("id") Long id, Categorie entity) {
      super.edit(entity);
 }

@DELETE
@Path("{id}")
public void remove(@PathParam("id") Long id) {
     super.remove(super.find(id));
}

@GET
@Path("{id}")
@Produces({"application/xml", "application/json"})
public Categorie find(@PathParam("id") Long id) {
     return super.find(id);
 }


@GET
@Path("{from}/{to}")
@Produces({"application/xml", "application/json"})
public List<Categorie> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
  }

@GET
@Path("count")
@Produces("text/plain")
public String countREST() {
      return String.valueOf(super.count());
 }

@Override
protected EntityManager getEntityManager() {
     return em;
    }
    
}
