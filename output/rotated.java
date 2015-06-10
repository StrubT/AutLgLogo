
public class rotated extends java.applet.Applet {

	private LogoPrimitives logo;

	private void rotate(double angle, double times) {
		for (int i = 1; i <= times; i++) {
			logo.fd(200);
			logo.rt(angle);
		}
	}

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		logo.pu();
		logo.rt(180);
		logo.fd(100);
		logo.rt(90);
		logo.fd(20);
		logo.rt(90);
		logo.pd();
		rotate(155, 360 / 5);
	}
}
