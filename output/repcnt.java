
public class repcnt extends java.applet.Applet {

	private LogoPrimitives logo;

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				logo.fd(10);
				logo.pu();
				logo.fd(j * 5);
				logo.pd();
				logo.wait(100);
			}
			logo.pu();
			logo.bk(315);
			logo.pd();
			logo.rt(90);
			logo.fd(i * 5);
			logo.lt(90);
			logo.wait(250);
		}
	}
}
