package mx.utng.example.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.example.model.entity.Tarea;

/*
* Clase repositorio o Dao permite guardar datos y estar trabajando con ellos
UTILIZARE LA ANOTACIÓN @Repositorio
Repositorios: Sirven para guardar info(CLASES,METODOS,ETC)
 */

 @Repository
public class TareaDaoImpl implements ITareaDao {

    //Entity manager y contexto de persistencia  = Gestor de entidad persistencia nos permite ver los datos mas de una vez como la base de datos donde puedes acceder a la info
    //Guarda internamente todas las entidades y utiliza como una chache datos de DB

     @Autowired
    private EntityManager em;

    @Override

    public List<Tarea> list() {
        return em.createQuery("from Tarea").getResultList();
        
    }

    @Override
    public void save(Tarea tarea) {
        if(tarea.getId()!=null && tarea.getId()>0){
            //Actualizar si Student no es null 
            em.merge(tarea);
        }else{
            //Crear un nuevo Student
            em.persist(tarea);
        }
        
    }

    @Override
    public Tarea getById(Long id) {
        //PARA ENCONTRAR A UN ESTUDIANTE CON EL id que esta en los PARAMETROS

        return em.find(Tarea.class, id);        
    }

    @Override
    public void delete(Long id) {
    Tarea tarea = getById(id); 
    em.remove(tarea);
    }
    
}
