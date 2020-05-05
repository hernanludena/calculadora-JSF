package sri.gob.ec.calculadora;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class CalculadoraControlador {
	private int numero1 =0;
	private int numero2 =0;
	private int suma;
	
	public int getSuma() {
		return suma;
	}
	public void setSuma(int suma) {
		this.suma = suma;
	}
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}	
	
	public void sumar()
	{
		setSuma(getNumero1()+getNumero2());
	}

}
