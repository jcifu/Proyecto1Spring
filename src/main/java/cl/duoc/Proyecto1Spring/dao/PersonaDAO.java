/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.Proyecto1Spring.dao;

import org.springframework.data.repository.CrudRepository;
import cl.duoc.Proyecto1Spring.domain.Persona;
/**
 *
 * @author jacif
 */
public interface PersonaDAO extends CrudRepository<Persona, Long> {
    
}
