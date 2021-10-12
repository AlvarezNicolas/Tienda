/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidades.Editorial;

/**
 *
 * @author anico
 */
public class EditorialDAO extends DAO{
    
    public void crearEditor(Editorial edit) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(edit);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al persistir un libro");
        }
    }
    
}
