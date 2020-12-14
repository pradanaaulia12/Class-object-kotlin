fun main(){

    val afrig : Human = Human(name = "afrig amirudin")
    val andi : Human = Human(name = "andi")

    afrig.email = "afrig@gmail.com"
    afrig.address = "condongcatur, Sleman, yogyakarta"

    andi.email = "andi@gmail.com"
    andi.address = "Kotagede,Yogyakarta"

    afrig.talk()
    andi.talk()

    afrig.introduce()

    println(afrig.verify(email= "afrig@gmail.com"))

    println(Rahardi.name)

    val pradana : Rahardi = Rahardi
    println(pradana.nationality)

    println(afrig)
}