/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

/**
 *
 * @author diana
 */
public class Youtube {

    public static void main(String[] args) {
        Usuario usuario= new Usuario ("Montero");
        Video video= new Video ("Aprendiendo Java", 2400, "Http//monmon.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
        Usuario usuario2=new Usuario("PERLA");
            Comentario comment1=new Comentario("Asco de página", usuario2);
            System.out.println("El usuario "+ usuario2.getNombre()+ " publicó el comentario "+ comment1.getContenido());
    }
}
