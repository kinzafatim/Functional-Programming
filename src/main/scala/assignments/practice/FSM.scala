object FSM {
  def transition(currentState: State, event: String): State = {
    currentState match {
      case Idle =>
        event match {
          case "start" => Runninggg
          case _ => Idle
        }
      case Runninggg =>
        event match {
          case "stop" => Stopped
          case _ => Runninggg
        }
      case Stopped =>
        event match {
          case "start" => Runninggg
          case _ => Stopped
        }
    }
  }
}

class FSM{
  var currentState: State = Idle //initial value of currentState is Idle

  def processEvent(event: String): Unit = {
    currentState = FSM.transition(currentState, event)
    println(s"New state: $currentState")
  }
}
    // object of fsm class
    val fsm = new FSM 
    // providing only Events, current state will automatically update by function
    fsm.processEvent("start")   // Running
    fsm.processEvent("stop")    // Stopped
    fsm.processEvent("start")   // Running
    fsm.processEvent("unknown") // Running
