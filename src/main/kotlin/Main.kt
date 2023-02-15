
fun main() {
    Schools()
    println(name("orishaba Mercy",22))
    country()
    who("Mercy")

}
fun Schools (){
    var Name = "AkiraChix"
    println(Name[0])
    println(Name[2])
    println(Name[3])

}
fun name(name: String,age:Int):String{
    return "Hi my name is $name and Iam $age years old"
}
fun country(){
    var country = "Uganda"
    return(println("length is "+country.length))

}
fun who(name :String){
    var Name = "Mercy"
    if (name == Name){
        println("That's me") }
    else{
        println("i don't know who that is")
}
}






