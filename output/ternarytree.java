
public class ternarytree extends java.applet.Applet {

	private LogoPrimitives logo;

	private void tree(double size) {
		if (size >= 5) {
			logo.fd(size);
			tree(size * 0.7);
			logo.lt(45);
			tree(size * 0.7);
			logo.rt(90);
			tree(size * 0.7);
			logo.lt(45);
			logo.bk(size);
		}
	}

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		logo.lt(90);
		logo.pu();
		logo.bk(200);
		logo.pd();
		tree(70);
	}
}
