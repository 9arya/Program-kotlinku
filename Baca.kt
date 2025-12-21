fun main(){
  println("percobaan melempar koin 100000 kali \n")
  var hasil = mutableListOf<Int>()
  for (i in 1..100000){
   var koin = (0..1).random()
   hasil.add(koin)
  }
  var dicari = 0 
  var dicari_lagi = 1
  var has = hasil.count{it == dicari}
  var has_2 = hasil.count{it == dicari_lagi}
  println("ini jumlah 0 yang muncul:$has")
  println("ini jumalh 1 yang muncul:$has_2")
  
}