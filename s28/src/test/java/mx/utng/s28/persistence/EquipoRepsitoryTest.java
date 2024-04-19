package mx.utng.s28.persistence;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Equipo;

@SpringBootTest
@ComponentScan(basePackages="mx.utng.s28")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EquipoRepsitoryTest {
    
    @Autowired
    private EquipoRepository repository;

    @BeforeAll
        void cleanDatabase(){
            repository.deleteAll();
        }
    
        void canSave(){

            //Instancio un equipo
            Equipo equipo = new Equipo();
            equipo.setNombre("America");

            //Guardo el equipo 
            equipo = repository.save(equipo);

            //Prueba que exista in id en este equipo guardado
            assertNotNull(equipo);
        }

        @Test
        @DisplayName("Buscar por nombre")
        void canFindByName(){
            String name="Chivas";
    
            Equipo equipo = new Equipo();
            equipo.setNombre(name);
            repository.save(equipo);
    
            Iterable<Equipo> listaEquipos = repository.findAllByNombre(name);
    
            assertTrue(listaEquipos.iterator().hasNext());
    
            Equipo equipoEncontrado = listaEquipos.iterator().next();
            assertEquals(equipo, equipoEncontrado);
        }
    }
