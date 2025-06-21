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

    private static jtunesClass jTunesInstance;
    songClass canciones[];

    private jtunesClass() {
        this.canciones = new songClass[80];

    }

    public static jtunesClass getInstance() {
        if (jTunesInstance == null) {
            jTunesInstance = new jtunesClass();
        }
        return jTunesInstance;
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
                return true;

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
            cancion.addStar(stars);
        }
    }

    public songClass[] getAllSongs() {
        int contador = 0;
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                contador++;
            }
        }

        songClass cancionesDisponibles[] = new songClass[contador];
        int indx = 0;

        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                cancionesDisponibles[indx] = canciones[i];
                indx++;
            }
        }
        return cancionesDisponibles;
    }

}
