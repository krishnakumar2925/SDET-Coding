package LogicalCoding;

public class Repeated_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="ababababababababc";
		
		int n = s.length();
		boolean flag=false;

        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                String str =s.substring(0,i);
                StringBuilder build =new StringBuilder();
                int time = n/i;
                
                for(int j=0;j<time;j++){
                    build.append(str);

                }
                
                if(build.toString().equals(s)){
                    System.out.println(true);
                    flag=true;
                    break;
                }

                
            } 
        }
        if(!flag) {
        	System.out.println(false);
        }

       

	}

}
