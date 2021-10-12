/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Persistencia.EditorialDAO;
import entidades.Editorial;

/**
 *
 * @author anico
 */
public class EditorialServicio {
    
    EditorialDAO edit = new EditorialDAO();
    
    public void cargarEditor(Editorial e1) throws Exception{
        
            edit.crearEditor(e1);
    }
}
