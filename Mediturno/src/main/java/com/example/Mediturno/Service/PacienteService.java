package com.example.Mediturno.Service;

import com.example.Mediturno.Model.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteService {
    Paciente crearPaciente(Paciente paciente);
    Paciente actualizarPaciente(Long id, Paciente paciente);
    void eliminarPaciente(Long id);
    Optional<Paciente> obtenerPacientePorId(Long id);
    List<Paciente> obtenerPacientes();
}
