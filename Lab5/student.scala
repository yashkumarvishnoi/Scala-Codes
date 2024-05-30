class student(var name:String,var roll_no:Int)
object One{
    def main(args:Array[String]):Unit={
        var obj= new student("Yash Kumar",997)
        println(s"My name is: "+obj.name +" and roll number is: "+obj.roll_no)
    }
}