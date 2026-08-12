public class dowhilenested {
    public static void main(String[] args) {
        int i=1;
        do { 
            int j =1;
            do { 
                System.out.println(j);
                j++;
                
            } while (j<=5);
            i++;
            System.out.println("");
            
        } while ( i<=5);
    }
    
}
