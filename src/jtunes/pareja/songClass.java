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
public class songClass {

    private int codigo;
    private String nombre;
    private double precio;
    private int sumaEstrella;
    private int totalReviews;
    private ImageIcon ImagenDisco;

    public songClass(int codigo, String nombre, double precio, ImageIcon ImagenDisco) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.ImagenDisco = ImagenDisco;
        this.sumaEstrella = 0;
        this.totalReviews = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public ImageIcon getImagenDisco() {
        return ImagenDisco;
    }

    public void addStar(int stars) {
        if (stars >= 0 && stars <= 5) {

            this.sumaEstrella += stars;
            this.totalReviews++;
        }
    }

    public double songRating() {
        if (totalReviews == 0) {
            return 0.0;
        }
        return (double) sumaEstrella/totalReviews;
    }

    

}
