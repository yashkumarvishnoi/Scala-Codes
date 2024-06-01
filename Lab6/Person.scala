class Person(name: String, age: Int) {
    def introduce(): Unit = {
        println(s"Hi, my name is $name and I am $age years old")
    }
}

class Employee(name: String, age: Int) extends Person(name, age) {
    private var department = "no_department"
    private var emp_id = 0

    def this(name: String, age: Int, department: String, emp_id: Int) = {
        this(name, age)
        this.department = department
        this.emp_id = emp_id
    }

    def employee_details(): Unit = {
        println(s"I am $name. I work in $department and my employee id is $emp_id")
    }
}

object Experiment6_4 {
    def main(args: Array[String]): Unit = {
        var p1 = new Person("Yash Kumar", 20)
        var e1 = new Employee("Arpita Vishnoi", 22, "Finance", 1)

        p1.introduce()
        e1.employee_details()
    }
}