package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String goHome(Model model) {
        model.addAttribute("titulo", "Bienvenido, página de inicio");
        return "hola";
    }
    @GetMapping("/alumno_menu")
    String getMenu(Model model) {
        model.addAttribute("something", "esto viene del controlador");
        return "alumno_menu";
    }
    @GetMapping("/asignacion_practicas")
    String getAsignacion(Model model) {
        model.addAttribute("something", "esto viene del controlador");
        return "asignacion_practicas";
    }
    @GetMapping("/certificado_practicas")
    String getCertificado(Model model) {
        model.addAttribute("something", "esto viene del controlador");
        return "certificado_practicas";
    }
    @GetMapping("/eleccion_practica")
    String getEleccion(Model model) {
        model.addAttribute("something", "esto viene del controlador");
        return "eleccion_practica";
    }
    /*Aquí*/
    @GetMapping("/iniciosesion")
    String getInicioSesion(Model model) {
        model.addAttribute("something", "esto viene del controlador");
        return "iniciosesion";
    }
    
    @GetMapping("/menuresponsable")
    String getMenuResponsable(Model model) {
        model.addAttribute("something", "esto viene del controlador");
        return "menuresponsable";
    }
    
    @GetMapping("/informedepracticas")
    String getMenuInformeDePracticas(Model model) {
        model.addAttribute("something", "esto viene del controlador");
        return "informedepracticas";
    }
    
    @GetMapping("/informepracticas2")
    String getMenuInformeDePracticas2(Model model) {
        model.addAttribute("something", "esto viene del controlador");
        return "informepracticas2";
    }
    @GetMapping("/informeasignacion")
    String getMenuInformeAsignacion(Model model) {
        model.addAttribute("something", "esto viene del controlador");
        return "informeasignacion";
    }
    @GetMapping("/solicitudespracticas")
    String getMenuSolicitudesPracticas(Model model) {
        model.addAttribute("something", "esto viene del controlador");
        return "solicitudespracticas";
    }
}