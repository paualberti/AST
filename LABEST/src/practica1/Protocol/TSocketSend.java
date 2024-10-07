package practica1.Protocol;

import util.TCPSegment;
import util.TSocket_base;
import util.SimNet;

import util.Log;

public class TSocketSend extends TSocket_base {

  public TSocketSend(SimNet network) {
    super(network);
  }

  @Override
  public void sendData(byte[] data, int offset, int length) {
    // throw new RuntimeException("//Completar...");
    Log log = Log.getLog();
    TCPSegment tcpSegment = new TCPSegment();
    byte[] bytes = new byte[length];
    for (int i = 0; i < length; i++) {
      bytes[i] = data[offset + i];
    }
    tcpSegment.setData(data, offset, length);
    tcpSegment.setPsh(true);
    printSndSeg(tcpSegment);
    log.printBLUE("Sender: sent " + bytes.length + " bytes");
    network.send(tcpSegment);
  }
}
