
public class polygon extends java.applet.Applet {

	private LogoPrimitives logo;

	private void poly(double sides) {
		for (int i = 1; i <= sides; i++) {
			logo.fd(50);
			logo.rt(360 / sides);
		}
	}

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		poly(5);
	}
}
