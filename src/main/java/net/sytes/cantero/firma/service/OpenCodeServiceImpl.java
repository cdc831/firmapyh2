package net.sytes.cantero.firma.service;

import net.sytes.cantero.firma.dao.IOpenCodeDAO;
import net.sytes.cantero.firma.entity.OpenCodeDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OpenCodeServiceImpl implements IOpenCodeService{

    @Autowired
    IOpenCodeDAO iOpenCodeDAO;

    @Override
    public List<OpenCodeDB> listarDatos() {
        return iOpenCodeDAO.findAll();
    }

    @Override
    public OpenCodeDB guardarDato(OpenCodeDB openCodeDB) {
        return iOpenCodeDAO.save(openCodeDB);
    }

    @Override
    public void eliminarDato(Integer id) {
        iOpenCodeDAO.deleteById(id);
    }
}
