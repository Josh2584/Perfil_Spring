package com.example.perf.users;

import java.util.List;
import java.util.Map;

public class Usuario {

    private String nombre;
    private String correo;
    private String github;

    private Map<String, String> contenidos;

    private List<String> categorias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public Map<String, String> getContenidos() {
        return contenidos;
    }

    public void setContenidos(Map<String, String> contenidos) {
        this.contenidos = contenidos;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }
}
