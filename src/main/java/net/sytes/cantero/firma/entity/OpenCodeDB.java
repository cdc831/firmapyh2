package net.sytes.cantero.firma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Data
@Entity
@Table(name = "opencodedb")
public class OpenCodeDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "empresaDocumentoTipo")
    private String empresaDocumentoTipo;

    @Column(name = "empresaDocumento")
    private String empresaDocumento;

    @Column(name = "remesaCod")
    private String remesaCod;

    @Column(name = "empleadoDocumentoTipo")
    private String empleadoDocumentoTipo;

    @Column(name = "empleadoDocumento")
    private String empleadoDocumento;

    @Column(name = "reciboTipo")
    private String reciboTipo;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "reciboFecha")
    private Date reciboFecha;

    @Column(name = "reciboPDF")
    private String reciboPDF;

    @Column(name = "rhId")
    private String rhId;

}

