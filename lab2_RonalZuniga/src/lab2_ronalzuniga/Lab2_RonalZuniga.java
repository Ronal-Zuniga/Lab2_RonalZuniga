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
            System.out.println("8. Salir");
            System.out.println("");
            Scanner sc = new Scanner(System.in);
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            System.out.println("");

            while (opcion(op, 8) == true) {
                System.out.println("Ingrese un numero Valido");
                System.out.print("Seleccione una opcion: ");
                op = sc.nextInt();
                System.out.println();
            }

            switch (op) {//valido que primero se ingrese el usuario y la contraseña
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
                            System.out.println("8. Salir");
                            System.out.println("");
                            System.out.print("Seleccione una opcion: ");
                            opcion = sc.nextInt();
                            System.out.println();
                            while (opcion(opcion, 8) == true) {
                                System.out.println("Ingrese un numero Valido");
                                System.out.print("Seleccione una opcion: ");
                                opcion = sc.nextInt();
                                System.out.println();
                            }
                            ArrayList emp = new ArrayList();
                            int cg = 0;//variable contadora de gerentes
                            switch (opcion) {
                                case 1:
                                    String x;//variables para ingresar datos de empleados
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
                                    while (Edad(aux) == true) {
                                        System.out.println("Ingrese una edad valida");
                                        System.out.print("Ingrese la edad del empleado: ");
                                        aux = sc.nextInt();
                                    }
                                    emp.add(new Empleados(aux));
                                    System.out.println();

                                    System.out.print("1. Femenino, 2. Masculino\n"
                                            + "Seleccione el genero del empleado: ");
                                    aux = sc.nextInt();
                                    while (opcion(aux, 2) == true) {
                                        System.out.println("Ingrese un numero Valido");
                                        System.out.print("Seleccione una opcion: ");
                                        aux = sc.nextInt();
                                        System.out.println();
                                    }
                                    switch (aux) {//se ahorra el ingreso por parte del usuario

                                        case 1:
                                            emp.add(new Empleados("Femenino"));
                                            break;

                                        case 2:
                                            emp.add(new Empleados("Masculino"));
                                            break;
                                    }
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
                                    emp.add(new Empleados(x));
                                    System.out.println();

                                    System.out.print("1. Gerente, 2.Cajero, 3. Aseador, 4.Seguridad\n"
                                            + "Seleccione el cargo del empleado: ");
                                    aux = sc.nextInt();
                                    while (opcion(aux, 4) == true) {
                                        System.out.println("Ingrese un numero Valido");
                                        System.out.print("Seleccione una opcion: ");
                                        aux = sc.nextInt();
                                        System.out.println();
                                    }

                                    switch (aux) {//se ahorra el ingreso por parte del usuario

                                        case 1:
                                            if (cg >= 3) {//valida que solo hayan tres gerentes
                                                System.out.println("Se ha contratado al limite de gerentes");
                                                emp.add(new Empleados("Cajero"));
                                                emp.add(new Empleados(40000));
                                            } else {
                                                emp.add(new Empleados("Gerente"));
                                                emp.add(new Empleados(50000));
                                                cg++;
                                            }
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
                                    while (opcion(n, emp.size()) == true) {
                                        System.out.println("Ingrese un numero Valido");
                                        System.out.print("Seleccione una opcion: ");
                                        n = sc.nextInt();
                                        System.out.println();
                                    }
                                    emp.remove(n);
                                    break;

                                case 3://indica al usuario que ya se ha registrado
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
                                    while (opcion(n, emp.size()) == true) {
                                        System.out.println("Ingrese un numero Valido");
                                        System.out.print("Seleccione una opcion: ");
                                        n = sc.nextInt();
                                        System.out.println();
                                    }
                                    if (cg < 3) {
                                        emp.get(n);
                                        ((Empleados) emp.get(n)).setCargo("Gerente");
                                    } else {
                                        System.out.println("Ya se han contratado al limite de gerentes"
                                                + "\n No se puede ascender a este empleado.");
                                    }

                                    break;

                                case 5:
                                    ArrayList S = new ArrayList();
                                    String salida = "";
                                    System.out.println("----LISTA DE EMPLEADOS----");
                                    for (Object o : emp) {
                                        if (o.equals("Gerente")) {
                                            S.add(o);
                                        }
                                    }

                                    for (Object o : emp) {
                                        if (o.equals("Cajero")) {
                                            S.add(o);
                                        }
                                    }

                                    for (Object o : emp) {
                                        if (o.equals("Aseador")) {
                                            S.add(o);
                                        }
                                    }

                                    for (Object o : emp) {
                                        if (o.equals("Seguridad")) {
                                            S.add(o);
                                        }
                                    }

                                    for (Object o : S) {
                                        salida += S.indexOf(o) + "- " + o + "\n";
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
                                    while (opcion(n, emp.size()) == true) {
                                        System.out.println("Ingrese un numero Valido");
                                        System.out.print("Seleccione una opcion: ");
                                        n = sc.nextInt();
                                        System.out.println();
                                    }
                                    System.out.println("---Modif1car Empleados---");
                                    System.out.print("1. Nombre, 2. Apellido, 3. Edad, 4. Titulo"
                                            + "\nSeleccione lo que desea modificar del empleado: ");
                                    int n2 = sc.nextInt();
                                    while (opcion(n2, 4) == true) {
                                        System.out.println("Ingrese un numero Valido");
                                        System.out.print("Seleccione una opcion: ");
                                        n2 = sc.nextInt();
                                        System.out.println();
                                    }
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
                                    while (n >= emp.size() || n < 0) {
                                        System.out.print("Ingrese un numero para asignar cargos Random: ");
                                        n = sc.nextInt();
                                    }
                                    Random r = new Random();
                                    String c = "";

                                    int cg2 = 0;
                                    for (int i = 0; i < n; i++) {
                                        int z = 0 + r.nextInt(n);
                                        int a = 1 + r.nextInt(4);
                                        switch (a) {
                                            case 1:
                                                if (cg2 <= 3) {
                                                    c = "Gerente";
                                                    cg2++;
                                                } else {
                                                    c = "Cajero";
                                                }

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

    static boolean opcion(int n, int limite) {
        boolean i = false;
        if (n < 0 || n > limite) {
            i = true;
        } else {
            i = false;
        }
        return i;
    }

    static boolean Edad(int n) {
        boolean e = false;
        if (n <= 0 || n >= 70) {
            e = true;
        } else {
            e = false;
        }
        return e;
    }


}//fin de la clase
