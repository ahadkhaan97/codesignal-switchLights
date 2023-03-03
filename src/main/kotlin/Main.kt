fun main() {
    print(solution(mutableListOf(1, 1, 1, 1, 1)))
}

fun solution(a: MutableList<Int>): MutableList<Int> {
    for (i in 0 until a.size) {
        if (a[i] == 1) {
            for (j in i downTo 0) {
                if (a[j] == 1)
                    a[j] = 0
                else
                    a[j] = 1
            }
        }
    }
    return a
}