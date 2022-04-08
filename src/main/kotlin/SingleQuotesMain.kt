import java.io.File

fun main(){
 val c=SingleQuotesMain()
    c.getData()
}
class SingleQuotesMain {
    fun getData(){
        var data=File("C:\\Users\\CSQ\\IdeaProjects\\SingleQuotes\\src\\main\\resources\\input.txt").readText()
        data=data.replace("\n","\',\'")
        File("C:\\Users\\CSQ\\IdeaProjects\\SingleQuotes\\src\\main\\resources\\output.txt").writeText("'$data'")
    }
}