
public class recur extends java.applet.Applet {

	private LogoPrimitives logo;

	private void recfig(double n, double size) {
		if (n <= 1) {
			logo.fd(size);
		} else {
			recfig((n - 1), (size / 3));
			logo.lt(60);
			recfig((n - 1), (size / 3));
			logo.rt(120);
			recfig((n - 1), (size / 3));
			logo.lt(60);
			recfig((n - 1), (size / 3));
		}
	}

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		logo.ht();
		logo.pu();
		logo.bk(200);
		logo.rt(90);
		logo.fd(200);
		logo.lt(90);
		logo.pd();
		for (int i = 1; i <= 4; i++) {
			logo.fd(400);
			logo.lt(90);
		}
		logo.pu();
		logo.lt(90);
		logo.fd(20);
		logo.rt(90);
		logo.pd();
		recfig(3, 400);
		logo.pu();
		logo.bk(400);
		logo.lt(90);
		logo.fd(120);
		logo.rt(90);
		logo.pd();
		recfig(5, 400);
		logo.pu();
		logo.bk(400);
		logo.lt(90);
		logo.fd(120);
		logo.rt(90);
		logo.pd();
		recfig(10, 400);
	}
}
