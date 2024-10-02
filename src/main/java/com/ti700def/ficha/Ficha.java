/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ti700def.ficha;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author samsu
 */

@Named
@RequestScoped
public class Ficha {
    private String titulo="";
     private String descripcion="";
     private String referencia="";
     private String foto="";

    public Ficha() {
        
        
        this. setTitulo("Investigacion Definicion");
        this.setFoto("resouces/images/foto.jpg");
        this.setReferencia("Equipo editorial, Etecé (30 de septiembre de 2024). Investigación. Enciclopedia Concepto. Recuperado el 2 de octubre de 2024 de https://concepto.de/investigacion/."+"\"Fuente: https://concepto.de/investigacion/#ixzz8nVqTthzG\" ");
        this.setDescripcion("Se entiende por investigación un "
                + "conjunto de actividades humanas destinadas a la obtención de "
                + "nuevos saberes y conocimientos, y/o su aplicación a la resolución"
                + " de problemas concretos o interrogantes\n"  +"Según la naturaleza de su objeto de estudio. Podemos hablar de:\n" +
"Investigación básica, fundamental o pura. Se interesa por conocimientos puramente teóricos, sin molestarse en pensar sus aplicaciones prácticas o cotidianas. Es de tipo formal y persigue el saber por el saber mismo.\n" +
"Investigación aplicada. Todo lo contrario: persigue los saberes abstractos como una vía para solucionar problemas reales, concretos y cotidianos de la humanidad, teniendo por ende mayor compromiso con la realidad inmediata.\n" +
"Investigación clínica o médica. Es aquella que hace de la salud del ser humano su objeto de estudio y se encuentra comprometida con su preservación, restauración o al menos con la comprensión de sus dinámicas.\n" +
"\n" 
        );
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
