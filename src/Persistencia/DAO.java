/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author anico
 */
public class DAO {
    
    EntityManager em = Persistence.createEntityManagerFactory("LibreriaJPA").createEntityManager();

}
