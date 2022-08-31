package com.example.demo.intities;

import io.swagger.annotations.ApiModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ApiModel("Caracteristicas del auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuto;
    private String numeroPuertas;
    private String serieMotor;
    private String color;
    private String marca;
    private String modelo;

    public Auto(String numeroPuertas, String serieMotor, String color, String marca,
                String modelo) {
        this.numeroPuertas = numeroPuertas;
        this.serieMotor = serieMotor;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(Long idAuto) {
        this.idAuto = idAuto;
    }

    public Auto() {
    }

    public Long getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(Long idAuto) {
        this.idAuto = idAuto;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getSerieMotor() {
        return serieMotor;
    }

    public void setSerieMotor(String serieMotor) {
        this.serieMotor = serieMotor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "idAuto=" + idAuto +
                ", numeroPuertas='" + numeroPuertas + '\'' +
                ", serieMotor='" + serieMotor + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
