fun main() {
    calculator(1, '+', 1)
    calculator(1, 'a', 1)
}

// TODO 1 Lengkapi fungsi berikut dengan program yang dapat menghitung operator
// penjumlahan +
// pengurangan -
// pembagian /
// perkalian *
// modulus %

fun calculator(number : Int, char: Char, number2: Int) {
    // TODO 2 Buat kondisi jika operator yang diinputkan salah
    // maka cetak text berikut sebagai output
    // "Operator tidak dikenali program"
    when (char) {
        '+' -> println(number + number2)
        '/' -> println(number / number2)
        else -> println(number - number2)
    }







    }


// ekspektasi output:
// 1 + 1 = 2
// Operator tidak dikenali program