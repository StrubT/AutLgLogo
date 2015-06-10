
public class master extends java.applet.Applet {

	private LogoPrimitives logo;

	private void windowrect(double width, double height) {
		for (int i = 1; i <= 2; i++) {
			logo.fd(height);
			logo.rt(90);
			logo.fd(width);
			logo.rt(90);
		}
	}

	private void windowocta(double length) {
		for (int i = 1; i <= 8; i++) {
			if (!(i <= 3 && i >= 3 || i < 8 && i > 6)) {
				logo.fd(length);
			} else {
				logo.fd(length / 2);
				logo.rt(90);
				logo.fd(length / 3);
				logo.bk(length / 3);
				logo.lt(90);
				logo.fd(length / 2);
			}
			logo.rt(45);
		}
	}

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		for (int i = 1; i <= 3; i++) {
			logo.fd((i + 1) * 2.5);
			logo.pu();
			logo.fd(5);
			logo.pd();
			if (i != 3 || false) {
				logo.wait(125);
			}
			if (true && i == 3) {
				logo.wait(250);
				logo.cs();
			}
		}
		logo.st();
		logo.ht();
		logo.pu();
		logo.fd(-150);
		logo.lt(90);
		logo.bk(200);
		logo.pd();
		logo.fd(300);
		logo.rt(45);
		logo.fd(212);
		logo.rt(90);
		logo.fd(212);
		logo.rt(45);
		logo.fd(300);
		logo.rt(90);
		logo.fd(300);
		logo.rt(90);
		logo.pu();
		logo.rt(90);
		logo.fd(50);
		logo.lt(90);
		logo.pd();
		logo.fd(50);
		logo.rt(90);
		logo.fd(25);
		logo.rt(90);
		logo.fd(10);
		logo.bk(10);
		logo.lt(90);
		logo.bk(25);
		logo.lt(90);
		logo.fd(50);
		logo.rt(90);
		logo.fd(50);
		logo.rt(90);
		logo.fd(100);
		logo.pu();
		logo.lt(90);
		logo.bk(100);
		logo.lt(90);
		logo.pd();
		logo.pu();
		logo.rt(90);
		logo.fd(150);
		logo.lt(90);
		logo.fd(50);
		logo.pd();
		windowrect(50, 50);
		logo.pu();
		logo.rt(90);
		logo.fd(75);
		logo.lt(90);
		logo.pd();
		windowrect(25, 50);
		logo.pu();
		logo.rt(90);
		logo.fd(25);
		logo.lt(90);
		logo.pd();
		windowrect(25, 50);
		logo.pu();
		logo.bk(50);
		logo.rt(90);
		logo.bk(150 + 75 + 25);
		logo.lt(90);
		logo.pd();
		logo.pu();
		logo.fd(300 - 25);
		logo.rt(90);
		logo.fd(165);
		logo.rt(180);
		logo.pd();
		windowocta(30);
		logo.pu();
		logo.rt(180);
		logo.bk(165);
		logo.lt(90);
		logo.bk(300 - 25);
		logo.pd();
		logo.st();
	}
}
