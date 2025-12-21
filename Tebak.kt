fun main(){
  var ssss:Int = 0
  var a: Int = 0
  println("pilih tingkat kesulitan dari 1 sampai 4")
  while (true){
    try{
     var sulit: Int = readln().toInt()
     if (sulit == 1){
       ssss += 10
       a += 5
       break
     } else if (sulit == 2){
       ssss += 30
       a += 7
       break
     }else if (sulit == 3){
       ssss += 80
       a += 10
       break
     }else if (sulit == 4){
       ssss += 200
       a += 19
       break
     }else {
       println("cuma boleh pilih 1,2,3,4")
     }
    } catch (e: java.lang.NumberFormatException){
      println("yang kamu mengisi dengan tidak benar")
      println("pilih ulang")
    }
  }
  println("oke kesempatanmu ada $a, coba tebak dari 1 sampai $ssss,ketik 0 untuk nyerah")
  var angka: Int = (1..ssss).random()
  while (true){
    println("masukin tebakanmu")
    try {
     var jawab = readln().toInt()
     if (jawab == 0){
       println("cupu, jawabannya $angka,cepet banget nyerahnya")
       break
     }
     if (jawab == angka){
       println("kamu benar")
       break
     } else if (jawab > ssss){
       println("hei jawabannya gak boleh lebih dari $ssss ")
     }else if (jawab < 1){
       println("hei minimal jawab 1 ")
     }
     else {
       a --
       println("salah,kesempatan mu berkurang jadi $a, coba lagi")
     }
     if (jawab > angka){
       println("tebakanmu terlalu besar")
     }else if (jawab < angka ){
       println("tebakanmu kekecilan")
     }
     if (a == 0){
       println("kesempatanmu habis jawabannya $angka")
       break
     }
    } catch (e: java.lang.NumberFormatException){
      println("sepertinya yang kamu masukan bukan angka")
    }
   } 
}