package taller3.televisores;

public class Control {
    TV tv;
    
    public void enlazar(TV tv) {
        this.tv = tv;
        tv.control = this;
    }
    
    public TV getTv() {
        return tv;
    }
    
    public void setTv(TV tv) {
        this.tv = tv;
    }
    
    public void turnOn() {
    	this.tv.turnOn();
    }
    
    public void turnOff() {
    	this.tv.turnOff();
    }
    
    public void canalUp() {
    	this.tv.canalUp();
    }
    
    public void canalDown() {
    	this.tv.canalDown();
    }
    
    public void volumenUp() {
    	this.tv.volumenUp();
    }
    
    public void volumenDown() {
    	this.tv.volumenDown();
    }
    
    public void setCanal(int canal) {
        if ((canal >= 1 && canal <=120) && this.tv.getEstado() == true) {
            this.tv.setCanal(canal);
        }
    }
}