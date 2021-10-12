/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidades.Libro;

/**
 *
 * @author anico
 */
public class LibroDAO extends DAO {

    public void crearLibro(Libro libro) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al persistir un libro");
        }
    }

    public Libro buscarPorISBN(Long ISBN) {
        return em.find(Libro.class, ISBN);
    }

    public Libro buscarXTitulo(String Titulo) throws Exception {
        try {
            return (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.titulo = :titulo ").setParameter("titulo", Titulo).getSingleResult();
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
        return null;
    }

}
