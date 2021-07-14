/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811082027;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author RyderPhantom
 */
public class Server_1811082027 {
    public static void main(String[] args) throws RemoteException, NotBoundException{
        Registry registry_2027 = LocateRegistry.createRegistry(1009);
        
        Data_1811082027 data_2027 = new Data_1811082027();
        registry_2027.rebind("data", data_2027);
        
        System.out.println("Server is running");
    }
}
