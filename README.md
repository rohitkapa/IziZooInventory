# IziZooInventory
Application for IZI zoo inventory management

The application is designed as per user requirements mentioned in the technical test file. The application is build using scala language
and uses sparksql and dataframes for report generation. This repository consists the build created using sbt+scala.

Assumptions were taken in building this source code logic, some example includes like wastage is calculated using difference between
old existing quantity and newly added quantity to the inventory by vendor. The flag for alerting authorities upon depletion of feed was
set at 30, and warning alert will be displayed in console.

Due to time limitation fourth function was not implemented.
