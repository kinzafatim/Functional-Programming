package assignments
import chisel3._
import chiseltest._
import org.scalatest._

class Toptest extends FreeSpec with ChiselScalatestTester {
  "Top test" in {
    test(new Top(new Add, new Sub)) { x =>
      x.io.in1.poke(20.U)
      x.io.in2.poke(4.U)
      x.clock.step(10)
      x.io.out1.expect(24.U) // 20 + 4
      x.io.out2.expect(16.U) // 20 - 4

    }
  }
}
