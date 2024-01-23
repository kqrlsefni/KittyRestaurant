package KittyRestaurant.MsPlatillo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="platillo")

public class PlatilloModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdPlatillo")
    public int IdPlatillo;

    @Column(name="Nombre")
    public String Nombre;

    @Column(name="Descripcion")
    public String Descripcion;

    public int getIdPlatillo(){
        return IdPlatillo;
    }

    public void setIdPlatillo(int IdPlatillo){
        this.IdPlatillo = IdPlatillo;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getDescripcion(){
        return Descripcion;
    }

    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
}
