/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpa;

import Modelo.Gravable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SofiMar
 */
@Stateless
public class GravableFacade extends AbstractFacade<Gravable> {
    @PersistenceContext(unitName = "EsomezulPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GravableFacade() {
        super(Gravable.class);
    }
    
}
