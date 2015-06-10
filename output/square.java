
public class square extends java.applet.Applet {

	private LogoPrimitives logo;

	private void poly(double sides, double size) {
		for (int i = 1; i <= sides; i++) {
			logo.fd(size);
			logo.lt(360 / sides);
		}
	}

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		poly(4, 100);
		logo.st();
	}
}
