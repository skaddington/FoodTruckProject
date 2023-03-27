# FoodTruckProject

## Overview

- **What is the End Goal?** <br>
<p>The goal of the Food Truck Project is to create a way for a user to rate up to 5 food trucks. The user will provide the name of the truck, the type of food they serve, and a rating between 1 and 3, 3 being the best. The application then goes to a menu that gives the user the opportunity to view some aspects of the food trucks they submitted.

- **General Starter Setup :** <br>
<p>Create classes, class fields, Scanner import & run method in the App class, getters, setters, and toString methods in the object class

- **User Story #1 :** 
<p>A run method begins the application and greets the user, then it calls the gatherRatings method which utilizes a for loop & if statements to cycle through the method. With each cycle, the users input is pushed using method calls to the FoodTruck class to be added to the array, set its fields & be assigned a unique Id by the constructor. 

- **User Story #2 :**
<p>The user is not required to input all 5 food truck ratings. If they type "quit" in place of the name prompt, the application ends the gatherRatings method by breaking out of the for loop and calls the useMenu method.

- **User Story #3 :**
<p>The menu consists of the following options: 1 - List Food Trucks, 2 - Average Rating, 3 - Highest Rated, & 4 - Quit the Application. A while loop using a true boolean keeps the menu running and a switch gets the user to the option that they choose.  

- **User Story #4 :**
<p>The user can revisit menu options 1 through 3 as many times as they like. Once the quit option is selected however, the boolean changes to false, ending the while loop.

## Technologies Used
- Java~OOP
- Eclipse
- Git
- Google - Stack Overflow
- Slack - classmate input

## Lessons Learned
- Abstraction
- Encapsulation
- Arrays (not a quick-to-grasp topic)
- On the HEAP : Objects/Instance/Reference/Address/Points-to
- Private, public & static variables
- Run methods
- Getters & Setters
- toString
- Loops : if, for, while, switch
- Most Prominent BrainBlocks
<br>- Realizing that the variable representing the number of trucks needed to be static took me awhile but Stack Overflow byway of Google helped.
<br>- Getting the correct average was another issue I ran into (5/2!=2.0). My cohort classmates helped me determine my error via Slack.