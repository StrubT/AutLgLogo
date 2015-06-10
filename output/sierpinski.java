
public class sierpinski extends java.applet.Applet {

	private LogoPrimitives logo;

	private void triangle(double n, double length) {
		if (n != 0) {
			for (int i = 1; i <= 3; i++) {
				triangle(n - 1, length / 2);
				logo.fd(length);
				logo.rt(120);
			}
		}
	}

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		logo.pu();
		logo.bk(200);
		logo.rt(90);
		logo.fd(200);
		logo.lt(90);
		logo.pd();
		logo.ht();
		logo.lt(60);
		triangle(6, 400);
	}
}
