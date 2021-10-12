/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Persistencia.AutorDAO;
import entidades.Autor;

/**
 *
 * @author anico
 */
public class AutorServicio {

    AutorDAO au = new AutorDAO();

    public Autor buscarAutor(String Nombre) {

        return au.buscarPorDni(Nombre);
    }

}
