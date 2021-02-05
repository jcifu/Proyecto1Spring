package cl.duoc.Proyecto1Spring.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author jacif
 */
@Data // crea los getter, setter, toString de forma automática
@Entity //reconoce la clase como entidad
@Table(name="persona") // para que no tenga errores al reconocer la tabla en bdd
public class Persona implements Serializable {
    
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idPersona;// idPersona es la identidad de la tabla/Entity de persona en BDD
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
