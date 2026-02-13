package com.example.perf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorPerfil {

    @GetMapping("/perfil")
    public String perfil( @RequestParam(required = false, defaultValue = "nombre") String categoria, Model model) {

    	//si se mantiene en true se muestra el menú en azul, sino se muestra en rojo.
        boolean panelAzul = true;
        String colorPanel = panelAzul ? "panel-primary" : "panel-danger";

        List<String> categoriasDropdown = Arrays.asList(
                "gran-malo",
                "johnnie-walker",
                "cafe",
                "cuatro",
                "fatum-betula", //Probablemente el que más producción tiene
                "top-3",
                "L",
                "Azul",
                "Rojo",
                "Todo"
        );

        model.addAttribute("colorPanel", colorPanel);
        model.addAttribute("categoriaActiva", categoria);
        model.addAttribute("categoriasDropdown", categoriasDropdown);

        return "index";
    }
}
