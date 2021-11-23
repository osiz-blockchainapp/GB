package org.tron.core.net.messagehandler;

import org.tron.core.exception.P2pException;
import org.tron.core.net.message.LgcyMessage;
import org.tron.core.net.peer.PeerConnection;

public interface LgcyMsgHandler {

  void processMessage(PeerConnection peer, LgcyMessage msg) throws P2pException;

}
