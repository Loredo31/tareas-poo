package mx.utng.example.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.example.model.entity.Tarea;
import mx.utng.example.model.dao.ITareaDao;
import mx.utng.example.model.entity.Tarea;
/*
 * Una clase service, esta basada aen el patrón de diseño fachada 
 * Es un único punto de acceso hacia los DAO(Date access object).Dentro de la clase service, podemos operar
 * con distintas clases DAO.  
 */
@Service
public class TareaServiceImpl implements ITareaService {
    //Inyectamos la interfaz para utilizar los métodos de CRUD. 
    //C-Create, R-Read Retrieve, U-Update,D-Delete. 
    @Autowired
    private ITareaDao dao;

    @Transactional(readOnly = true)
    @Override
    public List<Tarea> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Tarea tarea) {
        dao.save(tarea);
    }

    @Transactional(readOnly =  true)
    @Override
    public Tarea getById(Long id) {
       return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
       dao.delete(id);
    }

    
}
