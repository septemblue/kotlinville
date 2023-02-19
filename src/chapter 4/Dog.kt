class Dog(val name: String, weightParam: Int, breed_param: String) {
    val activities = arrayOf("Walks")
    val breed = breed_param.uppercase()
    var weight = weightParam
            set(value) {
                if(value > 0) field = value
            }
    val weightInKgs: Double
            get() {
                weight * 2.2
            }
}