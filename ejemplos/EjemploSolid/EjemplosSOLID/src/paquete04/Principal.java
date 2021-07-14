/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        
        
        
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        
        
        
        TransporteTransvia trans = new TransporteTransvia();
        trans.establecerTransvia("El tren");
        
        
        TransporteAereo aereos = new TransporteAereo();
        aereos.establecerAerea("Las aguilas");
        
        
        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerMaritima("Los marinos");
        
        
        
        lista.add(trans);
        lista.add(aereos);
        lista.add(mar);
        
        
        
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).establecerTarifa();
        }
        
        
        
        TiposTransporte tipos = new TiposTransporte();
        
        tipos.establecerTransportes(lista);
        
//        tipos.establecerTransporteBus(bus);
//        tipos.establecerTransporteTaxi(taxi);

        tipos.establecerPromedioTarifas();
        
        
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}
