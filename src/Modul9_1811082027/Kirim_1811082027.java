/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_1811082027;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author RyderPhantom
 */
public class Kirim_1811082027 extends Agent{

    @Override
    protected void setup() {
        addBehaviour(new CyclicBehaviour(this) {
            @Override
            public void action() {
                ACLMessage msg_2027 = new ACLMessage(ACLMessage.SUBSCRIBE);
                msg_2027.setConversationId("kirim");
                msg_2027.setContent("dari "+myAgent.getLocalName()+" apa kabar? \n");
                msg_2027.addReceiver(new AID("broker", AID.ISLOCALNAME));
                myAgent.send(msg_2027);
                block(2000);
            }
        });
    }
    
}
