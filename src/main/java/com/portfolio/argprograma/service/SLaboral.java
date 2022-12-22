/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Laboral;
import com.portfolio.argprograma.repository.RLaboral;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SLaboral implements ISLaboral{
    @Autowired
    RLaboral rLaboral;


    @Override
    public List<Laboral> verTrabajos(){
        List<Laboral> listaTrabajos = rLaboral.findAll();
        return listaTrabajos;
    }

    @Override
    public void crearTrabajo(Laboral lab) {
        rLaboral.save(lab);
    }

    @Override
    public void borrarTrabajo(Long id) {
       rLaboral.deleteById(id);
    }

    @Override
    public Laboral buscarTrabajo(Long id) {
        //acá si no encuentro la persona, devuelvo null por eso va el orElse
        Laboral traba = rLaboral.findById(id).orElse(null);
        return traba;
    }
}
