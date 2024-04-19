package mx.utng.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import mx.utng.example.model.entity.Tarea;
import mx.utng.example.model.service.ITareaService;

@Controller
public class TareaController {
    
    @Autowired //Crea una instancia para que puedas utilizarla sin utlizar = new la clase y sin inicializarla desde un contructor
    private ITareaService service;


    @GetMapping({"","/","/list"})
    public String list(Model model){

    model.addAttribute("title", "Tarea");
    model.addAttribute("tarea",service.list());
    return "list";

    }

    @GetMapping("/form")//Si usas peticion GET lo tienes que hacer encriptado para que sea seguro. 
    public String create(Model model){
        model.addAttribute("title","Tareas");
        model.addAttribute("ventas", new Tarea());
        return "form";
    }

    @PostMapping("/form")  
    //Peticion POST para guardar datos de forma mas segura 
    public String save(@Valid Tarea tarea,BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title","Tarea");
            return "form";
        }
        service.save(tarea);
        return "redirect:list";

    }

    @GetMapping("/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Tarea tarea = null;
        if(id>0){
            tarea = service.getById(id);
        }else{
            return "redirect:list";
        }
        model.addAttribute("title", "Tarea");
        model.addAttribute("Tarea", tarea);
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if (id>0 ){
            service.delete(id);
        }
        return "redirect:/list";
    }



}
