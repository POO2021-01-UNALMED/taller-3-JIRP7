package taller3.televisores;

public class TV {
  private Marca marca;
  private int canal = 1;
  private int precio = 500;
  private boolean estado;
  private int volumen = 1;
  private Control control;
  private static int numTV;

  public TV(Marca marca, boolean estado) {
    this.marca = marca;
    this.estado = estado;
    numTV++;
  }
  
  public Marca getMarca() {
	return marca;
	
  }
  
  public void setMarca(Marca marca) {
	this.marca = marca;
	
  }
  
  public int getPrecio() {
	return precio;
	
  }
  
  public void setPrecio(int precio) {
	this.precio = precio;
	
  }
  
  public int getCanal() {
	return canal;
	
  }
  
  public void setCanal(int canal) {
	if(this.estado != false && canal <= 120 && canal >= 1) {
		this.canal = canal;
	}
	
  }
  
  public int getVolumen() {
	return volumen;
	
  }
  
  public void setVolumen(int volumen) {
	if(this.estado != false && volumen <= 7 && volumen >= 1) {
		this.volumen = volumen;
	}
	
  }
  
  public Control getControl() {
	return control;
	
  }
  
  public void setControl(Control control) {
	this.control = control;
	
  }

  public int getNumTV() {
	return numTV;
  }
  
  public void turnOn() {
	this.estado = true;
  
  }

  public void turnOff() {
	this.estado = false;
  }

  public void canalUp() {
	if(this.estado != false && this.canal < 120 && canal >= 1) {
		this.canal++;
	
	}

  } 


  public void canalDown() {
	if(this.estado != false && this.canal <= 120 && this.canal > 1) {
		this.canal--;
	}

  }

  public void volumenUp() {
	if(this.estado != false && this.volumen < 7 && this.volumen >= 1) {
		this.volumen++;

	}	
  }

  public void volumenDown() {
	if(this.estado != false && this.volumen <= 7 && this.volumen > 1) {
		this.volumen--;

	}	
  }
  


}
