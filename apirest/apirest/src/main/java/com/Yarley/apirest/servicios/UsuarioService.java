package com.Yarley.apirest.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yarley.apirest.entities.User;
import com.Yarley.apirest.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public ArrayList<User> obtenerUsuarios() {
        return new ArrayList<>(usuarioRepository.findAll());
    }

    public User guardarUsuario(User usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<User> obtenerPorId(Integer id) {
        return usuarioRepository.findById(id);
    }

    public boolean eliminarUsuario(Integer id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
