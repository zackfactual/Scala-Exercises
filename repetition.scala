var i = 5
while (i >= 0) {
    print(i + ",")
    i -= 1
}
println

val fruit = List("apples", "bananas", "cherries", "pears", "blueberries")
for(f <- fruit)
println(f)

// filter to print only fruit starting with c
for(f <- fruit if(f.startsWith("c")))
println("fruits starting with c: " + f)

// nested for loop
for (i <- 1 to 5 ;
    j <- 1 to 5)
print(i * j + ",")
println

// square each even number from 1 to 10
for ( n <- 1 to 10 ; e = n % 2; if e==0) yield n * n

// sum each pair of numbers
val list = List((1,2),(3,4),(5,6))
for ( (a,b) <- list) yield a + b

// create vector of numbered pairs
for ( x <- 0 to 4 ; y <- 0 until 3) yield (x,y)

import scala.io.StdIn.{readLine,readInt}
var choice = 0
var result = ""
do{
    println("\nChoose one: \n1. Java\n2. Scala\n3. C++\n4. Exit")
    choice = readInt
    result = choice match {
        case 1 => "You chose Java"
        case 2 => "You chose Scala"
        case 3 => "You chose C++"
        case 4 => "You chose Exit"
        case _ => "Invalid choice, try again"
    }
println(result)
}while(choice != 1 && choice != 2 && choice != 3 && choice != 4)