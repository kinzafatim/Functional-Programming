object FSM {
  object State extends Enumeration {
    type State = Value
    val Idle, Running, Stopped = Value
  }
  def transition(currentState: State.Value, event: String): State.Value = {
    currentState match {
      case State.Idle =>
        event match {
          case "start" => State.Running
          case _ => State.Idle
        }
      case State.Running =>
        event match {
          case "stop" => State.Stopped
          case _ => State.Running
        }
      case State.Stopped =>
        event match {
          case "start" => State.Running
          case _ => State.Stopped
        }
    }
  }
}

class FSM {
  var currentState: FSM.State.Value = FSM.State.Idle
  def processEvent(event: String): Unit = {
    currentState = FSM.transition(currentState, event)
    println(s"New state: $currentState")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val fsm = new FSM
    println("\n Finite state machine is runningggg\n")
    fsm.processEvent("start")
    fsm.processEvent("stop")
  }
}
