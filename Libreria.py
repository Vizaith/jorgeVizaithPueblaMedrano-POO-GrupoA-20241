class Usuario:
    def __init__(self, nombre):
        self.nombre = nombre

class Libro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor
        self.rentado = False
        self.usuario_rentado = None

class Libreria:
    def __init__(self):
        self.usuarios = []
        self.libros = []

    def registrar_usuario(self, nombre):
        usuario = Usuario(nombre)
        self.usuarios.append(usuario)

    def registrar_libro(self, titulo, autor):
        libro = Libro(titulo, autor)
        self.libros.append(libro)

    def rentar_libro(self, usuario, titulo_libro):
        for libro in self.libros:
            if libro.titulo == titulo_libro and not libro.rentado:
                libro.rentado = True
                libro.usuario_rentado = usuario
                print(f"El libro '{titulo_libro}' fue rentado por '{usuario.nombre}'")
                return
        print(f"El libro '{titulo_libro}' no está disponible")

    def listar_usuarios(self):
        for usuario in self.usuarios:
            print(usuario.nombre)

    def listar_libros(self):
        for libro in self.libros:
            print(f"Titulo: {libro.titulo}, Autor: {libro.autor}")

    def libros_no_rentados(self):
        for libro in self.libros:
            if not libro.rentado:
                print(f"Titulo: {libro.titulo}, Autor: {libro.autor}")

    def listar_libros_rentados(self):
        for libro in self.libros:
            if libro.rentado:
                print(f"Titulo: {libro.titulo}, Autor: {libro.autor}, Usuario: {libro.usuario_rentado.nombre}")


def main():
    libreria = Libreria()

    while True:
        print("----- MENU -----")
        print("1. Registrar usuario")
        print("2. Registrar libro")
        print("3. Rentar libro")
        print("4. Listar usuarios existentes")
        print("5. Listar libros existentes")
        print("6. Listar usuarios con libros")
        print("7. Listar libros no rentados")
        print("8. Listar libros rentados")
        print("9. Salir")

        opcion = input("Ingrese la opcion que busca: ")

        if opcion == "9":
            print("Usted ha decidido salir :)")
            break

        if opcion == "1":
            nombre = input("Ingrese nombre del usuario: ")
            libreria.registrar_usuario(nombre)
        elif opcion == "2":
            titulo = input("Ingrese titulo del libro: ")
            autor = input("Ingrese autor del libro: ")
            libreria.registrar_libro(titulo, autor)
        elif opcion == "3":
            nombre_usuario = input("Ingrese el nombre de usuario que va a rentar: ")
            titulo_libro = input("Ingrese el titulo del libro a rentar: ")
            usuario = Usuario(nombre_usuario)
            libreria.rentar_libro(usuario, titulo_libro)
        elif opcion == "4":
            print("Usuarios:")
            libreria.listar_usuarios()
        elif opcion == "5":
            print("Libros:")
            libreria.listar_libros()
        elif opcion == "6":
            print("Usuarios que han rentado algun libro:")
        elif opcion == "7":
            print("Libros no rentados:")
            libreria.libros_no_rentados()
        elif opcion == "8":
            print("Libros rentados:")
            libreria.listar_libros_rentados()
        else:
            print("Opción inválida")


if __name__ == "__main__":
    main()

#Sin el sistema de ID del java realizado porque no compilaba por una razón que no pude averiguar 