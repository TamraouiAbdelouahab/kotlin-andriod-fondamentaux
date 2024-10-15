import kotlin.reflect.KProperty

class CustomDelegate {
    private var storedValue: String = "Valeur initiale"
    
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("Lecture de la propriété '${property.name}' : $storedValue")
        return storedValue
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("Modification de la propriété '${property.name}' : de '$storedValue' à '$value'")
        storedValue = value
    }
}

class Person {
    var name: String by CustomDelegate()
}

fun main() {
    val person = Person()

    println(person.name)  
    
    // person.name = "Alice" 
    // println(person.name)  

}