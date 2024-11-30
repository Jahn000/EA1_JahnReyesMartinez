/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EA1JahnReyes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.EA1JahnReyes.model.Productos;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author Usuario
 */
@Controller
public class ProductosController {
  @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("productos", new Productos());
        return "form"; 
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Productos productos, Model model) {
        model.addAttribute("productos", productos);
        return "sucess"; 
    }
}
