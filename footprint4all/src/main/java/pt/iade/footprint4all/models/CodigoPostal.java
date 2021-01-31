package pt.iade.footprint4all.models;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.Id;


@Entity
@Table(name="Codigopostal")
public class CodigoPostal {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="cod_id") private int id;
    @Column(name="cod_distrito") private String distrito;
    @Column(name="cod_localidade") private String localidade;
    @Column(name="cod_concelho") private String concelho;
    @Column(name="cod_nrporta") private String nrporta;
    @OneToOne(mappedBy = "codigopostal") private Utilizador utilizador;

    public CodigoPostal() {}

    public int getId() {
        return id;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getConcelho() {
        return concelho;
    }

    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }

    public String getNrporta() {
        return nrporta;
    }

    public void setNrporta(String nrporta) {
        this.nrporta = nrporta;
    }
    
}
