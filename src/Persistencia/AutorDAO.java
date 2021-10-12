/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidades.Autor;
import entidades.Libro;

/**
 *
 * @author anico
 */
public class AutorDAO extends DAO{
    
     public Autor buscarPorDni(String Nombre){
        return (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre ").setParameter("nombre", Nombre).getSingleResult();
    }
         
}
