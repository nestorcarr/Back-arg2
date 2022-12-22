/*

 */
package com.portfolio.argprograma.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Laboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@NotNull
    //@Size(min = 1, max = 600, message = "no cumple con la longitud")
    private String empresa;
    //@NotNull
    //@Size(min = 1, max = 1400, message = "no cumple con la longitud")
    private String logo;
    //@NotNull
    //@Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String cargo;
    
    private Date inicio;
    
    private Date finalizado;
    //@NotNull
    @Lob
    @Column(length=2000)
    private String tareas;

    public Laboral() {
    }

    public Laboral(String empresa, String logo, String cargo, Date inicio, Date finalizado, String tareas) {
        this.empresa = empresa;
        this.logo = logo;
        this.cargo = cargo;
        this.inicio = inicio;
        this.finalizado = finalizado;
        this.tareas = tareas;
    }

    
}

