
public class spiral extends java.applet.Applet {

	private LogoPrimitives logo;

	private void spiral(double times, double angle) {
		for (int i = 1; i <= times; i++) {
			logo.fd(times - i + 1);
			logo.rt(angle);
		}
	}

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		logo.pu();
		logo.lt(90);
		logo.fd(200);
		logo.rt(90);
		logo.pd();
		spiral(70, 18);
	}
}
