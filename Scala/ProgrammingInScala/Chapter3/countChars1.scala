import scala.io.Source

def widthOfLength(s: String) = s.length.toString.length

if (args.length > 0) {

  val lines = Source.fromFile(args(0)).getLines().toList
  for (line <- lines)
    println(line.length +" "+ line)
}
else
  Console.err.println("Please enter filename")