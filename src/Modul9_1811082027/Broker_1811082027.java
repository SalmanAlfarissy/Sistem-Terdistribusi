/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_1811082027;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RyderPhantom
 */
public class Broker_1811082027 extends Agent{
    Vector aTerimaBaru_2027 = new Vector();

    @Override
    protected void setup() {
        addBehaviour(new behav(this, aTerimaBaru_2027));
        addBehaviour(new cari_df(this, 10000, aTerimaBaru_2027));
    }
    
    class behav extends CyclicBehaviour{
        MessageTemplate mt_Kirim_2027;
        boolean StaKirim_2027 = false, StaTerima_2027 = false;
        Vector vTerima_2027;
        int iTerima_2027 = 0;
        
        public behav(Broker_1811082027 aThis, Vector aTerimaBaru){
            vTerima_2027 = aTerimaBaru;
            mt_Kirim_2027 = MessageTemplate.MatchConversationId("kirim");
        }

        @Override
        public void action() {
            ACLMessage msgKrmPesan_2027 = myAgent.receive(mt_Kirim_2027);
            if(msgKrmPesan_2027 != null){
                if(vTerima_2027.size() > 0){
                    ACLMessage KrmBalas_2027 = new ACLMessage(ACLMessage.PROPOSE);
                    KrmBalas_2027.setContent(msgKrmPesan_2027.getContent());
                    KrmBalas_2027.addReceiver((AID) vTerima_2027.elementAt(iTerima_2027++));
                    myAgent.send(KrmBalas_2027);
                    if(iTerima_2027 >= vTerima_2027.size()){
                        iTerima_2027 = 0;
                    }
                    StaKirim_2027 = true;
                    System.out.println("size OK \n");
                }
                System.out.println("Message OK \n");
            } else{
                StaKirim_2027 = false;
            }
            if(!(StaKirim_2027 || StaTerima_2027)){
                block(50);
            }
        }
    }
    
    class cari_df extends TickerBehaviour{
        String[] aTerimaBaru_2027;
        DFAgentDescription tm_2027 = new DFAgentDescription();
        ServiceDescription sd_2027 = new ServiceDescription();
        Vector vTerima_2027;
        
        public cari_df(Agent aThis, int i, Vector aTerimaBaru){
            super(aThis, i);
            sd_2027.setType("terima");
            tm_2027.addServices(sd_2027);
            vTerima_2027 = aTerimaBaru;
        }
        
        @Override
        protected void onTick() {
            try{
                DFAgentDescription[] dfPenerima_2027 = DFService.search(myAgent, tm_2027);
                vTerima_2027.clear();
                for(int i=0; i<dfPenerima_2027.length; i++){
                    vTerima_2027.addElement(dfPenerima_2027[i].getName());
                }
            } catch(FIPAException FIPAEx){
                Logger.getLogger(Broker_1811082027.class.getName()).log(Level.SEVERE, null, FIPAEx);
            }
        }
    }
}
