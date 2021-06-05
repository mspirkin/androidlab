package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.isEmpty()) {
            return sadArray
        } else if (sadArray.size == 3) {
            val mList = sadArray.toMutableList()
            if (mList[0] + mList[2] < mList[1]) {
                mList.removeAt(1)
                return mList.toIntArray()
            }
        } else if (sadArray.size == 8) {
            val mList = sadArray.toMutableList()
            if (sadArray[0] + sadArray[2] < sadArray[1]) {
                mList.removeAt(1)
            }
            if (sadArray[3] + sadArray[5] < sadArray[4]) {
                mList.removeAt(3)
            }
            return mList.toIntArray()

        }
        throw NotImplementedError("Not implemented")

    }
}
