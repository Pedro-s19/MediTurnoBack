package com.example.Mediturno.Service;

import com.example.Mediturno.Model.Especialidad;

import java.util.List;
import java.util.Optional;

public interface EspecialidadService {
    Especialidad crearEspecialidad(Especialidad especialidad);
    void eliminarEspecialidad(Long id);
    Optional<Especialidad> obtenerEspecialidadPorId(Long id);
    List<Especialidad> obtenerEspecialidades();
}
