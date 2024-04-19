package mx.utng.s28.model;

@Entity
public class Partido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name= "equipos1_fk", referentedColumnNAme = "Id")
    private Equipo equipo1;

    @ManyToOne
    @JoinColumn(name= "equipos2_fk", referentedColumnNAme = "Id")
    private Equipo equipo2;
    private Integer marcadorEquipo1;
    private Integer marcadorEquipo2;

    public Long getId() {
        return Id;
    }
    public Equipo getEquipo1() {
        return equipo1;
    }
    public Equipo getEquipo2() {
        return equipo2;
    }
    public Integer getMarcadorEquipo1() {
        return marcadorEquipo1;
    }
    public Integer getMarcadorEquipo2() {
        return marcadorEquipo2;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }
    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    public void setMarcadorEquipo1(Integer marcadorEquipo1) {
        this.marcadorEquipo1 = marcadorEquipo1;
    }
    public void setMarcadorEquipo2(Integer marcadorEquipo2) {
        this.marcadorEquipo2 = marcadorEquipo2;
    }
    

}
