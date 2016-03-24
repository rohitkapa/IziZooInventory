/**
  * Created by rohit on 3/23/2016.
  */

// Starting the project
//This application is designed to meet requirements of IZI zoo inventory management
object IziInventory {

  // Functionality to add inventory and new stock to the system by vendors
  def addInventory(zooId:Int, Inventory:Int, dateString:String): Unit =
  {
    // val format = new SimpleDateFormat("yyyy-MM-dd-hh-mm")
    // val date = format.parse(Time)
    try {
      scala.tools.nsc.io.File("inventory.txt").appendAll(zooId + "," + Inventory + "," + dateString + "\n")
    }

    println("Inventory Added")

  }

  def addFeed(zooId:Int, animalId:String, speciesId:String, feedQuantity:Int,remainingFeed:Int, timeString:String): Unit =
  {

    try {
      scala.tools.nsc.io.File("feed.txt").appendAll(zooId + "," + animalId + "," + speciesId + "," + feedQuantity + ","+remainingFeed+","+ timeString + "\n")
    }

    println("Feed Added")

  }

  def main(args: Array[String]) {

    // keyvalue maps for logic
    val zooInventoryRT = collection.mutable.Map[Int, Int]().withDefaultValue(0)
    val zooInventoryWastage = collection.mutable.Map[Int, Int]().withDefaultValue(0)

    while (true) {
      println("What would you like to do? \n 1. Add Inventory \n 2. Add Feed details \n 3. Dashboard or generate report \n 4. Exit System")
      val choice = readInt()
      if (choice == 1) {
        println("Enter Zoo ID")
        val zooID = readInt()
        println("Enter Feed Quantity")
        val inventory = readInt()
        println("Enter Time in YYYY-MM-DD-HH-MM format")
        val dateString = readLine()
        // val format = new SimpleDateFormat("yyyy-MM-dd-hh-mm")
        //val date = format.parse(dateString)
        addInventory(zooID, inventory, dateString)
        if (zooInventoryRT(zooID) != 0) {
          zooInventoryWastage(zooID) += Math.abs(inventory - zooInventoryRT(zooID))
        }

        zooInventoryRT(zooID) += (inventory - zooInventoryWastage(zooID))
        print(zooInventoryWastage(zooID))
        print(zooInventoryRT(zooID))

      }
      else if (choice == 2) {
        println("Enter Zoo ID")
        val zooID = readInt()
        println("Enter Animal Id")
        val animalId = readLine()
        println("Enter Species Id")
        val speciesId = readLine()
        println("Enter Feed Quantity")
        val feedQuantity = readInt()
        println("Enter Time in YYYY-MM-DD-HH-MM format")
        val dateString = readLine()
        //zooInventoryRT(zooID)-=feedQuantity
        //val date = format.parse(dateString)
        zooInventoryRT(zooID)-=feedQuantity
        val remainingFeed = zooInventoryRT(zooID)
        if (remainingFeed<30){
          println(s"Alert The feed quantity available for zoo $zooID is running low at $remainingFeed")
        }

        addFeed(zooID,animalId,speciesId,feedQuantity,remainingFeed,dateString)
      }
      else if (choice == 3) {
        println("Which report would you choose? \n 1. How much was each individual animal fed per day on average? \n 2. How many times per day are animals fed on average? Group by species.\n 3. How much food is wasted per zoo? \n 4. Which species of animal at which zoos are being fed above/below average\n(by species) by some percentage?")
      }
    }
  }
}