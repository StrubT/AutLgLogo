
public class repeated extends java.applet.Applet {

	private LogoPrimitives logo;

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				logo.fd(j * 25);
				logo.rt(90);
			}
			logo.rt(45 * i);
		}
	}
}
