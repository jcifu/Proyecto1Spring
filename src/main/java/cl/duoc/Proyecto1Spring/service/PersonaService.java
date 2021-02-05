
package cl.duoc.Proyecto1Spring.service;

import java.util.List;
import cl.duoc.Proyecto1Spring.domain.Persona;

/**
 *
 * @author jacif
 */
public interface PersonaService {
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
