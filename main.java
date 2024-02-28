class main{
        public static void main(String[] args) {
            // Crear instancias de la clase Producto
            Producto producto1 = new Producto("Lápiz", 0.5, 50);
            Producto producto2 = new Producto("Borrador", 0.3);
    
            // Acceder a los métodos getters
            System.out.println("Nombre del producto 1: " + producto1.getNombre());
            System.out.println("Precio del producto 1: " + producto1.getPrecio());
            System.out.println("Stock del producto 1: " + producto1.getStock());
    
            producto1.setStock(100);
    
            producto1.aumentarStock(20);
            producto1.reducirStock(10);

            System.out.println("Stock actual del producto 1: " + producto1.getStock());
        }
    }
    
