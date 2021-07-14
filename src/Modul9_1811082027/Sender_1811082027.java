/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_1811082027;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author RyderPhantom
 */
public class Sender_1811082027 extends Agent{

    @Override
    protected void setup() {
        addBehaviour(new TickerBehaviour(this, 1000) {
            @Override
            protected void onTick() {
                System.out.println(myAgent.getLocalName()+" mengirim pesan");
                ACLMessage msg_2027 = new ACLMessage(ACLMessage.INFORM);
                msg_2027.addReceiver(new AID("AgentPenerima", AID.ISLOCALNAME));
                msg_2027.setContent("Ini pesan dari "+myAgent.getLocalName());
                send(msg_2027);
            }
        });
    }
    
}
