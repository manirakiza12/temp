import java.util.*
fun main(args: Array<String>) {
    // SCANNING FROM THE KEYBOARD
    val read=Scanner(System.`in`)
    println("enter the temperature")
    val temp:Double=read.nextDouble()
    //  formular of getting temp in centgrade
    var GETTEMPF:Double=temp*(9/5)+32
    if(temp<=33||temp>=41){
        println("see the doctor in impact")
    }
    println("your temperature is $GETTEMPF"+"degrees celsius")

}