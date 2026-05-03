package com.example.Mediturno.Service;

import com.example.Mediturno.Model.Medico;

import java.util.List;
import java.util.Optional;

public interface MedicoService {

    Medico crearMedico(Medico medico);
    Medico actualizarMedico(Long id,Medico medico);
    void eliminarMedico(Long id);
    Optional<Medico> obtenerMedicoPorId(Long id);
    List<Medico> obtenerMedicos();
    List<Medico> obtenerMedicosPorEspecialidad(Long especialidad);

}
