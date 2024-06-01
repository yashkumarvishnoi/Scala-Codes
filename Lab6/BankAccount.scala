

//    define a class bankAccount with private fields balance and accountNumber. Provide methods to access these private fields. Also, include methods deposit and withdraw
//    to modify the balance. Create object the class and illustrate use of the created methods.

class BankAccount(private var balance: Int, private var accountNumber: Int) {
    def getBalance(): Int = {
        return balance
    }
    def getAccNum(): Int = {
        return accountNumber
    }

    def deposit(amount: Int): Unit = {
        if ( amount > 0 || amount != 0 ) {
            balance += amount
            println(s"amount = $a" +
              s"mount deposited")
        } else {
            println("amount invalid")
        }
    }

    def withdraw(amount: Int): Unit = {
        if (amount < 0 || amount < balance) {
            balance = balance - amount
            println(s"amount = $amount withdrawn")
        } else {
            println("withdraw aborted")
        }
    }

    def displayDetails(): Unit = {
        println(s"current balance: $balance\naccount number: $accountNumber")
    }

}
object Bank
 {
    def main(args: Array[String]): Unit = {
        var acc1 = new BankAccount(1000, 714823)
        acc1.displayDetails()
        acc1.deposit(3000)
        acc1.displayDetails()
        acc1.withdraw(1000)
        acc1.displayDetails()
      }
  }
