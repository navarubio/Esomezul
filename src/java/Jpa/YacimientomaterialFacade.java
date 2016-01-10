/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpa;

import Modelo.Yacimientomaterial;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SofiMar
 */
@Stateless
public class YacimientomaterialFacade extends AbstractFacade<Yacimientomaterial> {
    @PersistenceContext(unitName = "EsomezulPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public YacimientomaterialFacade() {
        super(Yacimientomaterial.class);
    }
    
}
