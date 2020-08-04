package net.sytes.cantero.firma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
@Table(name = "opencodedb")
@Data
public class OpenCodeDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String OPENCODE_ID;
    private String COMPANY_FISCAL_ID_TYPE;
    private String COMPANY_FISCAL_ID;
    private String CONSIGNMENT_ID;
    @NotNull
    private String EMPLOYEE_FISCAL_ID_TYPE;
    @NotNull
    private String EMPLOYEE_FISCAL_ID;
    @NotNull
    private String DOCUMENT_TYPE;
    //@JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    //@Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date DOCUMENT_DATE;
    @NotNull
    private String DOCUMENT_PATH;
    @NotNull
    private String ACTION_COLUMN;
    private String RESULT_COLUMN;
    private String OPENCODE_RESPONSE_CODE;
    private String OPENCODE_RESPONSE_DESCRIPTION;
}
