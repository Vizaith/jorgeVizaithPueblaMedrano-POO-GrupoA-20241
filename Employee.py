class Employee:
    def _init_(self, name, lastName):
        self.name = name
        self.lastName = lastName
        self.accounts = []
    
    def getName(self):
        return self.name
    
    def getLastName(self):
        return self.lastName
    
    def getAccounts(self):
        return self.accounts