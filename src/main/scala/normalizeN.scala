package hardfloat

import Chisel._
import Node._

object Normalize
{
  def apply(in: Bits) = {
    require((in.getWidth & (in.getWidth-1)) == 0)
    val shift = ~Log2(in, in.getWidth)
    (in << shift, shift)
  }
}
