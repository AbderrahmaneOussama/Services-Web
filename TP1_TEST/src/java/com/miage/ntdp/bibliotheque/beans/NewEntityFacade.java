/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.ntdp.bibliotheque.beans;

import com.miage.ntdp.bibliotheque.entities.NewEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tien
 */
@Stateless
public class NewEntityFacade extends AbstractFacade<NewEntity> {
    @PersistenceContext(unitName = "TP1_TESTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NewEntityFacade() {
        super(NewEntity.class);
    }
    
}
