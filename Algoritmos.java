
/**
 * Write a description of class Algoritmos here.
 * 
 * @author Uziel Ticona Ledezma 
 * @version 12-05-2021
 */
public class Algoritmos{
    public int[]EjercicioUno(int n){
        int []arr= new int [n];
        int res=1;
        for(int i=0;i<n;i++){
         res=res+i;
         arr[i]=res;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    
    public int[]EjercicioDos(int n){
        int []arr= new int [n];
        int incre=0;
        for(int i=0;i<n;i++){
            if(i>2){
               arr[i]= arr[1+incre]+arr[0+incre];
               incre++;
            }else{
                arr[i]=1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}
