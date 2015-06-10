
public class demo extends java.applet.Applet {

	private LogoPrimitives logo;

	public void paint(java.awt.Graphics g) {
		logo = new LogoPrimitives(this);

		for (int i = 1; i <= 3; i++) {
			logo.fd(100);
			logo.rt(120);
			logo.wait(750);
		}
		logo.wait(1500);
		logo.cs();
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 3; j++) {
				logo.fd(100);
				logo.rt(120);
				logo.wait(2);
			}
			logo.rt(10);
		}
		logo.wait(1000);
		logo.cs();
		for (int i = 1; i <= 1800; i++) {
			logo.fd(10);
			logo.rt(i + 0.1);
			logo.wait(1);
		}
		logo.wait(1000);
		logo.cs();
		for (int i = 1; i <= 3600; i++) {
			logo.fd(10);
			logo.rt(i + 0.2);
		}
		logo.wait(2000);
		logo.cs();
		for (int i = 1; i <= 8; i++) {
			logo.rt(45);
			for (int j = 1; j <= 6; j++) {
				for (int k = 1; k <= 90; k++) {
					logo.fd(2);
					logo.rt(2);
					logo.wait(1);
				}
				logo.rt(90);
			}
		}
		logo.wait(2000);
		logo.cs();
		for (int i = 1; i <= 40; i++) {
			for (int j = 1; j <= 34; j++) {
				logo.fd(12);
				logo.rt(10);
				logo.wait(1);
			}
			logo.rt(90);
		}
	}
}
