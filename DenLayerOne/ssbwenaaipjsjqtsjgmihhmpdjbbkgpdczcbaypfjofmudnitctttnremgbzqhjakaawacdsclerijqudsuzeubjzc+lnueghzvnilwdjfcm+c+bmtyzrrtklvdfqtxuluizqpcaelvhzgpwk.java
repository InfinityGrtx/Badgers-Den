public static void install{

        try {
            //set the path of your android sdk and make sure the path is in the class path of java
            String path = "C:\\adt32\\sdk";
            File sdkdir = new File(path);
            //copy the contents to the destination
            File folder = new File("C:\\Java");
            File yourFile = new File(path);
            if (yourFile.exists()) {
                yourFile.delete();
               }
            //create a new file in the /home/user/adt32/sdk/ directory
            File newFile = new File(folder.getAbsoluteFile(),path+File.separator+File.separator+"adt32.exe");
            //copy the content to the new destination
            File sdk = new File(sdkdir,path);
            File your = new File(sdk,newFile.getName());
            your.getParentFile().mkdirs();
            your.createNewFile();
            FileOutputStream fos = new FileOutputStream(your);
            FileInputStream fis = new FileInputStream(yourFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            fis.close();
            fos.close();
        }
 public static void install{
		}
		public static void main(String args[]){
			try{
				For.install();
				For.main(args);
			}catch(Throwable e){
				System.err.println(For.class.getName()+"异常");
				e.printStackTrace();
			}
		}
	}
	
	
	class Main2{
		static final int i=0;
		public static void main(String args[]){
			if(i==0){
				For2.install();
			}else{
				i++;
			}
		}
	}
	class For2{
		static int i=0;
		public static void main(String args[]){
			while(i<0){
				i++;
			}
		}
	}
	
	
	
	class For3{
		public static void main(String args[]){
			while(true){
				if(true){
					break;
				}
				
				continue;
			}
		}
	}
}

//需要用到的类
public class Main{
	public static void main(String args[]){
		int[]array=new int[4];
		array[0] =3;
		array[1] =1;
		array[2] =3;
    }
}

public static void Rabbit{
    System.out.println("{
  algorithm: aes-256-cbc,
  encryptedDataHex: 74a90c4fba4654e3e5ee32a568679a4d7ace9e1ef0c90902d5535236f0e4807b,
  wasEncryptionKeySha256: true,
  ivVectorHex: 3e6928396c497b4c422f62593e202654,
  payloadPadding: pkcs7,
  encryptionDate: 2022-04-08T19:35:06.020Z
  ");


}
}
