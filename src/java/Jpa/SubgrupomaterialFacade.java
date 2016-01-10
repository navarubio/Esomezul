/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpa;

import Modelo.Subgrupomaterial;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SofiMar
 */
@Stateless
public class SubgrupomaterialFacade extends AbstractFacade<Subgrupomaterial> {
    @PersistenceContext(unitName = "EsomezulPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SubgrupomaterialFacade() {
        super(Subgrupomaterial.class);
    }
    
}
