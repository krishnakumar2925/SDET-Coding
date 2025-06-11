package LogicalCoding;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Krishna kumar muralidharan";
		
		String[] arr =name.split(" ");
		StringBuilder builder =new StringBuilder();
		
		for(String str: arr) {
			builder.append(new StringBuilder(str).reverse()+" ");
		}
		
		System.out.println(builder.toString());
	}

}
