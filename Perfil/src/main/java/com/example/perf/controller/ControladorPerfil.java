package com.example.perf.controller;

import com.example.perf.users.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class ControladorPerfil {

    @GetMapping("/perfil")
    public String perfil(@RequestParam(required = false, defaultValue = "nombre") String categoria, Model model) {

    	//si se mantiene en true se muestra el menú en azul, sino se muestra en rojo.
        boolean panelAzul = false;
        String colorPanel = panelAzul ? "panel-primary" : "panel-danger";

        Usuario usuario = new Usuario();
        usuario.setNombre("Joshua Alejandro Porras Villalobos");
        usuario.setCorreo("a377175@uach.mx");
        usuario.setGithub("https://github.com/Josh2584");

        usuario.setCategorias(List.of(
                "gran-malo",
                "johnnie-walker",
                "cafe",
                "cuatro",
                "fatum-betula", //Probablemente el que más producción tiene
                "top-3",
                "l",
                "azul",
                "rojo",
                "todo"
        ));

        usuario.setContenidos(Map.of(
                "gran-malo", "Precio aproximado: $350",
                "johnnie-walker", "Precio aproximado: $360",
                "cafe", "15 tazas al día no hacen daño",
                "cuatro", "4",
                "fatum-betula", "Beast",
                "top-3", "1.- ___ 2.- ___ 3.- ___",
                "l", "I",
                "azul", "boolean panelAzul = true;",
                "rojo", "boolean panelAzul = false;",
                "todo", "Nada"
        ));

        model.addAttribute("usuario", usuario);
        model.addAttribute("colorPanel", colorPanel);
        model.addAttribute("categoriaActiva", categoria);

        return "index";
    }
}
