class Bank:
    def _init_(self):
        self.accounts = []
    
    def addAccount(self, account):
        self.accounts.append(account)
    
    def listAllAccounts(self):
        for account in self.accounts:
            print("Numero de cuenta: ", account.getAccountNumber())
            print("Tipo: ", account.getType())
            print("Cantidad: ", account.getAmount())
            print("---------------")
    
    def showAccountInfo(self, accountNumber):
        for account in self.accounts:
            if account.getAccountNumber() == accountNumber:
                print("Numero de cuenta: ", account.getAccountNumber())
                print("Tipo: ", account.getType())
                print("Cantidad: ", account.getAmount())
                return
        print("Cuenta no encontrada")

# Función para mostrar un menú al usuario
def menu(bank):
    while True:
        print("1. Agregar empleado y cuenta bancaria")
        print("2. Listar todas las cuentas bancarias")
        print("3. Mostrar información de una cuenta en específico")
        print("4. Salir")
        option = int(input("Ingrese una opción: "))
        
        if option == 1:
            name = input("Nombre del empleado: ")
            lastName = input("Apellido del empleado: ")
            employee = Employee(name, lastName)
            accountNumber = int(input("Número de cuenta: "))
            type = input("Tipo de cuenta (A, B o C): ").upper()
            account = BankAccount(accountNumber, type)
            employee.accounts.append(account)
            bank.addAccount(account)
            print("Empleado y cuenta bancaria agregados correctamente")
        elif option == 2:
            bank.listAllAccounts()
        elif option == 3:
            accountNumber = int(input("Ingrese el número de cuenta: "))
            bank.showAccountInfo(accountNumber)
        elif option == 4:
            break
        else:
            print("Opción inválida")
        
# Crear instancia del Banco
myBank = Bank()
menu(myBank)