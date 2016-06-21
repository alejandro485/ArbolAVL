package ArbolAVL;

public class Nodo {
	public int info;
	public int bal;
	public Nodo izq;
	public Nodo der;
	public Nodo(int n) {
		info = n;
		bal = 0;
		izq =null;
		der = null;
	}
}