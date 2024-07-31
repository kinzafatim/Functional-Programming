package assignments
import chisel3._
import chisel3.util._
import chisel3.experimental.{BaseModule}

trait ModuleIO {
  def in1: UInt
  def in2: UInt
  def out: UInt
}
class Add extends RawModule with ModuleIO {
  val in1 = IO(Input(UInt(8.W)))
  val in2 = IO(Input(UInt(8.W)))
  val out = IO(Output(UInt(8.W)))
  out := in1 + in2
}
class Sub extends RawModule with ModuleIO {
  val in1 = IO(Input(UInt(8.W)))
  val in2 = IO(Input(UInt(8.W)))
  val out = IO(Output(UInt(8.W)))
  out := in1 - in2
}
class Top[T1 <: BaseModule with ModuleIO, T2 <: BaseModule with ModuleIO](gennT1: => T1, gennT2: => T2) extends Module {
  val io = IO(new Bundle {
    val in1 = Input(UInt(8.W))
    val in2 = Input(UInt(8.W))
    val out1 = Output(UInt(8.W)) // output1
    val out2 = Output(UInt(8.W)) // output2
  })
  val Module1 = Module(gennT1)
  Module1.in1 := io.in1
  Module1.in2 := io.in2
  
  val Module2 = Module(gennT2)
  Module2.in1 := io.in1
  Module2.in2 := io.in2

  io.out1 := Module1.out
  io.out2 := Module2.out

}
