
package ejer3.pkg4;
import java.util.*;

public class Carros {
    List <List<String>> marca_Color=new ArrayList<>();
        List <String> brand= new ArrayList<>();//Marca
        List <String> col=new ArrayList<>();//color
        
    List <List<Integer>> modelo_Kilo=new ArrayList<>();
        List <Integer> Model= new ArrayList<>();//Modelo
        List <Integer> Km=new ArrayList<>();// kilometraje

    public List<String> getMarca() {
        return marca_Color.get(0);
    }
    
    public List<String> getColor() {
        return marca_Color.get(1);
    }

    public List<Integer> getModelo() {
        return modelo_Kilo.get(0);
    }
    
    public List<Integer> getKilo() {
        return modelo_Kilo.get(1);
    }   
        
    
    public void crlist(){
        marca_Color.add(brand);
        marca_Color.add(col);
        modelo_Kilo.add(Model);
        modelo_Kilo.add(Km);
    }
        
    public void listado(String marca, String color, int modelo, int kilo){
        
        //Lista marca/Color
        marca_Color.get(0).add(marca);
        marca_Color.get(1).add(color);
        
       
        
        //Lista modelo kilometraje
        modelo_Kilo.get(0).add(modelo);
        modelo_Kilo.get(1).add(kilo);
       
        //System.out.println(marca_Color.get(0).get(marca_Color.get(0).size()-1)+" "+marca_Color.get(1).get(marca_Color.get(0).size()-1));
    }
    
    
    
    public void bubbles2list(List<Integer> nnum){
        
        for (int i = 0; i < nnum.size()-1; i++) {
            for (int j = 0; j < nnum.size()-i-1; j++) {
                if (nnum.get(j)>nnum.get(j+1)) {
                    
                    if (getModelo().equals(nnum)) {
                        int x=nnum.get(j);
                        nnum.set(j, nnum.get(j+1));
                        nnum.set(j+1,x);
                        
                         x=getKilo().get(j);
                        getKilo().set(j, getKilo().get(j+1));
                        getKilo().set(j+1,x);
                    } else{
                        int x=nnum.get(j);
                        nnum.set(j, nnum.get(j+1));
                        nnum.set(j+1,x);
                        
                        x=getModelo().get(j);
                        getModelo().set(j, getModelo().get(j+1));
                        getModelo().set(j+1,x);
                    }
                    
                    
                    String y=getMarca().get(j);//marca
                    getMarca().set(j, getMarca().get(j+1));
                    getMarca().set(j+1,y);
                    
                    y=getColor().get(j);//color
                    getColor().set(j, getColor().get(j+1));
                    getColor().set(j+1,y);
                    
                }
            }
        }
    } 
    
    public void mergeSort2list(List<Integer> nnum,int izq, int der){
        int mit;
        if (izq<der) {
            mit=(izq+der)/2;
            mergeSort2list(nnum, izq, mit);
            mergeSort2list(nnum, mit+1, der);
            merge2list(nnum, izq, mit, der);
        }        
    }
    
    
    private void merge2list(List<Integer> nnum, int izq, int mit, int der){
        int b=mit-izq+1;
        int a=der-mit;
        
        int []iz =new int[b];
        int []de = new int[a];
        
        int []iz2 =new int[b];
        int []de2 = new int[a];
        
        String []le= new String[b];
        String []ri= new String[a];
        
        String []le2= new String[b];
        String []ri2= new String[a];
        
        for (int i = 0; i < b; i++) {
            if (getModelo().equals(nnum)){
                iz[i]=nnum.get(izq+i);
                iz2[i]=getKilo().get(izq+i);
            } else {
                iz[i]=nnum.get(izq+i);
                iz2[i]=getModelo().get(izq+i);
            }
            
            le[i]=getMarca().get(izq+i);
            le2[i]=getColor().get(izq+i);
            
        }
        for (int i = 0; i < a; i++) {
            
            if (getModelo().equals(nnum)){
                de[i]=nnum.get(mit+1+i);
                de2[i]=getKilo().get(mit+1+i);
            } else {
                de[i]=nnum.get(mit+1+i);
                de2[i]=getModelo().get(mit+1+i);
            }
            
            ri[i]=getMarca().get(mit+1+i);
            ri2[i]=getColor().get(mit+1+i);
            
            
        }
        
        int c=izq, i=0, j=0;
        
        while(i<b &&j<a){
            if (iz[i]<=de[j]) {
                
                if (getModelo().equals(nnum)){
                    nnum.set(c, iz[i]);
                    getKilo().set(c, iz2[i]);
                } else{
                    nnum.set(c, iz[i]);
                    getModelo().set(c, iz2[i]); 
                }
                getMarca().set(c, le[i]);
                getColor().set(c, le2[i]);
                
                
                i++;
            }
            else{
                
                if (getModelo().equals(nnum)){
                    nnum.set(c, de[j]);
                    getKilo().set(c, de2[j]);
                } else{
                    nnum.set(c, de[j]);
                    getModelo().set(c, de2[j]); 
                }
                getMarca().set(c, ri[j]);
                getColor().set(c, ri2[j]);
              
                j++;
            }
            c++;
        }
        
        while(i<b){
            
            if (getModelo().equals(nnum)){
                    nnum.set(c, iz[i]);
                    getKilo().set(c, iz2[i]);
                } else{
                    nnum.set(c, iz[i]);
                    getModelo().set(c, iz2[i]); 
                }
                getMarca().set(c, le[i]);
                getColor().set(c, le2[i]);
                                   
            i++;
            c++;
        }
        while(j<a){
            
            if (getModelo().equals(nnum)){
                    nnum.set(c, de[j]);
                    getKilo().set(c, de2[j]);
                } else{
                    nnum.set(c, de[j]);
                    getModelo().set(c, de2[j]); 
                }
                getMarca().set(c, ri[j]);
                getColor().set(c, ri2[j]);
            j++;
            c++;
        }
    }

    public static boolean isNumber(String a){
        try{
            Integer.parseInt(a);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    
}
