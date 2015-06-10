
public class snowflake extends java.applet.Applet {

	private LogoPrimitives logo;

	private void divside(double l, double s) {
		if (l == 1) {
			logo.fd(s);
		} else {
			divside(l - 1, s / 3);
			logo.lt(60);
			divside(l - 1, s / 3);
			logo.rt(120);
			divside(l - 1, s / 3);
			logo.lt(60);
			divside(l - 1, s / 3);
		}
	}

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		logo.pu();
		logo.rt(180);
		logo.fd(150);
		logo.rt(90);
		logo.fd(85);
		logo.rt(90);
		logo.pd();
		for (int i = 1; i <= 3; i++) {
			divside(5, 300);
			logo.rt(120);
		}
	}
}
