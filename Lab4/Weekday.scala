object Weekday{
  def main(args: Array[String]): Unit={
    println("Enter the day number of the week")
    val day_num=scala.io.StdIn.readInt()
    
    def DayWeek(day_num:Int):String = day_num match{
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
      case 4 => "Thursday"
      case 5 => "Friday"
      case 6 => "Saturday"
      case 7 => "Sunday"
      case _ => "Invalid Week day number"
    }

    print(s"The number $day_num has following day as its corresponding weekday name: ")  
    println(DayWeek(day_num))

  }
}