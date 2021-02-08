package cl.duoc.Proyecto1Spring.web;

import cl.duoc.Proyecto1Spring.domain.Persona;
import cl.duoc.Proyecto1Spring.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jacif
 */
@Controller
/*
Todos los controller que se creean en la aplicación tienen la misma tecnologia de un servlet
Spring se encarga de hacer llamados cuando se hacen peticiones
*/
@Slf4j
/*
Slf4j permite utilizar anotaciones (consola) de lombok a través de log.info
*/

/*
Cada vez que carga la página 
*/
public class ControladorInicio {
    /**
     * 
     * @param modelo es un objeto de tipo Model que es muy similar a trabajar 
     * con HttpServletRequest y HttpServletResponse pero es una dependencia de 
     * Spring que permite codificar menos
     * @return 
     */
    //Value necesita importar la libreria de Spring no de lombok. pasa un valor: index variable
    //@Value es una anotación. No se puede utilizar dentro de un método
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model modelo){
        
        var personas= personaService.listarPersonas();
        modelo.addAttribute("personas", personas);
        return "index";
        //Thymeleaf trabaja con html, puede con jsp pero no es lo optimo   
    }
    /**
     * Desde Index se presionara un link paa llevarnos a la página de modificar.html
     * Cuando presione el link en la url se mostrará la palabra agregar en vez del
     * nombre del archivo
     * @param
     * @return
     */
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    /**
     * Al presionar guardar en el formulario 
     * (considerando que el boton debe ser un submit),
     * se enviará los datos a procesar en PersonaService 
     * para almacenar el objeto Persona 
     * @param persona
     * @return 
     */
    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaService.guardar(persona);
        
        //redirigir a la pantalla principal o raíz "/"
        return "redirect:/";
    }
}
