package com.Yarley.apirest.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Yarley.apirest.servicios.UsuarioService;
import com.Yarley.apirest.usuario.AuthService;


@RestController
@RequestMapping("/usuarios") // Cambiado de "/usuario" a "/usuarios" para seguir convenciones de plural
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/status")
    public String status(){
        return "hakiao por robles";
    }

    /*
    @GetMapping
    public List<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return usuarioService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public List<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
        return usuarioService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping("/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean eliminado = usuarioService.eliminarUsuario(id);
        return eliminado ? "Se eliminó el usuario con id " + id : "No se pudo eliminar el usuario con id " + id;
    }

    @PostMapping(value ="login")
    public ResponseEntity<AuthService> postMethodName(@RequestBody SomeEnityData entity) {
        
        
        return ResponseEntity.ok(AuthService.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity postMethodName(@RequestBody SomeEnityData entity) {
        //TODO: process POST request
        
        return ResponseEntity.ok (AuthService.register(request));
    }
    
    

    
    */
        
}

