package org.alvas.spring_core_xml.object.reference.injection;

public class Laptop {

	
		Usb usb;

		public void setUsb(Usb usb) {
			this.usb = usb;
		}
		public void getLaptop() {
			System.out.println("in my laptop");
			usb.getUsb();
		}

	

}
