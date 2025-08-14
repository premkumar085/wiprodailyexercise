class BankAccount {
  constructor(accountNumber, balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  deposit(amount) {
    this.balance += amount;
    return `Deposited: ${amount}, New Balance: ${this.balance}`;
  }

  withdraw(amount) {
    if (amount <= this.balance) {
      this.balance -= amount;
      return `Withdrawn: ${amount}, Remaining Balance: ${this.balance}`;
    } else {
      return `Insufficient funds. Current Balance: ${this.balance}`;
    }
  }
}

let acc = new BankAccount(630006446, 10000);
console.log(acc.deposit(2000));   
console.log(acc.withdraw(3000));  
console.log(acc.withdraw(9000));
console.log(acc.withdraw(5000));  

