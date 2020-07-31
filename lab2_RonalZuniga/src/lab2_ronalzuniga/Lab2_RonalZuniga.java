package lab2_ronalzuniga;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_RonalZuniga {

    public static void main(String[] args) {

        int op = 0;
        while (op != 8) {

            System.out.println("-----MENU-----");
            System.out.println("1. Registrar Empleado");
            System.out.println("2. Despedir Empleados");
            System.out.println("3. Log In");
            System.out.println("4. Ascender Cajero");
            System.out.println("5. Listar Empleados");
            System.out.println("6. Modificar Empleados");
            System.out.println("7. Random");
            System.out.println("");
            Scanner sc = new Scanner(System.in);
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 3:
                    String user;
                    int pss;
                    System.out.print("Ingrese el nombre de usuario: ");
                    user = sc.next();
                    System.out.print("Ingrese la contraseña: ");
                    pss = sc.nextInt();

                    if ("leobanegas".equals(user) && pss == 99) {
                        int opcion = 0;
                        while (opcion != 8) {
                            System.out.println("-----MENU-----");
                            System.out.println("1. Registrar Empleado");
                            System.out.println("2. Despedir Empleados");
                            System.out.println("3. Log In");
                            System.out.println("4. Ascender Cajero");
                            System.out.println("5. Listar Empleados");
                            System.out.println("6. Modificar Empleados");
                            System.out.println("7. Random");
                            System.out.println("");
                            System.out.print("Seleccione una opcion: ");
                            opcion = sc.nextInt();
                            System.out.println();
                            ArrayList emp = new ArrayList();

                            switch (opcion) {
                                case 1:
                                    String x;
                                    int aux;
                                    float ax;

                                    System.out.print("Ingrese el nombre del empleado: ");
                                    x = sc.next();
                                    emp.add(new Empleados(x));
                                    System.out.println();

                                    System.out.print("Ingrese el apellido del empleado: ");
                                    x = sc.next();
                                    emp.add(new Empleados(x));
                                    System.out.println();

                                    System.out.print("Ingrese el color favorito del empleado: ");
                                    x = sc.next();
                                    emp.add(new Empleados(x));
                                    System.out.println();

                                    System.out.print("Ingrese la edad del empleado: ");
                                    aux = sc.nextInt();
                                    emp.add(new Empleados(aux));
                                    System.out.println();

                                    System.out.print("Ingrese el genero del empleado: ");
                                    x = sc.next();
                                    emp.add(new Empleados(x));
                                    System.out.println();

                                    System.out.print("Ingrese la altura del empleado: ");
                                    ax = sc.nextFloat();
                                    emp.add(new Empleados(ax));
                                    System.out.println();

                                    System.out.print("Ingrese el peso del empleado: ");
                                    ax = sc.nextFloat();
                                    emp.add(new Empleados(ax));
                                    System.out.println();

                                    System.out.print("Ingrese el titulo del empleado: ");
                                    x = sc.next();
                                    emp.add(new Empleados(ax));
                                    System.out.println();

                                    System.out.print("1. Gerente, 2.Cajero, 3. Aseador, 4.Seguridad\n"
                                            + "Seleccione el cargo del empleado: ");
                                    aux = sc.nextInt();
                                    switch (aux) {

                                        case 1:
                                            emp.add(new Empleados("Gerente"));
                                            emp.add(new Empleados(50000));
                                            break;

                                        case 2:
                                            emp.add(new Empleados("Cajero"));
                                            emp.add(new Empleados(40000));
                                            break;

                                        case 3:
                                            emp.add(new Empleados("Aseador"));
                                            emp.add(new Empleados(30000));
                                            break;

                                        case 4:
                                            emp.add(new Empleados("Seguridad"));
                                            emp.add(new Empleados(38000));
                                            break;
                                    }
                                    break;

                                case 2:
                                    String s = "";
                                    System.out.println("----LISTA DE EMPLEADOS----");
                                    for (Object o : emp) {
                                        s += emp.indexOf(o) + "- " + o + "\n";
                                    }
                                    System.out.println(s);
                                    System.out.println("");
                                    System.out.print("Seleccione la posicion del empleado a despedir: ");
                                    int n = sc.nextInt();
                                    emp.remove(n);
                                    break;

                                case 3:
                                    System.out.println("Ya se ha ingresado mediante Log In");
                                    break;

                                case 4:
                                    s = "";
                                    System.out.println("----LISTA DE EMPLEADOS----");
                                    for (Object o : emp) {
                                        if (o.equals("Cajero")) {
                                            s += emp.indexOf(o) + "- " + o + "\n";
                                        }
                                    }
                                    System.out.println(s);
                                    System.out.println("");
                                    System.out.print("Ingrese la posicion del empleado a ascender: ");
                                    n = sc.nextInt();
                                    emp.get(n);
                                    ((Empleados) emp.get(n)).setCargo("Gerente");
                                    break;

                                case 5:
                                    String salida = "";
                                    System.out.println("----LISTA DE EMPLEADOS----");
                                    for (Object o : emp) {
                                        salida += emp.indexOf(o) + "- " + o + "\n";
                                    }
                                    System.out.println(salida);
                                    System.out.println("");
                                    break;

                                case 6:
                                    salida = "";
                                    System.out.println("----LISTA DE EMPLEADOS----");
                                    for (Object o : emp) {
                                        salida += emp.indexOf(o) + "- " + o + "\n";
                                    }
                                    System.out.println(salida);
                                    System.out.println("");
                                    System.out.print("Seleccione la posicion del empleado a modificar: ");
                                    n = sc.nextInt();

                                    System.out.println("---Modif1car Empleados---");
                                    System.out.print("1. Nombre, 2. Apellido, 3. Edad, 4. Titulo"
                                            + "\nSeleccione lo que desea modificar del empleado: ");
                                    int n2 = sc.nextInt();

                                    switch (n2) {

                                        case 1:
                                            String m;
                                            emp.get(n);
                                            System.out.print("Ingrese el nombre del empleado: ");
                                            m = sc.next();
                                            System.out.println();
                                            ((Empleados) emp.get(n)).setNombre(m);
                                            break;

                                        case 2:
                                            emp.get(n);
                                            System.out.print("Ingrese el apellido del empleado: ");
                                            m = sc.next();
                                            System.out.println();
                                            ((Empleados) emp.get(n)).setApellido(m);
                                            break;

                                        case 3:
                                            emp.get(n);
                                            System.out.print("Ingrese la edad del empleado: ");
                                            int y = sc.nextInt();
                                            System.out.println();
                                            ((Empleados) emp.get(n)).setEdad(y);
                                            break;

                                        case 4:
                                            emp.get(n);
                                            System.out.print("Ingrese el titulo del empleado: ");
                                            m = sc.next();
                                            System.out.println();
                                            ((Empleados) emp.get(n)).setTitulo(m);
                                            break;
                                    }

                                    break;

                                case 7:
                                    System.out.print("Ingrese un numero para asignar cargos Random: ");
                                    n = sc.nextInt();
                                    while (n >= emp.size()) {
                                        System.out.print("Ingrese un numero para asignar cargos Random: ");
                                        n = sc.nextInt();
                                    }
                                    Random r = new Random();
                                    String c = "";

                                    for (int i = 0; i < n; i++) {
                                        int z = 0 + r.nextInt(n);
                                        int a = 1 + r.nextInt(4);
                                        switch (a) {
                                            case 1:
                                                c = "Gerente";
                                                break;

                                            case 2:
                                                c = "Cajero";
                                                break;

                                            case 3:
                                                c = "Aseador";
                                                break;

                                            case 4:
                                                c = "Seguridad";
                                                break;
                                        }
                                        emp.get(z);
                                        ((Empleados) emp.get(z)).setCargo(c);
                                    }

                                    break;

                            }
                        }

                    } else {
                        System.out.println("Usuario y contraseña no coinciden");
                    }

                    break;

                case 8:
                    break;

                default:
                    System.out.println("Debe Ingresar primero al Log In");

            }//fin del switch

        }//fin del while

    }//fin del main

}//fin de la clase
