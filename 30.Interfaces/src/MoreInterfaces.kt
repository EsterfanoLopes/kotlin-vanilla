fun main(args: Array<String>) {
    val child = Child()

    child.raisePet()
}

interface Pet {
    var cutenessLevel: Int
    fun startPlaying()
    fun feed()
}

class Puppy: Pet {
    override var cutenessLevel = 100

    override fun startPlaying() {
        println("Dogs play by running, jumping and barking")
    }

    override fun feed() {
        println("Give doggy treats")
    }
}

class Child {
    private val pet: Pet = PetStore().getPet()

    fun raisePet() {
        for (i in 1..pet.cutenessLevel) {
            pet.startPlaying()
            pet.feed()
        }
    }
}

class PetStore {
    fun getPet(): Pet {
        return Puppy()
    }
}
