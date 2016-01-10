/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpa;

import Modelo.Patio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SofiMar
 */
@Stateless
public class PatioFacade extends AbstractFacade<Patio> {
    @PersistenceContext(unitName = "EsomezulPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PatioFacade() {
        super(Patio.class);
    }
    
}
