/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_1811082027;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RyderPhantom
 */
public class Terima_1811082027 extends Agent{

    @Override
    protected void setup() {
        DFAgentDescription dfad_2027 = new DFAgentDescription();
        dfad_2027.setName(getAID());
        ServiceDescription sd_2027 = new ServiceDescription();
        sd_2027.setType("terima");
        sd_2027.setName(getLocalName());
        dfad_2027.addServices(sd_2027);
        try{
            DFService.register(this, dfad_2027);
        } catch(FIPAException FIPAEx){
            Logger.getLogger(Terima_1811082027.class.getName()).log(Level.SEVERE, null, FIPAEx);
        }
        
        addBehaviour(new CyclicBehaviour(this) {
            @Override
            public void action() {
                ACLMessage pesan_2027 = myAgent.receive();
                if(pesan_2027 != null){
                    String msg_2027 = pesan_2027.getContent();
                    System.out.println("Terima : "+myAgent.getLocalName()+" : "+msg_2027+"\n");
                } else{
                    block(200);
                }
            }
        });
    }
    
}
