package co.edu.cue;

import com.sun.source.tree.IfTree;

import javax.swing.*;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Prestamo> listadePrestamos = new ArrayList<>();
        List<Objeto> listadeObjetos = new ArrayList<>();
        List<Detalle> detalleList = new ArrayList<>();
        Objeto objeto1 = new Objeto(1111, "Televisor", true, 30000);
        Objeto objeto2 = new Objeto(2222, "Lavadora", true, 50000);
        Objeto objeto3 = new Objeto(3333, "Pc", true, 45000);
        listadeObjetos.add(objeto1);
        listadeObjetos.add(objeto2);
        listadeObjetos.add(objeto3);

        List<Empleado> listadempleados = new ArrayList<>();
        Empleado empleado1 = new Empleado("1212", "Fernando", "Fercho@gmail.com", 3);
        Empleado empleado2 = new Empleado("1313", "Mariana", "Marian@gmail.com", 2);
        Empleado empleado3 = new Empleado("1414", "Lisardo", "Lisardo@gmail.com", 10);
        listadempleados.add(empleado1);
        listadempleados.add(empleado2);
        listadempleados.add(empleado3);

        List<Cliente> listadeclientes = new ArrayList<>();
        //  int opcion = Integer.parseInt(JOptionPane.showInputDialog("Presione "+"\n"+"1"));
/*        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que objeto desea prestar"+"\n"+"1: Televisor"+"\n"+"2: Lavadora"+
                "\n"+"3: Pc"));*/
        int opcion;
        int opcionProductos;
        int opcionObjeto;
        int opcionPrestamo;
        int empleadoAtendido;
        int clientePrestamo;
        String opciones = "";
        do {
            opcion = JOptionPane.showOptionDialog(
                    null, "Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                    new Object[]{"Crear empleados", "Crear clientes", "Administrar productos", "Administrar prestamos", "Salir"}, "null");
            switch (opcion) {
                case 0:
                    if (listadempleados.size() < 3) {
                        String code = JOptionPane.showInputDialog("Ingresa tu codigo");
                        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
                        String correo = JOptionPane.showInputDialog("Ingresa tu nombre");
                        int añosant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de años"));

                        Empleado empleado = new Empleado(code, nombre, correo, añosant);
                        listadempleados.add(empleado);
                    }
                    break;
                case 1:
                    if (listadeclientes.size() < 2) {
                        String nombre = JOptionPane.showInputDialog("Ingresa el nombre");
                        String gender = JOptionPane.showInputDialog("Ingresa F si eres Mujer, M si eres hombre");
                        String Typedocument = JOptionPane.showInputDialog("Ingresa PP si es Pasaporte o CC si es cedula");
                        String Document = JOptionPane.showInputDialog("Ingresa tu numero de documento");
                        String city = JOptionPane.showInputDialog("Ingresa el nombre de tu ciudad");

                        Cliente cliente = new Cliente(Document, Typedocument, nombre, gender, city);
                        listadeclientes.add(cliente);
                    } else {
                        JOptionPane.showMessageDialog(null, "lo siento no podemos aceptar mas clientes");
                    }
                    break;
                case 2:
                    do {
                        opcionProductos = JOptionPane.showOptionDialog(
                                null, "Ingrese lo que quiere hacer: ", "Opciones de productos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                new Object[]{"Consultar producto por codigo", "Consultar prestamos por codigo", "Consultar cantidad total de unidades prestadas", "Consultar unidades prestadas","Remplazar objeto", "Salir"}, "null");
                        switch (opcionProductos) {
                            case 0:
                                if (listadeObjetos.size() < 3) {
                                    String nombre = JOptionPane.showInputDialog("Ingresa el nombre del objeto");
                                    String codigo = JOptionPane.showInputDialog("Ingresa el codigo del objeto");
                                    String estado = JOptionPane.showInputDialog("Ingresa el estado del objeto");
                                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio que va tener el objeto"));
                                    Objeto objeto = new Objeto();
                                    listadeObjetos.add(objeto);
                                }
                                break;
                            case 1:
                                Double code = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu codigo"));
                                int contador = 0;
                                int si =0;
                                for (Objeto objeto : listadeObjetos) {
                                    if (objeto.getCodigo() == code) {
                                        JOptionPane.showMessageDialog(null,"El objeto consultado es:" +
                                                "\n" + "Nombre:" + objeto.getNombre() + "\n" + "Precio:" + objeto.getPrecio() + "\n" +
                                                "Estado:" + objeto.getEstado());
                                        si=1;
                                        break;
                                    }
                                    if(si==0){
                                        JOptionPane.showMessageDialog(null, "No existe ese codigo");
                                    }
                                }
                                break;
                            case 2:
                                String objetoAconsultar = JOptionPane.showInputDialog("Ingresa el nombre del objeto");
                                int cantidad = 0;
                                Prestamo prestamo = new Prestamo();
                                if (listadePrestamos.size() != 0) {
                                    for (Prestamo prestamoPrin : listadePrestamos) {
                                        //System.out.println(listadePrestamos.get(j).getDetalle()[1].getObjeto().getNombre());
                                        List<Detalle> detalles = prestamo.getDetalles();
                                        for (int i = 0; i < 2; i++) {
                                            if (objetoAconsultar.equals(detalles.get(i).getObjeto().getNombre())) {
                                                cantidad++;
                                            }
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null,"El objeto esta incluido " + cantidad + " veces en los prestamos");
                                }else{
                                    JOptionPane.showMessageDialog(null,"No hay prestamos");
                                }
                                break;
                            case 3:

                                for (int i = 0; i < listadeObjetos.size(); i++) {
                                    opciones += "Nombre: " + listadeObjetos.get(i).getNombre() + " Precio: " + listadeObjetos.get(i).getPrecio() + " Codigo: " +
                                            listadeObjetos.get(i).getCodigo() + " Estado: " + listadeObjetos.get(i).getEstado() + "\n";
                                }
                                opcionObjeto = JOptionPane.showOptionDialog(
                                        null, opciones + "Que producto desea cambiar: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                        new Object[]{1, 2, 3, "Salir"}, "null");
                                switch (opcionObjeto) {
                                    case 0:
                                        reemplazar(0, listadeObjetos);
                                        break;
                                    case 1:
                                        reemplazar(1, listadeObjetos);
                                        break;
                                    case 2:
                                        reemplazar(2, listadeObjetos);
                                        break;
                                }
                                break;
                            case 4:
                                //Prestamo prestamo = new Prestamo()
                                int canti = 0;
                                if (listadePrestamos.size() != 0) {
                                    for (Prestamo prestam : listadePrestamos) {
                                        //System.out.println(listadePrestamos.get(j).getDetalle()[1].getObjeto().getNombre());
                                        List<Detalle> detalles = prestam.getDetalles();
                                        for (int i = 0; i < detalles.size(); i++) {
                                            System.out.println("Hay " + canti + " prestadas");
                                        }
                                    }
                                }
                                break;
                        }
                        break;
                    } while (opcionProductos != 4);
                case 3:
                    Empleado empleadoAt = new Empleado();
                    Cliente clienteAt = new Cliente();
                    String opcionesEC = "";
                    do {
                        opcionPrestamo = JOptionPane.showOptionDialog(
                                null, "Ingrese lo que quiere hacer: ", "Opciones de prestamo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                new Object[]{"Crear un prestamo", "Consultar prestamo", "Salir"}, "null");
                        switch (opcionPrestamo) {
                            case 0:
                                //Empleado empleado = new Empleado();
                                //List<Empleado> empleados = prestam.getDetalles();
                                for (int i = 0; i < listadempleados.size(); i++) {
                                    opcionesEC += "Nombre: " + listadempleados.get(i).getNombre() + " Code: " + listadempleados.get(i).getCode() + "\n";
                                }
                                empleadoAtendido = JOptionPane.showOptionDialog(
                                        null, opcionesEC + "Que empleado te atendio: ", "Opciones de empleado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                        new Object[]{1, 2, 3, "Salir"}, "null");
                                for (Empleado empleado : listadempleados) {
                                    if (empleado.getCode().equals(listadempleados.get(empleadoAtendido).getCode())) {
                                        empleadoAt = empleado;
                                    }
                                }
                                opcionesEC = "";
                                for (int i = 0; i < listadeclientes.size(); i++) {
                                    opcionesEC += "Documento: " + listadeclientes.get(i).getDocument() + " Nombre : " + listadeclientes.get(i).getName() + "\n";
                                }
                                clientePrestamo = JOptionPane.showOptionDialog(
                                        null, opcionesEC + "Que cliente va a hacer el prestamo: ", "Opciones de empleado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                        new Object[]{1, 2, 3, "Salir"}, "null");
                                for (Cliente cliente : listadeclientes) {
                                    if (cliente.getDocument().equals(listadeclientes.get(clientePrestamo).getDocument())) {
                                        clienteAt = cliente;
                                    }
                                }
                                crearprestamo( detalleList, listadePrestamos, listadeObjetos, clienteAt, empleadoAt);
                                break;
                        }
                        break;
                    } while (opcionPrestamo != 4);
            }
        } while (opcion != 4);
    }

    static void reemplazar(int replaceObjec, List<Objeto> listadeObjetos) {
        int estadoUser;
        boolean estado = true;
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del objeto");
        double codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el codigo del objeto"));
        estadoUser = JOptionPane.showOptionDialog(
                null, "El producto esta disponible: ", "Disponibilidad", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                new Object[]{"Disponible", "No disponible", "Salir"}, "null");
        switch (estadoUser) {
            case 1:
                estado = true;
            case 2:
                estado = false;
        }
        JOptionPane.showMessageDialog(null, estado);
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio que va tener el objeto"));
        listadeObjetos.get(replaceObjec).setCodigo(codigo);
        listadeObjetos.get(replaceObjec).setNombre(nombre);
        listadeObjetos.get(replaceObjec).setPrecio(precio);
        listadeObjetos.get(replaceObjec).setEstado(estado);
    }

    static void crearprestamo(List<Detalle> detalleList, List<Prestamo> listadePrestamos, List<Objeto> listdeObjeto, Cliente cliente, Empleado empleado) {
        String opciones ="";
        for (int i = 0; i < listdeObjeto.size(); i++) {
            opciones += "Nombre: " + listdeObjeto.get(i).getNombre() + " Precio: " + listdeObjeto.get(i).getPrecio() + " Codigo: " +
                    listdeObjeto.get(i).getCodigo() + " Estado: " + listdeObjeto.get(i).getEstado() + "\n";
        }
        boolean yes = true;
        int count = 0;
        int opcion;
        int producPrest;
        double precio = 0;
        Empleado atendioEmpleado = new Empleado();
        do {
            opcion = JOptionPane.showOptionDialog(
                    null,    "Cuantos productos desea prestar: ", "Productos prestamos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{1, 2, "Salir"}, "null");
            switch (opcion) {
                case 0:
                    do {
                        producPrest = JOptionPane.showOptionDialog(
                                null, opciones + "\n" + "Que producto desea prestar: ", "Productos prestamos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                new Object[]{1, 2, 3, "Salir"}, "null");
                        int diasolicitao = Integer.parseInt(JOptionPane.showInputDialog("cuantos dias desea solicitar el producto"));
                        int Unidadesprestada = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades desea prestar"));
                        Detalle detalle = new Detalle(listdeObjeto.get(producPrest), Unidadesprestada, diasolicitao, listdeObjeto.get(producPrest).getUnidadesDisp());
                        detalleList.add(detalle);
                        precio = listdeObjeto.get(producPrest).getPrecio();
                        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del prestamo");
                        Prestamo prestamo = new Prestamo(codigo, empleado, cliente, precio, detalleList);
                        listadePrestamos.add(prestamo);
                        System.out.println(prestamo.getDetalles().get(0).getObjeto().getNombre());
                        break;
                    } while (producPrest != 4);
                    break;
                case 1:
                    for (int i = 0; i < 2; i++) {
                        producPrest = JOptionPane.showOptionDialog(
                                null, opciones + "\n" + "Seleccione el producto: ", "Productos prestamos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                new Object[]{1, 2, 3, "Salir"}, "null");
                        int diasolicitao = Integer.parseInt(JOptionPane.showInputDialog("cuantos dias desea solicitar el producto"));
                        int Unidadesprestada = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades desea prestar"));
                        Detalle detalle = new Detalle(listdeObjeto.get(producPrest), Unidadesprestada, diasolicitao, listdeObjeto.get(producPrest).getUnidadesDisp());
                        detalleList.add(detalle);
                        precio = +listdeObjeto.get(producPrest).getPrecio();
                        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del prestamo");
                        Prestamo prestamo = new Prestamo(codigo, empleado, cliente, precio, detalleList);
                        listadePrestamos.add(prestamo);
                    }
                    break;
            }
            break;
        } while (opcion != 3);

    }
    //


}