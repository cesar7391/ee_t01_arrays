package ee_t01_arrays;
import java.io.*;
// Se declara la clase y definimos la variable String para leer y los arreglos
public class Num {
	String lect;
	String Lista[];
	int Num[];
	
	// Metodo para leer el archivo
	public void lectura(String nombre){
		//Try para atrapar posibles errores
		try{
		FileReader fr = new FileReader(nombre);
		BufferedReader br = new BufferedReader(fr);
		lect = br.readLine();
		while(lect!=null){
			System.out.println(lect);
			Lista = lect.split("");
			lect = br.readLine();
			
		}
		Num = new int[Lista.length];
	}catch(FileNotFoundException f){
		System.out.println(f);
	}catch(IOException i){
		System.out.println(i);
	}
	}
	
	public void reves(){
		for (int i=0; i<Num.length; i++){
			Num[i]=Integer.parseInt(Lista[i]);
			for(int j =0; j<Num.length;j++){
				if (Num[i]>Num[j]){
					int x =Num[i];
					Num[i]=Num[j];
					Num[j]=x;
				}
			}
		}
	}
	
	public void mostrar(){
		for(int i=0; i<Num.length;i++){
			System.out.println(Num[i]);
		}
	}
}
	
				
