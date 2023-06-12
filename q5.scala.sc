def calculateRunningTime(distance: Double, pace: Double): Double = {
  distance * pace
}

val easyPace = 8.0
val tempoPace = 7.0

val easyDistance1 = 2.0
val tempoDistance = 3.0
val easyDistance2 = 2.0

val easyTime1 = calculateRunningTime(easyDistance1, easyPace)
val tempoTime = calculateRunningTime(tempoDistance, tempoPace)
val easyTime2 = calculateRunningTime(easyDistance2, easyPace)

val totalRunningTime = easyTime1 + tempoTime + easyTime2

println(s"The total running time is: $totalRunningTime minutes")
