package net.sytes.cantero.firma.dao;


import net.sytes.cantero.firma.entity.OpenCodeDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOpenCodeDAO extends JpaRepository<OpenCodeDB,Integer> {
}
