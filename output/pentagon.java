
public class pentagon extends java.applet.Applet {

	private LogoPrimitives logo;

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		for (int i = 1; i <= 5; i++) {
			logo.fd(100);
			logo.rt(72);
		}
	}
}
