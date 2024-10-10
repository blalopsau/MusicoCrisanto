/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blalopsau.musicocrisanto.controlador;

import com.blalopsau.musicocrisanto.modelo.Alumno;
import com.blalopsau.musicocrisanto.repositorio.AlumnoRepositorio;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Saúl
 */
@RestController
@RequestMapping("/api/alumno")
public class AlumnoControlador {

    private AlumnoRepositorio alumnoRepositorio;

    public AlumnoControlador(AlumnoRepositorio alumnoRepositorio) {
        this.alumnoRepositorio = alumnoRepositorio;
    }

    @GetMapping
    public List<Alumno> getTodosAlumno() {
        return alumnoRepositorio.findAll();
    }

    @PostMapping
    public Alumno anadirAlumno(@RequestBody Alumno musician) {
        return alumnoRepositorio.save(musician);
    }
}
