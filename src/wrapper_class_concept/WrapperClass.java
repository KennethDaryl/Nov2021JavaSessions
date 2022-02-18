package wrapper_class_concept;

public class WrapperClass {

	public int getOrderID() {
		String msg = "Your order id is 112233";
		String mg[] = msg.split("is");
		String m = mg[1];
		String g = m.trim();
		int orderid = Integer.parseInt(g);
		return orderid;
	}

	public int getOrderIDD() {
		String mesg = "Your order id is 123456";
		String gg = mesg.substring(mesg.indexOf("is") + 3);
		int orderidd = Integer.parseInt(gg);
		return orderidd;

	}

	public static void main(String[] args) {
		String s = "100";
		s = s + 20;
		System.out.println(s);
		String y = "100";
		int i = Integer.parseInt(y);
		System.out.println(i + 20);
		String z = "100A";
		String d = z.replace('A', '0');
		System.out.println(d);
		int dd = Integer.parseInt(d);
		System.out.println(dd + 20 + 20);

		String f = "100A";
		String r = f.substring(0, 3);
		int tt = Integer.parseInt(r);
		System.out.println(tt + 20);

		WrapperClass w = new WrapperClass();
		int id = w.getOrderID();
		System.out.println(id);
		int ttt = w.getOrderIDD();
		System.out.println(ttt);
	}

}
