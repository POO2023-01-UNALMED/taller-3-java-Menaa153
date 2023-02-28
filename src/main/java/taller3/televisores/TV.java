package taller3.televisores;

public class TV {
    private static int NumTV = 0;

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        TV.NumTV++;
    }

    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        if ((canal >= 1 && canal <= 120) && this.estado==true) {
            this.canal = canal;
        }
    }

    public int getPrecio() {
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
        if ((this.estado == true) && (this.canal < 120)) {
            this.canal++;
        }
    }
    public void canalDown() {
        if ((this.estado == true) && (this.canal > 1)) {
            this.canal--;
        }
    }

    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
    	this.volumen = volumen;
    }

    public void volumenUp() {
        if ((this.estado == true) && (this.volumen < 7)) {
            this.volumen++;
        }
    }
    public void volumenDown() {
        if ((this.estado == true) && (this.volumen > 1)) {
            volumen--;
        }
    }

    public Control getControl() {
        return control;
    }
    public void setControl(Control control) {
        this.control = control;
    }

    public static void setNumTV(int NumTV) {
        TV.NumTV = NumTV;
    }
    public static int getNumTV() {
        return NumTV;
    }
}