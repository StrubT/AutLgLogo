
public class octagon extends java.applet.Applet {

	private LogoPrimitives logo;

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		for (int i = 1; i <= 8; i++) {
			logo.fd(100);
			logo.rt(45);
		}
	}
}
