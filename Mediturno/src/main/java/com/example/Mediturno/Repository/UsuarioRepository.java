package com.example.Mediturno.Repository;

import com.example.Mediturno.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    /** Busca un usuario por su nombre de usuario exacto. */
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    /** Busca un usuario por su correo electrónico. */
    Optional<Usuario> findByEmailUsuario(String emailUsuario);
    /** Verifica si existe un usuario con ese nombre de usuario. */
    Boolean existsByNombreUsuario(String nombreUsuario);
    /** Verifica si existe un usuario con ese correo electrónico. */
    Boolean existsByEmailUsuario(String emailUsuario);
}
