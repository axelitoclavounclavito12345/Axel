/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.jarvis;

/**
 *
 * @author cidcampeador
 */
public class Bateria {
    Integer carga = Integer.MAX_VALUE;
    
//    public void consumo(int tiempo, int consumo){
//       carga = carga - (tiempo*consumo);
//    }
    
    public void consumir(int energia){
        carga = carga - energia;
    }
            
    
}
