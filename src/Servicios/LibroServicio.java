/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Persistencia.LibroDAO;
import entidades.Libro;

/**
 *
 * @author anico
 */
public class LibroServicio {
    
    LibroDAO lib = new LibroDAO();
    
    public void cargarlibro(Libro libro) throws Exception{
        
            lib.crearLibro(libro);
    }

 public Libro buscarISBN(Long ISBN) {

        return lib.buscarPorISBN(ISBN);
    }
     
       public Libro buscarTitulo(String Titulo) {

        return lib.buscarXTitulo(Titulo);
    }
}
