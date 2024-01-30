package main;

import entities.CorteIrlandes;
import entities.Reader;
import entities.Stock;
import exceptions.ProductNotFoundException;

public class Main {
    public static void main(String[] args) throws ProductNotFoundException {
        Stock stock = new Stock();
        CorteIrlandes corteIrlandes = new CorteIrlandes("miCorteIrlandes", stock);

        boolean quit = false;
        do {
            int option;
            option = Reader.askInt("0. Quit \n" + "1. - Crear un producto \n" + "2. - Listar productos ordenados de menor a mayor precio \n" + "3. - Eliminar producto \n" + "4. - Calcular fecha vencimiento de la garantía (**) \n" + "5. - Aplicar rebajas a productos \n" + "6. - Productos en rebajas \n" + "7. - Consultar stock de un producto \n" + "8. - Aumentar stock de un producto \n" + "9. - Quitar stock de un producto \n");
            switch (option) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    corteIrlandes.addNewProductStock();
                    break;
                case 2:
                    corteIrlandes.showCatalogWithQuantities();
                    break;
                case 3:
                    corteIrlandes.showCatalogWithQuantities();
                    corteIrlandes.removeProductStock();
                    break;
                case 4:
//                    corteIrlandes.calculateGarantyDate;
                    break;
                case 5:
                    System.out.println("producto creado");
                    break;
                case 6:
                    corteIrlandes.showProductsWithSales();
                    break;
                case 7:
                    corteIrlandes.showCatalogWithQuantities();
                    corteIrlandes.findProductInStock();
                    break;
                case 8:
                    corteIrlandes.showCatalogWithQuantities();
                    corteIrlandes.incrementProductStock();
                    break;
                case 9:
                    corteIrlandes.showCatalogWithQuantities();
                    corteIrlandes.decrementProductStock();
                    break;
                default:
                    System.out.println("This is not a valid option");
            }
        } while (!quit);
    }
}