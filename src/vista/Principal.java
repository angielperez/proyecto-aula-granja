package vista;

import java.util.Scanner;
import Modelo.*;
import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Principal {

    public static Granja granja;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        granja = new Granja();
        granja.setNombre("San Martin");
        
        Direccion direccion = new Direccion();
        direccion.setPais("Colombia");
        direccion.setCiudad("Valledupar");
        direccion.setNomenclatura("Cra. 4 #4a-25");
        
        Dueño dueño = new Dueño();
        dueño.setNombre("Juan Manuel Santos");
        
        Cuenta cuenta = new Cuenta();
        cuenta.setUsuario("jsantos");
        cuenta.setContraseña("112233*");
        
        dueño.setCuenta(cuenta);
        granja.setDueño(dueño);
        
        Inventario inventario = new Inventario();
        inventario.setTotalHuevos(0);
        granja.setInventario(inventario);
        
        Caja caja = new Caja(0, 0, 0);
        granja.setCaja(caja);
                
        System.out.println("Digite su usuario: ");
        String user = teclado.nextLine();
        System.out.println("Digite su contraseña: ");
        String password = teclado.nextLine();
        
        if (granja.getDueño().getCuenta().getUsuario().equals(user) && granja.getDueño().getCuenta().getContraseña().equals(password)){
            int opcion;
            do{
                System.out.println("***** Menu de Opciones ****");
                System.out.println("**** 1. Registar Accionista ****");
                System.out.println("**** 2. Registar Gallinas ****");
                System.out.println("**** 3. Registar Producción ****");
                System.out.println("**** 4. Listar Accionistas ****");
                System.out.println("**** 5. Listar Gallinas ****");
                System.out.println("**** 6. Listar Produccion ****");
                System.out.println("**** 7. Registrar Venta ****");
                System.out.println("**** 8. Mostrar Inventario ****");
                System.out.println("**** 9. Mostrar Caja ****");
                System.out.println("**** 10. Salir ****");
                System.out.print("**** Presione la opcion que desee: ");
                opcion = teclado.nextInt();
                switch(opcion){
                    case 1:
                        registrarAccionista();
                        break;
                    case 2:
                        registrarGallinas();
                        break;
                    case 3:
                        registrarProduccion();
                        break;
                    case 4:
                        listarAccionistas();
                        break;
                    case 5:
                        listarGallinas();
                        break;
                    case 6:
                        listarProduccion();
                        break;
                    case 7:
                        registrarVenta();
                        break;
                    case 8:
                        mostrarInventario();
                        break;
                    case 9:
                        mostrarCaja();
                        break;
                    case 10:
                        break;
                }
            } while ((opcion>0) && (opcion<10));
        }
        else {
            System.out.println("Credenciales inválidas.");
        }
    }
    
    public static void registrarAccionista() {
        char opt = 'S';
        while (opt == 'S'){
            Scanner teclado = new Scanner(System.in);
            Accionista accionista = new Accionista();
            System.out.print("Digite el nombre del Accionista: ");
            accionista.setNombre(teclado.nextLine());
            System.out.print("Digite el id del Accionista: ");
            accionista.setId(teclado.nextLine());
            System.out.println("¿Cuál es la inversión del accionista?");
            accionista.setInversion(teclado.nextDouble());    
            granja.getAccionistas().add(accionista);
            System.out.println("¿Desea registrar otro Accionista?");
            opt = teclado.next().charAt(0);
            opt = Character.toUpperCase(opt);
        }
    }
    
    public static void registrarGallinas() {
        char opt = 'S';
        while (opt == 'S'){
            Scanner teclado = new Scanner(System.in);
            Gallina gallina = new Gallina();
            System.out.print("Digite el código de la gallina: ");
            gallina.setCodigo(teclado.nextLine());
            System.out.print("Digite el peso en kg de la gallina: ");
            gallina.setPeso(teclado.nextDouble());
            granja.getGallinas().add(gallina);
            System.out.println("¿Desea registrar otra gallina?");
            opt = teclado.next().charAt(0);
            opt = Character.toUpperCase(opt);
        }
    }
    
    public static void listarAccionistas(){
        for (int i = 0; i < granja.getAccionistas().size(); i++) {
            Accionista accionista = granja.getAccionistas().get(i);
            System.out.println("Nombre Accionista= "+ accionista.getNombre());
            System.out.println("Id Accionista= "+ accionista.getId());
            System.out.println("Inversion del accionista= "+ accionista.getInversion());
            System.out.println("----------------------------------");
        }
    }
    
    public static void listarGallinas(){
        for (int i = 0; i < granja.getGallinas().size(); i++) {
            Gallina gallina = granja.getGallinas().get(i);
            System.out.println("Código de la gallina= "+ gallina.getCodigo());
            System.out.println("Peso en kg de la gallina= "+ gallina.getPeso());
            System.out.println("----------------------------------");
        }
    }
    
    public static void registrarProduccion(){
        Scanner teclado = new Scanner(System.in);
        String code;
        System.out.println("Digite el código de la gallina= ");
        code = teclado.nextLine();
        for (int i = 0; i < granja.getGallinas().size(); i++){
            Gallina gallina = granja.getGallinas().get(i);
            if (code.equals(gallina.getCodigo())){
                System.out.println("Digite la cantidad de huevos=");
                Produccion produccion = new Produccion ();
                produccion.setCantidadHuevos(teclado.nextInt());
                produccion.setFecha(LocalDate.now());
                gallina.getProducciones().add(produccion);
                System.out.println("Se agregó la producción exitosamente.");
                granja.getInventario().setTotalHuevos(granja.getInventario().getTotalHuevos()+produccion.getCantidadHuevos());
            }
            else{
                System.out.println("La gallina no existe.");
            }
        }
    }
    
    public static void listarProduccion(){
        for (int i = 0; i < granja.getGallinas().size(); i++) {
            Gallina gallina = granja.getGallinas().get(i);
                System.out.println("Gallina #"+ gallina.getCodigo());
                for (int j = 0; j < gallina.getProducciones().size(); j++) {
                    Produccion produccion = gallina.getProducciones().get(j);
                    System.out.println("Cantidad de huevos:" + produccion.getCantidadHuevos());
                    System.out.println("Fecha de produccion:" + produccion.getFecha());
                }
            System.out.println("-------------------------------------");    
        }
    }
    
    public static void registrarVenta (){
        Scanner teclado = new Scanner(System.in);
        Venta venta = new Venta();
        System.out.println("Huevos vendidos:");
        venta.setHuevosVendidos(teclado.nextInt());
        System.out.println("Valor del huevo:");
        venta.setValorHuevos(teclado.nextDouble());
        venta.setFecha(LocalDate.now());
        int cantidadHuevosActuales = granja.getInventario().getTotalHuevos();
        granja.getInventario().setTotalHuevos(cantidadHuevosActuales-venta.getHuevosVendidos());
        double valorActualCaja = granja.getCaja().getTotalCaja();
        double valorNuevo = venta.getValorHuevos()*venta.getHuevosVendidos();
        granja.getCaja().setTotalCaja(valorActualCaja+valorNuevo);
    }
    
    
    public static void mostrarInventario (){
        System.out.println("Los huevos actuales de su granja son:" + granja.getInventario().getTotalHuevos());
    }
    
    public static void mostrarCaja (){
        System.out.println("El valor actual de la caja es: $" + granja.getCaja().getTotalCaja());
    }
}