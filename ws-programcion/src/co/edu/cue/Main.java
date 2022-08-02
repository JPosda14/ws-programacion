package co.edu.cue;

import javax.swing.*;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Objeto>listadeObjetos=new ArrayList<>();
        Objeto objeto1=new Objeto("1111","Televisor",5,"disponible",30000);
        Objeto objeto2=new Objeto("2222","Lavadora",3,"disponible",50000);
        Objeto objeto3=new Objeto("3333","Pc",10,"disponible",45000);
        listadeObjetos.add(objeto1);
        listadeObjetos.add(objeto2);
        listadeObjetos.add(objeto3);

        List<Empleado>listadempleados=new ArrayList<>();
        Empleado empleado1=new Empleado("1212","Fernando","Fercho@gmail.com",3);
        Empleado empleado2=new Empleado("1313","Mariana","Marian@gmail.com",2);
        Empleado empleado3=new Empleado("1414","Lisardo","Lisardo@gmail.com",10);
        listadempleados.add(empleado1);
        listadempleados.add(empleado2);
        listadempleados.add(empleado3);

        List<Cliente>listadeclientes=new ArrayList<>();
        //int opcion = Integer.parseInt(JOptionPane.showInputDialog("Presione "+"\n"+"1"));
/*        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que objeto desea prestar"+"\n"+"1: Televisor"+"\n"+"2: Lavadora"+
                "\n"+"3: Pc"));*/
        int opcion;
        int opcionProductos;
        do{
            opcion = JOptionPane.showOptionDialog(
                    null,"Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                    new Object[] { "Crear empleados","Crear clientes", "Administrar productos", "Administrar prestamos","Salir" },"null");
            switch (opcion) {
                case 0:
                    if(listadempleados.size()<3){
                        String code=JOptionPane.showInputDialog("Ingresa tu codigo");
                        String nombre=JOptionPane.showInputDialog("Ingresa tu nombre");
                        String correo=JOptionPane.showInputDialog("Ingresa tu nombre");
                        int añosant =Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de años"));

                        Empleado empleado=new Empleado(code,nombre,correo,añosant);
                    }
                case 1:
                    if(listadeclientes.size()<2){
                        String nombre=JOptionPane.showInputDialog("Ingresa el nombre");
                        String gender=JOptionPane.showInputDialog("Ingresa F si eres Mujer, M si eres hombre");
                        String Typedocument=JOptionPane.showInputDialog("Ingresa PP si es Pasaporte o CC si es cedula");
                        String Document=JOptionPane.showInputDialog("Ingresa tu numero de documento");
                        String city=JOptionPane.showInputDialog("Ingresa el nombre de tu ciudad");

                        Cliente cliente1 = new Cliente(Document,Typedocument,nombre,gender,city);
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"lo siento no podemos aceptar mas clientes");
                    }
                case 2:
                    do {
                        opcionProductos=JOptionPane.showOptionDialog(
                                null,"Ingrese lo que quiere hacer: ", "Opciones de productos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                new Object[] { "Consultar producto por codigo","Consultar prestamos por nombre", "Consultar cantidad total de unidades prestadas", "Remplazar objeto","Salir" },"null");
                        switch (opcionProductos) {
                            case 0:
                                if(listadeObjetos.size()<3){
                                    String nombre=JOptionPane.showInputDialog("Ingresa el nombre del objeto");
                                    String codigo=JOptionPane.showInputDialog("Ingresa el codigo del objeto");
                                    String estado=JOptionPane.showInputDialog("Ingresa el estado del objeto");
                                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio que va tener el objeto"));
                                }
                                break;
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                        }

                    }while (opcionProductos!=4);
                case 4:
                    String code=JOptionPane.showInputDialog("Ingresa tu codigo");
                    int contador =0;
                    for(int i=0;i<listadeObjetos.size();i++){
                        if(code.equals(listadeObjetos.get(i).getCodigo())){
                            System.out.println("El objeto consultado es:"+
                                    "\n"+"Nombre:"+ listadeObjetos.get(i).getNombre()+"\n"+"Precio:"+listadeObjetos.get(i).getPrecio()+"\n"+
                                    "Estado:"+listadeObjetos.get(i).getEstado());
                            break;
                        }else {
                            JOptionPane.showMessageDialog(null, "No existe ese codigo");
                            break;
                        }
                    }
                case 5:
                    String objetoAconsultar = JOptionPane.showInputDialog("Ingresa el nombre del objeto");
                    int cantidad =0;
                    Prestamo prestamo = new Prestamo();
                    for (int i=0; i<3;i++){
                        if(objetoAconsultar.equals(prestamo.getDetalle().getObjeto())){
                            cantidad++;
                        }
                    }
                    System.out.println("El objeto esta incluido "+cantidad+" veces en los prestamos");
                    int OPCION =0;
                    switch (OPCION){
                        case 1:

                    }
            }
        }while(opcion!=4);

    }
}