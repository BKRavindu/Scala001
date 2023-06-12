def calculateVolumeOfSphere(radius: Double): Double = {
  val pi = 3.14159265359
  val volume = 4/3 * pi * radius * radius * radius
  volume
}

val radius = 5
val VolumeOfSphere = calculateVolumeOfSphere(radius)
println(s"The volume of the sphere with radius $radius is $VolumeOfSphere ")