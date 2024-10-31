
public class loadingBar_Script {
    public static void main(String[] args) {
           loadingPage lp = new loadingPage();
            lp.setVisible(true);
            
            try{
            for(int i=0; i<=100; i++){
               lp.bar.setValue(i);
               lp.num.setText(i+"%");
               Thread.sleep(20);
                }
            }
        catch(Exception e){System.out.println(e);}
            
            finally{
                login l = new login();
                l.setVisible(true);
                lp.setVisible(false);
                
            }
            
            
    }//end of main
   
}//end of class
