package mx.utng.sesion21;

import org.springframework.web.bing.annotation.RestController;
import org.springframework.web.bing.annotation.GetMapping;
import mx.utng.sesion21.model.Saludo;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public Saludo saludar(){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola mundo de SpringBoot");
        return saludo;
    }
    }


