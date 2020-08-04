package net.sytes.cantero.firma.service;

import net.sytes.cantero.firma.dao.IOpenCodeDAO;
import net.sytes.cantero.firma.entity.OpenCodeDB;

import java.util.List;

public interface IOpenCodeService {

    public List<OpenCodeDB> listarDatos();
    public OpenCodeDB guardarDato(OpenCodeDB openCodeDB);
    public void eliminarDato(Integer id);

    }

