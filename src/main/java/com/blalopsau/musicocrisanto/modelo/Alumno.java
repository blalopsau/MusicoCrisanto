/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blalopsau.musicocrisanto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;

/**
 *
 * @author Saúl
 */
@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private Date fechanacimiento;
    private String email;
    private String concello;
    private String dni;
    private String direccion;
    private String locacidad;
    private String codigopostal;
    private String nombreresponsable;
    private String apellido1responsable;
    private String apellido2responsable;
    private String dniresponsable;
    private String telefonoresponsable;
    private String iban;
    private Boolean socio;
    private Boolean inscritoantes;
    private Date fechamatricula;
    private Boolean aceptacondiciones;
    private Boolean descuento;

    public Alumno() {
    }

//    Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConcello() {
        return concello;
    }

    public void setConcello(String concello) {
        this.concello = concello;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocacidad() {
        return locacidad;
    }

    public void setLocacidad(String locacidad) {
        this.locacidad = locacidad;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getNombreresponsable() {
        return nombreresponsable;
    }

    public void setNombreresponsable(String nombreresponsable) {
        this.nombreresponsable = nombreresponsable;
    }

    public String getApellido1responsable() {
        return apellido1responsable;
    }

    public void setApellido1responsable(String apellido1responsable) {
        this.apellido1responsable = apellido1responsable;
    }

    public String getApellido2responsable() {
        return apellido2responsable;
    }

    public void setApellido2responsable(String apellido2responsable) {
        this.apellido2responsable = apellido2responsable;
    }

    public String getDniresponsable() {
        return dniresponsable;
    }

    public void setDniresponsable(String dniresponsable) {
        this.dniresponsable = dniresponsable;
    }

    public String getTelefonoresponsable() {
        return telefonoresponsable;
    }

    public void setTelefonoresponsable(String telefonoresponsable) {
        this.telefonoresponsable = telefonoresponsable;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Boolean getSocio() {
        return socio;
    }

    public void setSocio(Boolean socio) {
        this.socio = socio;
    }

    public Boolean getInscritoantes() {
        return inscritoantes;
    }

    public void setInscritoantes(Boolean inscritoantes) {
        this.inscritoantes = inscritoantes;
    }

    public Date getFechamatricula() {
        return fechamatricula;
    }

    public void setFechamatricula(Date fechamatricula) {
        this.fechamatricula = fechamatricula;
    }

    public Boolean getAceptacondiciones() {
        return aceptacondiciones;
    }

    public void setAceptacondiciones(Boolean aceptacondiciones) {
        this.aceptacondiciones = aceptacondiciones;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }
    
    
}
