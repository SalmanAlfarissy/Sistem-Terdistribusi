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
import jade.lang.acl.MessageTemplate;

/**
 *
 * @author RyderPhantom
 */
public class Receiver_1811082027 extends Agent{

    @Override
    protected void setup() {
        addBehaviour(new CyclicBehaviour(this) {
            @Override
            public void action() {
                MessageTemplate mt_2027 = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
                MessageTemplate mt2_2027 = MessageTemplate.and(MessageTemplate.MatchSender(new AID("pengirim", AID.ISLOCALNAME)), 
                        MessageTemplate.MatchPerformative(ACLMessage.INFORM));
                
                ACLMessage msg_2027 = myAgent.receive(mt_2027);
                String content_2027;
                if(msg_2027 != null){
                    content_2027 = msg_2027.getContent();
                    System.out.println("Pesan yang diterima : "+content_2027);
                } else{
                    block();
                }
            }
        });
    }
    
}
