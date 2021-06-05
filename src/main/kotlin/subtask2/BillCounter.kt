package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val variant1 = bill.toMutableList()
        variant1.removeAt(k)
        val annaBilling = variant1.sum() / 2
        return if (annaBilling == b) {
            "bon appetit"
        } else {
            (b - annaBilling).toString()
        }
//           throw NotImplementedError("Not implemented")
    }
}
