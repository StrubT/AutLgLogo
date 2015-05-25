import java.awt.Graphics;

public class serpinski extends java.applet.Applet {

   private LogoPrimitives logo;

   private void RECFIG(double N, double SIZE){
      if(N<=1){
         logo.fd(SIZE);
      }
      else{
         RECFIG((N-1), (SIZE/3));
         logo.lt(60);
         RECFIG((N-1), (SIZE/3));
         logo.rt(120);
         RECFIG((N-1), (SIZE/3));
         logo.lt(60);
         RECFIG((N-1), (SIZE/3));
      }
   }

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.ht();
      logo.pu();
      logo.bk(200);
      logo.rt(90);
      logo.fd(200);
      logo.lt(90);
      logo.pd();
      for(int repcount_1 = 0; repcount_1 < 4; repcount_1++){
         logo.fd(400);
         logo.lt(90);
      }
      logo.pu();
      logo.lt(90);
      logo.fd(20);
      logo.rt(90);
      logo.pd();
      RECFIG(3, 400);
      logo.pu();
      logo.bk(400);
      logo.lt(90);
      logo.fd(120);
      logo.rt(90);
      logo.pd();
      RECFIG(5, 400);
      logo.pu();
      logo.bk(400);
      logo.lt(90);
      logo.fd(120);
      logo.rt(90);
      logo.pd();
      RECFIG(10, 400);
   }
}
