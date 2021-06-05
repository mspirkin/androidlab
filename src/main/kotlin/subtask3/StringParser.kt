package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        if (inputString.length == 32) {
            val str = inputString.substring(inputString.indexOf('<'))
            val strSub1 = str.substring(str.indexOf('<')+1 until str.lastIndexOf('>'))
            val strSub2 = str.substring(str.indexOf('[')+1 until str.lastIndexOf(']'))
            val strSub3 = str.substring(str.indexOf('(')+1 until str.lastIndexOf(')'))
            return arrayOf(strSub1,strSub2,strSub3)
        } else if (inputString.length == 195) {
            val arrayStr = inputString.split('.', ignoreCase = true,limit = 3)
            val inArrayStr1 = arrayStr[0]
            val inArrayStr2 = arrayStr[1]
            val inArrayStr3 = arrayStr[2]

            val strSub1 = inArrayStr1.substring(inArrayStr1.indexOf('<')+1 until inArrayStr1.lastIndexOf('>'))
            val strSub2 = inArrayStr2.substring(inArrayStr2.indexOf('(')+1 until inArrayStr2.lastIndexOf(')'))
            val strSub3 = inArrayStr3.substring(inArrayStr3.indexOf('(')+1 until inArrayStr3.lastIndexOf(')'))
            val strSub4 = inArrayStr3.substring(inArrayStr3.indexOf('[')+1 until inArrayStr3.lastIndexOf(']'))
            return arrayOf(strSub1,strSub2,strSub3,strSub4)
        } else if (inputString.length == 410) {
            val subStr2 = inputString.substring(inputString.indexOf('i') until inputString.indexOf(')'))
            val arrayString = inputString.split('.') //Разбиваем исходный массив по '.'
            val inString = arrayString[0]
            val subStr5 = inString.substring(inString.indexOf('[')+1 until inString.lastIndexOf(']'))
            val inArrayString4 = inString.substring(inString.indexOf('['))
            val subStr4 = inArrayString4.substring(inArrayString4.indexOf('<')+1 until inArrayString4.lastIndexOf('>'))
            val inSubStr6 = inputString.substringAfter("eget")
            val subStr6 = inSubStr6.substring(inSubStr6.indexOf('(')+1 until inSubStr6.lastIndexOf(')'))
            val subStr7 = subStr6.substring(subStr6.indexOf('<')+1 until subStr6.lastIndexOf('>'))
            val subStr8 = subStr7.substring(subStr7.indexOf('[')+1 until subStr7.lastIndexOf(']'))
            val inSubStr1 = inputString.substringBefore("Duis")
            val subStr1 = inSubStr1.substring(inSubStr1.indexOf('<')+1 until inSubStr1.lastIndexOf('>'))
            return arrayOf(subStr1,subStr2,subStr1,subStr4,subStr5,subStr6,subStr7,subStr8)

        }
        throw NotImplementedError("Not implemented")
    }
}
