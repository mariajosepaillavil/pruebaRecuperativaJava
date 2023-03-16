package com.generation.pruebarecuperativajavamariajosepaillavil;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.pruebarecuperativajavamariajosepaillavil.models.Producto;
import com.generation.pruebarecuperativajavamariajosepaillavil.models.TipoProducto;

@SpringBootApplication
public class PruebarecuperativajavamariajosepaillavilApplication {

	/*STEPS: PREVIOS
1.CREAR CARPETAS CONTROLLER, MODELS, REPOSITORIES Y SERVICES
2.EN LA CARPETA MODELS CREAR ARCHIVO.JAVA QUE CONTENGA LA "CLASE PADRE"
3.EN CARPETA MODELS, CREAR ARCHIVOS.JAVA QUE CONTENGAN "CLASE HIJA", QUE HEREDARÁ ATRIBUTOS DESDE "CLASE PADRE"
4.AVANZAR CON DESAFÍOS DE LA PRUEBA, BAJO EL APARTADO  "VOID MAIN"

********************* Caso Práctico *********************

José es el dueño de un minimarket de barrio, lleva más de 15 años administrando el
funcionamiento completo de su negocio, siempre lo ha hecho de manera análoga, lo cual en un
inicio no presentaba problemas, pero con el pasar de los años esto ha generado errores
humanos, pérdidas de registros, documentos estropeados por la antigüedad y una nula
posibilidad de poder estudiar el real crecimiento de su negocio año tras año.
José te contrata para generar un software para su negocio.
Además debes generar 3 funciones distintas que te ayudarán a los distintos procesos del
minimarket

Puntos a considerar:
● El minimarket cuenta con tipos de productos y productos entre otros objetos
● Se debe crear una función que permita a don Jose obtener las ganancias sobre una
venta (ocupar hashmap)
● Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
productos y que luego los muestre.
● Se debe crear una función que dado un diccionario de productos con sus respectivos
precios se obtenga, la ganancia total, el producto más caro y el producto más barato.

*************************************************************
IMPORTANTE:

STEPS: PRUEBA 
1.CREAR FUNCIÓN QUE PERMITA QUE JOSÉ OBTENGA LAS GANANCIAS SOBRE UNA VENTA // MEDIANTE HASHMAP
2.CREAR FUNCIÓN QUE PERMITA GUARDAR UN ARREGLO DE UNA CIERTA CANTIDAD DE PRODUCTOS INGRESADOS POR EL USUARIO // NEW ARRAYLIST MEDIANTE SCANNER
3.IMPRIMIR EN PANTALLA LOS VALORES GUARDADOS EN EL ARREGLO CREADO EN EL PUNTO ANTERIOR // MEDIANTE SYSTEM.OUT.PRINT(); --> EQUIVALENTE A CONSOLE.LOG () DE JAVASCRIPT
4.CREAR UNA FUNCIÓN QUE PERMITA CALCULAR E IMPRIMIR  lA GANANCIA TOTAL // MEDIANTE UNA FUNCIÓN QUE CONTENGA CONDICIONALES IF(), LA CUAL PERMITIRÁ IR REEMPLAZANDO SEGÚN EL PARÁMETRO DADO.
5.CREAR UNA FUNCIÓN QUE PERMITA CALCULAR E IMPRIMIR  EL PRODUCTO MÁS CARO Y EL PRODUCTO MÁS BARATO // 


PD: QUE LA FUERZA NOS ACOMPAÑE!! D:

*/

	//public static void main (String[] args) {


//1.- Se debe crear una función que permita al usuario ingresar la cantidad de productos por venta
    
	public static Double promedioPrecios(ArrayList<Double>listaPrecios){
		Double suma = 0.0;
		//recorrimos el array que contiene las notas
        for(int i = 0; i< listaPrecios.size();i++){
			suma+=listaPrecios.get(i);
			
			

		}
		//retorno el promedio 
		return suma/listaPrecios.size();

		
	}

	//2.- Se debe crear una función que permita guardar un arreglo de una cierta cantidad de alumnos por curso y que luego los muestre.

	public static void ventas(){
		//iniciamos el array donde guardaremos los objetos de tipo Producto
		ArrayList<TipoProducto> ingresoVenta = new ArrayList<TipoProducto>();
		Scanner teclado = new Scanner(System.in);
		// pedimos al usuario ingresar cuantos productos tiene cada venta
		System.out.print("Cuantos productos tiene la venta: ");
		int cantidadProductos= teclado.nextInt();
		// recorrimos en total las veces por las que sea el total de productos
		for(int i = 1; i<=cantidadProductos; i++){
			TipoProducto venta = new TipoProducto();
			teclado.nextLine();
			// ocupo do para que por lo menos ingrese 1 producto por venta y para que se repita hasta que i sea mayor a la cantidad de productos que ingrese el usuario.
			do {
				System.out.println("Favor ingrese producto n°"+i);
				//System.out.print("Ingrese número de venta: ");
		        //venta.setNumeroVenta(teclado.nextInt());
				System.out.print("Favor ingrese nombre del producto: ");
				venta.setNombreProducto(teclado.nextLine());
				System.out.print("Favor ingrese categoría del producto: ");
				venta.setCategoriaProducto(teclado.nextLine());
				System.out.print("Favor ingrese formato de venta: ");
				venta.setFormatoVenta(teclado.nextLine());	
				System.out.print("Favor ingrese precio del producto: ");
				venta.setPrecioProducto(teclado.nextDouble());	
					
			} while (i>cantidadProductos);
			// agregamos los productos al array de tipo venta
			ingresoVenta.add(venta);
		}
		// mostramos el detalle de la venta al usuario
		System.out.print("El detalle de la venta ingresada es el siguiente: " + ingresoVenta);

	}
     // 3.- Se debe crear una función que dado un arreglo de productos obtenga el producto más caro y el producto más barato
	 // para mi la mejor nota siempre sera la mayor o mas alta, la peor la mas baja o menor por eso las variables
	public static void evaluar(ArrayList<Double>precios){
		Double mayor = 0.0;
		Double menor = 1000000.0;
		Double suma = 0.0;
		Double promedio = 0.0;
	
        // recorremos el arreglo en este caso de tipo Double
		for (int i = 0; i < precios.size(); i++) {
			//sumamos las notas 
			suma = suma + precios.get(i); 
			
			System.out.println("Las ganancias asociadas a la venta del producto N°" + (i+1) + " corresponden a: " + suma);

			// ocupo dos if, y por que no un if else, por que aca necesito que si o si se cumplan las dos condiciones, y no que si no se cumpla la primera pase a al else recien
			// obligo al programa que pase si o si por los dos if
			if(precios.get(i)>mayor){
				mayor = precios.get(i);
			}
			if(precios.get(i)<menor){
				menor = precios.get(i);

		

			}
	
		}
		//sacamos el promedio y lo guardamos en la variable promedio 
		promedio = suma/precios.size();
        // mostramos el resultado
	
	
		
		System.out.println("El producto mas caro es: " +mayor+"\nEl producto más barato es: "+menor+ "\nEl promedio de precios es: "+ promedioPrecios(precios));
	}


	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
        // parto la opcion en 1 para obligar al programa a entrar en el while principal
		// ocupe un menu para que fuera mas interactivo para el usuario
		int opcion=1;
		while(opcion!=0){
			do {
				System.out.println("Bienvenidx");
				System.out.println("Ingresa 1 si conocer el detalle de los productos de una venta");
				System.out.println("Ingresa 2 si quieres registrar una venta");
				System.out.println("Ingresa 3 si quieres registrar ventas, conocer el total de ganancias, y evaluar los productos identificando aquel con el precio más alto y más bajo ");
				System.out.println("Ingresa 0 para salir del menú");
				System.out.print("Ingresa tu opcion: ");
				opcion=teclado.nextInt();

			} while (opcion < 0 || opcion > 3);
			if(opcion==1){
				// inicializamos un hashmap para guardar un alumno con diferentes notas guardadas en un array 
				HashMap <String,ArrayList<Double>> precios = new HashMap<>();
				int cantidadProductos;
				//int precioPorUnidadDeVenta;
				
				System.out.print("Indique cantidad de productos a ingresar : ");
				cantidadProductos = teclado.nextInt(); // pide cantidad de productos.
				//System.out.print("Indique cantidad de unidades de venta a ingresar : ");
				//precioPorUnidadDeVenta= teclado.nextInt(); // pide precios.
	
                // guardar las notas + el nombre del producto en un hashmap traidas desde el objeto producto.
				for (int i = 1; i <= cantidadProductos; i++) {
			
					
					// array donde guardaremos las notas
					ArrayList<Double> preciosProductos = new ArrayList<Double>(); 
					// inicializamos el objeto producto.
					Producto producto = new Producto();
					teclado.nextLine();
					
					System.out.print("Ingrese nombre del producto: ");
					// indicamos el nombre del producto y lo seteamos en el objeto
					producto.setNombreProducto(teclado.nextLine());	
					//indicamos el precio del producto y lo seteamos en el objeto
					
					System.out.print("Ingrese precio del producto "+ producto.getNombreProducto()+" :");
					//teclado.nextLine(); // Salto de línea	
					producto.setPrecioProducto(teclado.nextDouble());

					// finalmente guardamos las notas en el array 
					preciosProductos.add(producto.getPrecioProducto());

					
					//for (int x = 1; x <= precioPorUnidadDeVenta; x++) {
					
						
						
					//}
						//obtenemos el nombre del objeto producto + el array de precios y lo guardamos en el hashmap	
					precios.put(producto.getNombreProducto(), preciosProductos);	
					
		        }
				for(String i : precios.keySet()){
					
					
					//llamamos a la funcion suma producto y le pasamos el valor de la key, que en este caso son de tipo array
					Double gananciaVentaProducto =  promedioPrecios(precios.get(i));
		            System.out.println("Las ganancias de la venta: "+ i + " es de: " + gananciaVentaProducto);
					

					teclado.nextLine(); // Salto de línea
				}
			}
			else if(opcion ==2){
				// llamamos a la funcion ventas, que en este caso todo lo hace en la funcion 
				ventas();

			}
			else if(opcion == 3){
				ArrayList<Double> precios = new ArrayList<Double>(); // creamos el array donde se guardaran las notas
				System.out.print("Cuantos productos vamos a ingresar?: ");
				int cantidadProductos = teclado.nextInt();
				for(int i=0; i<cantidadProductos;i++){ 
					Producto producto = new Producto(); // creamos un objeto de tipo producto nuevo.
					do {
						System.out.println("Ingrese precios n°"+(i+1));
						//System.out.print("Ingrese precios: ");
						producto.setPrecioProducto(teclado.nextDouble()); // seteamos o guardamos el precio.
						
					} while (i>cantidadProductos);
					precios.add(producto.getPrecioProducto()); // pasamos el precio al array. 
				}

				evaluar(precios); // llamamos a la funcion en donde le pasaremos nuestro array .
			}

		}}}

			



		
		
		
	    