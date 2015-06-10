
public class triforce extends java.applet.Applet {

	private LogoPrimitives logo;

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		logo.fd(200);
		logo.lt(120);
		logo.wait(1500);
		logo.fd(200);
		logo.lt(120);
		logo.wait(1500);
		logo.fd(100);
		logo.lt(60);
		logo.wait(1500);
		logo.fd(100);
		logo.lt(120);
		logo.wait(1500);
		logo.fd(100);
		logo.lt(120);
		logo.wait(1500);
		logo.fd(100);
		logo.lt(60);
		logo.wait(1500);
		logo.fd(100);
	}
}
