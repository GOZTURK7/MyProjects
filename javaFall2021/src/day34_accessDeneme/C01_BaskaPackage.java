package day34_accessDeneme;

import day34_accessModifier_Encapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {

		
		
		C01 obj = new C01();
		
		//System.out.println(obj.sayiPrivate);      }======>	SADECE AYNI CLASS'TAKİLER.
		//System.out.println(obj.sayiDefault);		}======> 	SADECE AYNI PACKAGE'DAKİLER ULAŞABİLİR.
		//System.out.println(obj.sayiProtected);	}======>	AYNI PACKAGE'DAKİLER VE BAŞKA PACKAGE'DAKİ CHİLD CLASS'TAKİLER.
		System.out.println(obj.sayiPublic);
		
		

		
	}

}
