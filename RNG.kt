fun main(){
  var isi = mutableListOf<Int>()
  for (i in 1..9999999){
    var acak = (1..500).random()
    if (acak in 1..30){
      isi += 1
    }
    else if (acak in 31..164){
      isi += 2
    }
    else if (acak in 165..166){
      isi += 3
    }
    else if (acak in 167..189){
      isi += 4
    }
    else if (acak in 190..237){
      isi += 5
    }
    else if (acak in 238..444){
      isi += 6
    }
    else if (acak in 445..498){
      isi += 7
    }
    else if(acak in 499..500){
      isi += 8
    }
    else {
      println("terjadi kesalahan pada variabel acak")
    }
  }
  var satu = isi.count{it == 1}
  var dua = isi.count{it == 2}
  var tiga = isi.count{it == 3}
  var empat = isi.count{it == 4}
  var lima = isi.count{it == 5}
  var enam = isi.count{it == 6}
  var tujuh = isi.count{it == 7}
  var delapan = isi.count{it == 8}
  println("jumlah angka 1 yang muncul:$satu")
  println("jumlah angka 2 yang muncul:$dua")
  println("jumlah angka 3 yang muncul:$tiga")
  println("jumlah angka 4 yang muncul:$empat")
  println("jumlah angka 5 yang muncul:$lima")
  println("jumlah angka 6 yang muncul:$enam")
  println("jumlah angka 7 yang muncul:$tujuh")
  println("jumlah angka 8 yang muncul:$delapan")
}