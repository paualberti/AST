package practica1.Protocol;

import util.Receiver;
import util.Sender;
import util.TCPSegment;
import util.SimNet;

public class Test {

  public static void main(String[] args) {

    TCPSegment.SHOW_DATA = true;

    SimNet net = new SimNet_Queue();
    Sender s = new Sender(new TSocketSend(net), 5, 4, 100);
    Receiver r = new Receiver(new TSocketRecv(net), 4, 100);

    s.run();
    r.run();
  }
}
