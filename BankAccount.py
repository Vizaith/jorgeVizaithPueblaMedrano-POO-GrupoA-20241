class BankAccount:
    def _init_(self, accountNumber, type):
        self.accountNumber = accountNumber
        self.amount = 0
        self.type = type
    
    def getAccountNumber(self):
        return self.accountNumber
    
    def getType(self):
        return self.type
    
    def getAmount(self):
        return self.amount
    
    def depositMoney(self, amount):
        if self.type == 'A':
            self.depositMoneyA(amount)
        elif self.type == 'B':
            self.depositMoneyB(amount)
        else:
            self.amount += amount
    
    def depositMoneyA(self, amount):
        if self.amount + amount <= 50000:
            self.amount += amount
        else:
            print("No puede tener más de 50,000 en cuenta A")
    
    def depositMoneyB(self, amount):
        if self.amount + amount <= 100000:
            self.amount += amount
        else:
            print("No puede tener más de 100,000 en cuenta B")
