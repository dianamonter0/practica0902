/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author diana
 */
public class Video {
    public String Titulo;
    public int duracionSegundos;
    public String Url;

    public Video(String Titulo, int duracionSegundos, String Url) {
        this.Titulo = Titulo;
        this.duracionSegundos = duracionSegundos;
        this.Url = Url;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }
}
