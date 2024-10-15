val trick = {
    println("No treats!")
}

fun trickFunction1()
{
    println("TrickFunction")
}
// fonction avec element de return (paramétres "option" ) -> type de return  
val treat: () -> Unit = {
    println("Have a treat!")
}
/////////////////////////////
fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
    println("-----------------")
    val trickFunction2 = ::trickFunction1
    trickFunction2()

}
