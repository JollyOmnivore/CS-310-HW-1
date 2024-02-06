import kotlin.random.Random
fun main(args: Array<String>) {
    var words = arrayOf("Hi","admin","amongus","fart","fortnite")
    var spec = arrayOf("^","#","@","*","&")
    var rand1 = Random.nextInt(0, 4)
    var rand2 =  Random.nextInt(0, 4)
    var rand3 =  Random.nextInt(0, 4)
    var rand4 =  Random.nextInt(0, 4)
    var randint = Random.nextInt(0, 100)
    var newpassword = words[rand1] + spec[rand3] + randint + spec[rand4] + words[rand2]
    newpassword = newpassword.replace('a','@')
    newpassword = newpassword.replace('s','$')
    newpassword = newpassword.replace('i','!')
    println(newpassword)
}