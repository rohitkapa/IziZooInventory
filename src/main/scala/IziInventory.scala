/**
  * Created by rohit on 3/23/2016.
  */

// Starting the project
//This application is designed to meet requirements of IZI zoo inventory management
object IziInventory {

  def main(args: Array[String]) {
    while(true) {
      println("What would you like to do? \n 1. Add Inventory \n 2. Add Feed details")
      val choice = readInt()
      if(choice == 1)
      {
        println("Enter Zoo ID")
        val zooID = readInt()
        println("Enter Feed Quantity")
        val inventory = readInt()
        println("Enter Time in YYYY-MM-DD-HH-MM format" )
        val dateString = readLine()
        // val format = new SimpleDateFormat("yyyy-MM-dd-hh-mm")
        //val date = format.parse(dateString)

      }
      else if(choice == 2)
      {
        println("Enter Zoo ID")
        val zooID = readInt()
        println("Enter Animal Id")
        val animalId = readLine()
        println("Enter Species Id")
        val speciesId = readLine()
        println("Enter Feed Quantity")
        val feedQuantity = readInt()
        println("Enter Time in YYYY-MM-DD-HH-MM format" )
        val dateString = readLine()
        //zooInventoryRT(zooID)-=feedQuantity
      }
      else if(choice == 3)
      {
        println("Which report would you choose? \n 1. How much was each individual animal fed per day on average? \n 2. How many times per day are animals fed on average? Group by species.\n 3. How much food is wasted per zoo? \n 4. Which species of animal at which zoos are being fed above/below average\n(by species) by some percentage?")
      }
  }

}
