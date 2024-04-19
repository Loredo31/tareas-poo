package mx.utng.example.model.service;

import mx.utng.example.model.entity.Tarea;
import java.util.List;

public interface ITareaService {
    List<Tarea> list();
    void save (Tarea tarea); 
    Tarea getById(Long id); 
    void delete (Long id);
}
