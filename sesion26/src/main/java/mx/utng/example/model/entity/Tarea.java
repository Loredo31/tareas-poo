package mx.utng.example.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.Date;

//long tipo de dato primitivo
//Long: Clase envoltoria  que envuelve al tipo de dato long y le da más propiedades o calquier tipo de dato queempuece con mayusculas
@Entity
public class Tarea {

    @Id @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @NotEmpty //    NO ACEPTA VALORES NULL
@Column(length = 30)
    private String descripcion; 

    @Column(length = 30)
    private String asignatura; 

    @Column(length = 30)
    private String estado; 

    @NotEmpty
    @Column(length = 30)
    private Date fechaLimite; 

    @Temporal(TemporalType.DATE)//Guardala fecha temporalmente
    private Date recordAt;

    @PrePersist
    public void prePersist(){
        recordAt = new Date();//Asigna la fecha y hora ACTUAL. del momento 

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
 public void setAsignatura(String asignatura) {
     this.asignatura = asignatura;
 }
 public String getAsignatura() {
     return asignatura;
 }
 public void setDescripcion(String descripcion) {
     this.descripcion = descripcion;
 }
 public String getDescripcion() {
     return descripcion;
 }
 public void setEstado(String estado) {
     this.estado = estado;
 }
 public String getEstado() {
     return estado;
 }
 public void setFechaLimite(Date fechaLimite) {
     this.fechaLimite = fechaLimite;
 }
 public Date getFechaLimite() {
     return fechaLimite;
 }
    
    public Date getRecordAt() {
        return recordAt;
    }
    public void setRecordAt(Date recordAt) {
        this.recordAt = recordAt;
    }



    
}
