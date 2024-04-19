package mx.utng.example.model.dao;
import java.util.List;
import mx.utng.example.model.entity.Tarea;


public interface ITareaDao {
    List<Tarea>list(); 
    void save(Tarea tarea);
    Tarea getById(Long id);
    void delete (Long id);

}
