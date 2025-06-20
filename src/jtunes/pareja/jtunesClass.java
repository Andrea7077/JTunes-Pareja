/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jtunes.pareja;

import javax.swing.ImageIcon;

/**
 *
 * @author andre
 */
public class jtunesClass {

    private songClass[] canciones;

    public jtunesClass(int tamano) {
        this.canciones = new songClass[5];
    }

    public boolean addSong(int codigo, String nombre, double precio, ImageIcon ImagenDisco) {

        for (songClass cancion : canciones) {
            if (cancion != null && cancion.getCodigo() == codigo) {
                return false;
            }
        }

        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] == null) {
                canciones[i] = new songClass(codigo, nombre, precio, ImagenDisco);
            }

        }
        return false;
    }

    public songClass searchSong(int codigo) {
        for (songClass cancion : canciones) {
            if (cancion != null && cancion.getCodigo() == codigo) {

                return cancion;
            }

        }
        return null;
    }

    public void rateSong(int codigo, int stars) {
        songClass cancion = searchSong(codigo);
            if (cancion != null) {
                cancion.addStars(stars);
            }
        }
    }

