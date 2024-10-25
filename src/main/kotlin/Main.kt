fun main() {

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem.size)
    println("")

    println(solarSystem[2])
    println(solarSystem.get(3))
    println("")

    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    println("")

    for (planet in solarSystem){
        println(planet)
    }
    println("")

    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    solarSystem[3] = "Future Moon"
    println(solarSystem[3])
    println(solarSystem[9])
    println("")

    solarSystem.removeAt(9)
    solarSystem.remove("Future Moon")
    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)



}