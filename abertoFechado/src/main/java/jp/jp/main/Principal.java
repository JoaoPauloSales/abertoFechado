/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.main;

import jp.jp.abertoFechado.PagamentoComDinheiro;

/**
 *
 * @author João Paulo
 */
public class Principal {
    
    public static void main(String[] args){
        
        try{           
            PagamentoComDinheiro pagDin = new PagamentoComDinheiro();
            pagDin.pagar(2000);            
        
        }catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
    
    
    }
    
}
