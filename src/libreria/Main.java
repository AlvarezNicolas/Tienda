/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import Servicios.AutorServicio;
import Servicios.EditorialServicio;
import Servicios.LibroServicio;
import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;

/**
 *
 * @author anico
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        LibroServicio ls = new LibroServicio();
        try {
            Autor a1 = new Autor("R_Tolkien");
            Autor a2 = new Autor("Karen_Camera");

            Editorial e1 = new Editorial("Tirant_Lo_Blanch");
            Editorial e2 = new Editorial("Grijalbo");

            Libro l1 = new Libro(43426256L, "El senior de los anillos", 1999, 12, 0, 12, true, a1, e1);
            Libro l2 = new Libro(34525337L, "Come bien, corre mejor", 2018, 3, 0, 3, true, a2, e2);
            ls.cargarlibro(l1);
            ls.cargarlibro(l2);
            System.out.println("BUSCAREMOS UN AUTOR POR NOMBRE");
            System.out.println(as.buscarAutor("R_Tolkien").toString());

            System.out.println("BUSCAREMOS UN LIBRO POR ISBN");
            System.out.println(ls.buscarISBN(43426256L).toString());

            System.out.println("BUSCAREMOS UN LIBRO POR TITULO");
            System.out.println(ls.buscarTitulo("El senior de los anillos").toString());
            
            System.out.println("BUSCAREMOS UN LIBRO POR NOMBRE DE AUTOR");
            

        } catch (Exception e) {
            System.err.println("ERROR DE NOVATO" + e);
        }

    }
}
