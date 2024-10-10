/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.blalopsau.musicocrisanto.repositorio;

import com.blalopsau.musicocrisanto.modelo.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Saúl
 */
public interface AlumnoRepositorio extends JpaRepository<Alumno, Long>{
    
}
