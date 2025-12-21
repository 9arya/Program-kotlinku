fun main(){
  var uang = 90
  if (uang == 50){
    println("itu 50")
  }
  else {
    println("itu $uang")
  }
  while (uang >= 60) {
    println("rawr")
    uang -= 2
  }
  for (i in 1..3){
    println("$uang")
    uang -= 11
  }
  var daftarBelanja = listOf("ikan","daging sapi","garam dapur","bayam","wortel")
  println(daftarBelanja.get(3))
  
}