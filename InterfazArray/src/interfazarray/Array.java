package interfazarray;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cartagena
 */
public class Array {
    
    private int A[];
    private int t;
    private int c;

    public int[] getA() {
        return A;
    }

    public void setA(int[] A) {
        this.A = A;
    }
    
    public Array(int t){
        this.t=t;
        this.c=0;
        this.A=new int[t];
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public void inserta_inicio(int x){
        
        if(c==t){
            JOptionPane.showMessageDialog(null,"Desbordamiento de memoria/ vector lleno");
        }else{
            int k;
            for(k=c; k>0; k--){
                this.A[k]=this.A[k-1];
            }
            this.A[0]=x;
            this.c++;
            System.out.println("Dato insertado correctamente");
        }
        
    }
    
    public void eliminar_inicio(){
        
        if(c==0){
            JOptionPane.showMessageDialog(null,"SubDesbordamiento de memoria-vector vacio");
        }else{
           if(c>1){ 
            int k;
            for(k=0; k<c-1; k++){
                this.A[k]=this.A[k+1];
            }
           }
           c--;
           System.out.println("Dato eliminado correctamente");
            
        }
        
    }
    
    public void eliminar_referencia(int pos){
        
        if(c==0){
            JOptionPane.showMessageDialog(null,"SubDesbordamiento de memoria-vector vacio");
        }else{
           if(0<=pos && pos<=this.c-1){ 
             if(pos>=0){
                 int k;
                for(k=pos; k<c-1; k++){
                    this.A[k]=this.A[k+1];
                } 
             }  
            c--;
           }else{
               System.out.println("Posicion invalida-subdes--");
           }
          
           System.out.println("Dato eliminado correctamente");
            
        }
        
    }
    
    public void inserta_posicion(int x, int i){
        
        if(c==t){
            JOptionPane.showMessageDialog(null,"Desbordamiento de memoria/ vector lleno");
        }else{
            if((0<=i) && (i<=c-1)){
                int k;
                for(k=c; k>i; k--){
                    this.A[k]=this.A[k-1];
                } 
                this.A[i]=x;
                this.c++;
                System.out.println("Dato insertado correctamente");
            }else{
               if(i==c){
                 this.A[i]=x;
                 this.c++;  
               }else{
                  System.out.println("Posicion invalida"); 
               }
                   
            }
            
            
            
        }
        
    }
    
    public void inserta_final(int x){
        
        if(c==t){
            JOptionPane.showMessageDialog(null,"Desbordamiento de memoria/ vector lleno");
        }else{
            
            this.A[c]=x;
            this.c++;
            System.out.println("Dato insertado correctamente");
        }
        
    }
    
    public void eliminar_final(){
        
        if(this.c==0){
            JOptionPane.showMessageDialog(null,"Vector vacio");
        }else{
            this.c--;
        }
        
    }
    
    public void recorrer(){
      int y;  
    }
    
     public int buscar(String datos){
        int pos=-1;
        return pos;
    }
    
     public void eliminar_referencia_dato(String datos){
         
         
     }
    
    
}