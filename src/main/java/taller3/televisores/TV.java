package taller3.televisores;

public class TV {
    private static int NumTV = 0;
    private String marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    public TV(String marca, boolean estado) {
        this.marca = marca;
        this.canal = 1;
        this.precio = 500;
        this.estado = estado;
        this.volumen = 1;
        this.control = null;
        NumTV++;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        if (estado && canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void turnOn() {
        this.estado = true;
    }
    public void turnOff() {
        this.estado = false;
    }

    public void canalUp() {
        if (estado && canal < 120) {
            canal++;
        }
    }
    public void canalDown() {
        if (estado && canal > 1) {
            canal--;
        }
    }

    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        if (estado && volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }

    public void volumenUp() {
        if (estado && volumen < 7) {
            volumen++;
        }
    }
    public void volumenDown() {
        if (estado && volumen > 0) {
            volumen--;
        }
    }

    public Control getControl() {
        return control;
    }
    public void setControl(Control control) {
        this.control = control;
    }

    public static void setNumTV(int a) {
        NumTV = a;
    }
    public static int getNumTV() {
        return NumTV;
    }
}