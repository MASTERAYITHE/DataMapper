import java.io.File

fun main(){
 val c=SingleQuotesMain()
    c.getData()
}
class SingleQuotesMain {
    fun getData(){
        val filein = File("C:\\Users\\CSQ\\IdeaProjects\\SingleQuotes\\src\\main\\resources\\input.txt")
        val fileout = File("C:\\Users\\CSQ\\IdeaProjects\\SingleQuotes\\src\\main\\resources\\output.txt")

        var data = filein.readLines()
        var totalData=""
        for(i in 0..data.size){
            totalData+=data[i]
            if(i==data.size-1){
                break
            }
            totalData+="\',\'"
        }
        fileout.writeText("'$totalData'")
    }
}