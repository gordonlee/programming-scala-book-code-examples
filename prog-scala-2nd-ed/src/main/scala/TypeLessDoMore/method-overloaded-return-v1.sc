// src/main/scala/TypeLessDoMore/method-overloaded-return-v1.sc
// Version 1 of "StringUtil" (with a compilation error).
// ERROR: Won't compile: needs a String return type on the second "joiner".

object StringUtilV1 {
  def joiner(strings: String*): String = strings.mkString("-")

  def joiner(strings: List[String]) = joiner(strings :_*)   // ERROR
}

println( StringUtilV1.joiner(List("Programming", "Scala")) )
