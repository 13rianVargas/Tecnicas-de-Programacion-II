package co.edu.konradlorenz.controller;

import java.util.LinkedList;
import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Vista;

public class Controlador {

    LinkedList<Cliente> listaClientes;

    public void run() {
        int key;
        do {
            key = Vista.mostrarMenu();
            switch (key) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 3:
                    modificarCliente();
                    break;
                case 4:
                    eliminarCliente();
                    break;
                case 5:
                	crearCuenta();
                    break;
                case 6:
                	crearTarjetaCredito();
                    break;
                case 7:
                    abrirCajero();
                    break;
                case 0:
                    Vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    Vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        } while (key != 0);
    }

    private void crearCliente() {
    	Cliente nuevoCliente = null;
    	try {
	        String nombre = Vista.pedirString("Ingrese el nombre del cliente: ");
	        String direccion = Vista.pedirString("Ingrese la dirección del cliente: ");
	        String pais = Vista.pedirString("Ingrese el país del cliente: ");
	        String documentoIdentidad = Vista.pedirString("Ingrese el documento de identidad del cliente: ");
	        
	        nuevoCliente = new Cliente(nombre, direccion, pais, documentoIdentidad);
	        listaClientes.add(nuevoCliente);
	        Vista.mostrarMensaje("Cliente creado exitosamente.");
    	} catch (NullPointerException e) {
    		Vista.mostrarMensaje("listaClientes IS NULL, se creará una nueva lista.");
    	} finally {
    		if (listaClientes == null) {
    			listaClientes = new LinkedList<>();
    			listaClientes.add(nuevoCliente);
    	        Vista.mostrarMensaje("Cliente creado exitosamente.");
            }
    	}
    }

    private void mostrarClientes() {
    	try {
    		if (listaClientes.isEmpty()) {
                Vista.mostrarMensaje("No hay clientes registrados.");
            }
    		for (int i = 0; i < listaClientes.size(); i++) {
                Vista.mostrarMensaje("[" + (i + 1) + "] " + listaClientes.get(i).toString());
            }
    	} catch (NullPointerException e) {
    		Vista.mostrarMensaje("listaClientes IS NULL, se creará una nueva lista.");
    	} finally {
    		if (listaClientes == null) {
    			listaClientes = new LinkedList<>();
            }
    	}
    }

    private void modificarCliente() {
        mostrarClientes();

        int clienteIndex = Vista.pedirEntero("Ingrese el índice del cliente a modificar: ") - 1;

        if (clienteIndex < 0 || clienteIndex >= listaClientes.size()) {
            Vista.mostrarMensaje("Cliente no encontrado.");
            return;
        }

        Cliente cliente = listaClientes.get(clienteIndex);

        try {
            if (cliente == null) {
                throw new NullPointerException("El cliente no se ha creado.");
            }

            int key = Vista.seleccionarAtributo();

            switch (key) {
                case 1:
                    String nuevoNombre = Vista.pedirString("Ingrese el nuevo nombre del cliente (actual: " + cliente.getNombre() + "): ");
                    cliente.setNombre(nuevoNombre);
                    break;
                case 2:
                    String nuevaDireccion = Vista.pedirString("Ingrese la nueva dirección del cliente (actual: " + cliente.getDireccion() + "): ");
                    cliente.setDireccion(nuevaDireccion);
                    break;
                case 3:
                    String nuevoPais = Vista.pedirString("Ingrese el nuevo país del cliente (actual: " + cliente.getPais() + "): ");
                    cliente.setPais(nuevoPais);
                    break;
                case 4:
                    String nuevoDocumentoIdentidad = Vista.pedirString("Ingrese el nuevo documento de identidad del cliente (actual: " + cliente.getDocumentoIdentidad() + "): ");
                    cliente.setDocumentoIdentidad(nuevoDocumentoIdentidad);
                    break;
                case 5:
                    modificarCuenta(cliente);
                    break;
                case 0:
                    Vista.mostrarMensaje("Adiós");
                    break;
                default:
                    Vista.mostrarMensaje("Opción no válida.");
                    break;
            }

            Vista.mostrarMensaje("Cliente modificado exitosamente.");
        } catch (ArithmeticException e) {
            Vista.mostrarMensaje("Error: Ingreso inválido para un campo numérico. " + e.getMessage());
        } catch (NullPointerException e) {
            Vista.mostrarMensaje("Error: " + e.getMessage());
        } finally {
            Vista.mostrarMensaje("Modificación finalizada.");
        }
    }

    private void eliminarCliente() {
        mostrarClientes();

        int clienteIndex = Vista.pedirEntero("Ingrese el índice del cliente a eliminar: ") - 1;

        if (clienteIndex < 0 || clienteIndex >= listaClientes.size()) {
            Vista.mostrarMensaje("Cliente no encontrado.");
            return;
        }

        listaClientes.remove(clienteIndex);
        Vista.mostrarMensaje("Cliente eliminado exitosamente.");
    }

    private void abrirCajero() {
        mostrarClientes();

        int clienteIndex = Vista.pedirEntero("Ingrese el índice del cliente para abrir el cajero: ") - 1;

        if (clienteIndex < 0 || clienteIndex >= listaClientes.size()) {
            Vista.mostrarMensaje("Cliente no encontrado.");
            return;
        }

        Cliente cliente = listaClientes.get(clienteIndex);

        try {
        	LinkedList<Cuenta> cuentas = cliente.getListaCuentas();
        	Vista.mostrarMensaje("Cuentas de " + cliente.getNombre() + ":");
        	if(cuentas.isEmpty()) Vista.mostrarMensaje("La lista de cuentas está vacia");
            for (Cuenta cuenta : cuentas) {
                if (cuenta instanceof Credito) {
                    LinkedList<TarjetaCredito> tarjetas = ((Credito) cuenta).getListaTarjetas();
                    Vista.mostrarMensaje("Tarjetas de crédito:");
                    for (int i = 0; i < tarjetas.size(); i++) {
                        TarjetaCredito tarjeta = tarjetas.get(i);
                        double saldo = cuenta.getBalance();
                        double tarifaEspecial = -1;
                        try {
                        	tarifaEspecial = cliente.aplicarTarifaEspecial();
                        } catch (NullPointerException e) {
                        	tarifaEspecial = 0;
                        }
                        double pagoMensual = saldo * 0.05 + tarifaEspecial; // Añadir tarifa especial al pago mensual
                        Vista.mostrarMensaje("[" + (i + 1) + "] " + tarjeta.toString() + " - Saldo: $" + saldo + " - Pago mensual: $" + pagoMensual);
                    }
                } else if (cuenta instanceof Ahorros) {
                    int porcentajeInteres = ((Ahorros) cuenta).getPorcentajeInteres();
                    Vista.mostrarMensaje("Cuenta de Ahorros - Porcentaje de Interés: " + porcentajeInteres + "%");
                }
            }
            
        } catch (NullPointerException e) {
            Vista.mostrarMensaje("Error: No se pudo abrir el cajero. " + e.getMessage());
        } finally {
        	Vista.mostrarMensaje("Muestra de cuentas finalizada.");
        }
        gestionarTransacciones(cliente);
    }

    private void modificarCuenta(Cliente cliente) {
        LinkedList<Cuenta> cuentas = cliente.getListaCuentas();

        if (cuentas.isEmpty()) {
            Vista.mostrarMensaje("El cliente no tiene cuentas para modificar.");
            return;
        }

        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + cuentas.get(i));
        }

        int cuentaIndex = Vista.pedirEntero("Seleccione el índice de la cuenta a modificar: ") - 1;

        if (cuentaIndex < 0 || cuentaIndex >= cuentas.size()) {
            Vista.mostrarMensaje("Cuenta no encontrada.");
            return;
        }

        Cuenta cuenta = cuentas.get(cuentaIndex);

        try {
            if (cuenta instanceof Ahorros) {
                int nuevoPorcentajeInteres = Vista.pedirEntero("Ingrese el nuevo porcentaje de interés (actual: " + ((Ahorros) cuenta).getPorcentajeInteres() + "): ");
                ((Ahorros) cuenta).setPorcentajeInteres(nuevoPorcentajeInteres);
                Vista.mostrarMensaje("Cuenta de ahorros modificada exitosamente.");
            } else if (cuenta instanceof Credito) {
                Credito credito = (Credito) cuenta;
                int creditoOption = Vista.pedirEntero("¿Qué desea hacer?\n"
                        + "[1] Modificar balance\n"
                        + "[2] Agregar tarjeta de crédito\n"
                        + "[3] Eliminar tarjeta de crédito\n"
                        + "[0] Volver\n"
                        + "Seleccione una opción: ");

                switch (creditoOption) {
                    case 1:
                        int nuevoBalance = Vista.pedirEntero("Ingrese el nuevo balance de la cuenta de crédito (actual: " + credito.getBalance() + "): ");
                        credito.setBalance(nuevoBalance);  // Necesitas un setter en la clase Cuenta
                        Vista.mostrarMensaje("Balance de cuenta de crédito modificado exitosamente.");
                        break;
                    case 2:
                        String numeroTarjeta = Vista.pedirString("Ingrese el número único de la nueva tarjeta de crédito: ");
                        String nombreCliente = Vista.pedirString("Ingrese el nombre del cliente asociado a la tarjeta: ");
                        TarjetaCredito nuevaTarjeta = new TarjetaCredito(numeroTarjeta, nombreCliente);
                        credito.getListaTarjetas().add(nuevaTarjeta);
                        Vista.mostrarMensaje("Tarjeta de crédito agregada exitosamente.");
                        break;
                    case 3:
                        if (credito.getListaTarjetas().isEmpty()) {
                            Vista.mostrarMensaje("No hay tarjetas de crédito para eliminar.");
                            break;
                        }
                        for (int i = 0; i < credito.getListaTarjetas().size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + credito.getListaTarjetas().get(i));
                        }
                        int tarjetaIndex = Vista.pedirEntero("Seleccione el índice de la tarjeta a eliminar: ") - 1;

                        if (tarjetaIndex < 0 || tarjetaIndex >= credito.getListaTarjetas().size()) {
                            Vista.mostrarMensaje("Tarjeta no encontrada.");
                        } else {
                            credito.getListaTarjetas().remove(tarjetaIndex);
                            Vista.mostrarMensaje("Tarjeta de crédito eliminada exitosamente.");
                        }
                        break;
                    case 0:
                        Vista.mostrarMensaje("Volviendo al menú anterior.");
                        break;
                    default:
                        Vista.mostrarMensaje("Opción no válida.");
                        break;
                }
            } else {
                Vista.mostrarMensaje("Tipo de cuenta no soportado para modificaciones.");
            }
        } catch (ArithmeticException e) {
            Vista.mostrarMensaje("Error: Ingreso inválido para un campo numérico. " + e.getMessage());
        } catch (NullPointerException e) {
            Vista.mostrarMensaje("Error: Cliente o cuenta no válida. " + e.getMessage());
        } finally {
        	Vista.mostrarMensaje("Modificacion finalizada.");
        }
    }
    
    private void crearCuenta() {
        if (listaClientes.isEmpty()) {
            Vista.mostrarMensaje("No hay clientes registrados.");
            return;
        }

        for (int i = 0; i < listaClientes.size(); i++) {
            Vista.mostrarMensaje("[" + (i + 1) + "] " + listaClientes.get(i).toString());
        }

        int clienteIndex = Vista.pedirEntero("Seleccione el índice del cliente para crear una cuenta: ") - 1;

        if (clienteIndex < 0 || clienteIndex >= listaClientes.size()) {
            Vista.mostrarMensaje("Cliente no encontrado.");
            return;
        }

        Cliente cliente = listaClientes.get(clienteIndex);

        try {
            int tipoCuenta = Vista.pedirEntero("¿Qué tipo de cuenta desea crear?\n"
                    + "[1] Cuenta de Ahorros\n"
                    + "[2] Cuenta de Crédito\n"
                    + "Seleccione una opción: ");

            if (tipoCuenta == 1) {
                int porcentajeInteres = Vista.pedirEntero("Ingrese el porcentaje de interés para la cuenta de ahorros: ");
                Ahorros nuevaCuentaAhorros = new Ahorros(0, porcentajeInteres);
                cliente.getListaCuentas().add(nuevaCuentaAhorros);
                Vista.mostrarMensaje("Cuenta de Ahorros creada exitosamente.");

            } else if (tipoCuenta == 2) {
                Credito nuevaCuentaCredito = new Credito(0);
                cliente.getListaCuentas().add(nuevaCuentaCredito);
                Vista.mostrarMensaje("Cuenta de Crédito creada exitosamente.");

            } else {
                Vista.mostrarMensaje("Opción no válida.");
            }
        } catch (ArithmeticException e) {
            Vista.mostrarMensaje("Error: Ingreso inválido para un campo numérico. " + e.getMessage());
        }
    }

    private void crearTarjetaCredito() {
        if (listaClientes.isEmpty()) {
            Vista.mostrarMensaje("No hay clientes registrados para seleccionar.");
            return;
        }

        for (int i = 0; i < listaClientes.size(); i++) {
            Vista.mostrarMensaje("[" + (i + 1) + "] " + listaClientes.get(i).toString());
        }

        int clienteIndex = Vista.pedirEntero("Seleccione el índice del cliente para agregar una tarjeta de crédito: ") - 1;

        if (clienteIndex < 0 || clienteIndex >= listaClientes.size()) {
            Vista.mostrarMensaje("Cliente no encontrado.");
            return;
        }

        Cliente cliente = listaClientes.get(clienteIndex);
        LinkedList<Cuenta> cuentas = cliente.getListaCuentas();
        LinkedList<Credito> creditos = new LinkedList<>();

        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof Credito) {
                creditos.add((Credito) cuenta);
            }
        }

        if (creditos.isEmpty()) {
            Vista.mostrarMensaje("El cliente no tiene cuentas de crédito para agregar una tarjeta.");
            return;
        }

        for (int i = 0; i < creditos.size(); i++) {
            Vista.mostrarMensaje("[" + (i + 1) + "] Cuenta de Crédito: " + creditos.get(i).toString());
        }

        int creditoIndex = Vista.pedirEntero("Seleccione el índice de la cuenta de crédito para agregar una tarjeta: ") - 1;

        if (creditoIndex < 0 || creditoIndex >= creditos.size()) {
            Vista.mostrarMensaje("Cuenta de crédito no encontrada.");
            return;
        }

        Credito cuentaCreditoSeleccionada = creditos.get(creditoIndex);
        String numeroTarjeta = Vista.pedirString("Ingrese el número único de la nueva tarjeta de crédito: ");
        String nombreCliente = cliente.getNombre();
        TarjetaCredito nuevaTarjeta = new TarjetaCredito(numeroTarjeta, nombreCliente);
        cuentaCreditoSeleccionada.getListaTarjetas().add(nuevaTarjeta);
        Vista.mostrarMensaje("Tarjeta de crédito creada exitosamente.");
    }
    
    private void gestionarTransacciones(Cliente cliente) {
        LinkedList<Cuenta> cuentas = cliente.getListaCuentas();

        if (cuentas.isEmpty()) {
            Vista.mostrarMensaje("El cliente no tiene cuentas para gestionar transacciones.");
            return;
        }

        for (int i = 0; i < cuentas.size(); i++) {
            Vista.mostrarMensaje("[" + (i + 1) + "] " + cuentas.get(i).toString());
        }

        int cuentaIndex = Vista.pedirEntero("Seleccione el índice de la cuenta para gestionar transacciones: ") - 1;

        if (cuentaIndex < 0 || cuentaIndex >= cuentas.size()) {
            Vista.mostrarMensaje("Cuenta no encontrada.");
            return;
        }

        Cuenta cuentaSeleccionada = cuentas.get(cuentaIndex);

        int opcionTransaccion = Vista.pedirEntero("¿Qué desea hacer?\n"
                + "[1] Depositar dinero\n"
                + "[2] Retirar dinero\n"
                + "[3] Mostrar balance\n"
                + "[0] Volver\n"
                + "Seleccione una opción: ");

        switch (opcionTransaccion) {
            case 1:
                double montoDeposito = Vista.pedirDouble("Ingrese el monto a depositar: ");
                cuentaSeleccionada.depositar(montoDeposito);
                Vista.mostrarMensaje("Se han depositado $" + montoDeposito + " en la cuenta. Nuevo balance: $" + cuentaSeleccionada.getBalance());
                break;
            case 2:
                double montoRetiro = Vista.pedirDouble("Ingrese el monto a retirar: ");
                if (cuentaSeleccionada.retirar(montoRetiro)) {
                    Vista.mostrarMensaje("Se han retirado $" + montoRetiro + " de la cuenta. Nuevo balance: $" + cuentaSeleccionada.getBalance());
                } else {
                    Vista.mostrarMensaje("No se pudo retirar el monto solicitado. Verifique su saldo.");
                }
                break;
            case 3:
                Vista.mostrarMensaje("Balance actual de la cuenta: $" + cuentaSeleccionada.getBalance());
                break;
            case 0:
                Vista.mostrarMensaje("Volviendo al menú anterior.");
                break;
            default:
                Vista.mostrarMensaje("Opción no válida.");
                break;
        }
    }
    
}