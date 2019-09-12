package com.byuwur.onlinecongress;

public class HolderPonencia {
    private String ponencianombre;
    private String ponenciaid;
    private String ponenciainst;
    private String ponenciaidioma;
    private String ponenciacategoria;
    private String ponenciadias;
    private String ponenciaimg;

    public HolderPonencia(String nombre, String id, String inst, String idioma, String categoria, String dias, String imgcancha) {
        this.ponencianombre = nombre;
        this.ponenciaid = id;
        this.ponenciainst = inst;
        this.ponenciaidioma = idioma;
        this.ponenciacategoria = categoria;
        this.ponenciadias = dias;
        this.ponenciaimg = imgcancha;
    }

    public String getNombre() {
        return ponencianombre;
    }

    public void setNombre(String nombre) {
        this.ponencianombre = nombre;
    }

    public String getId() {
        return ponenciaid;
    }

    public void setId(String id) {
        this.ponenciaid = id;
    }

    public String getInst() {
        return ponenciainst;
    }

    public void setInst(String inst) {
        this.ponenciainst = inst;
    }

    public String getIdioma() {
        return ponenciaidioma;
    }

    public void setIdioma(String idioma) {
        this.ponenciaidioma = idioma;
    }

    public String getCategoria() {
        return ponenciacategoria;
    }

    public void setCategoria(String categoria) {
        this.ponenciacategoria = categoria;
    }

    public String getDias() {
        return ponenciadias;
    }

    public void setDias(String dias) {
        this.ponenciadias = dias;
    }

    public String getImg() {
        return ponenciaimg;
    }

    public void setImgcancha(String imgcancha) {
        this.ponenciaimg = imgcancha;
    }
}
