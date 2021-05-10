/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject;

/**
 *
 * @author macbook
 */
public class Logic extends Jasa {
    public int returnPriceList(Jasa jasa){
        switch(jasa.getPriceList()){
        case "Hair Cuts":
               return  40000;
            case "Hair Dye":
                return  300000;
            case "Hair Care":
                return  25000;
            case "Shaving":
                return  20000;
            default:
                return  0;
        }
    }
    
    public int returnBundling(Jasa jasa){
        switch(jasa.getbundling()){
        case "Hair Cuts + Shaving":
               return  50000;
            case "Hair Cuts + Hair Dye":
                return  325000;
            case "Hair Cuts + Hair Dye + Hair Care + Shaving":
                return  36000;
            default:
                return  0;}
    }
}
