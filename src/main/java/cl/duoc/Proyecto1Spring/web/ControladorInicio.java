package cl.duoc.Proyecto1Spring.web;

import cl.duoc.Proyecto1Spring.domain.Persona;
import cl.duoc.Proyecto1Spring.service.PersonaService;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    
}
