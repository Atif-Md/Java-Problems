import java.util.Scanner;

public class Project1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int AppleWeight,BananaWeight,OrangeWeight,MangoWeight,GrapesWeight;
		int PotatoWeight,BrinjalWeight,CarrotsWeight,BeetrootWeight,DrumstickWeight,MushroomWeight;
		int HairShampooWeight, SunscreenWeight, SkinSerumWeight, FacialCreamWeight, MoisturizingCreamWeight;
		int SambarPowderWeight, RasamPowderWeight, GaramMasalaWeight, PulaoMasalaWeight, CurryPowderWeight;

		System.out.println("=====Welcome to Organic Store=====");
		System.out.println("------------------------------------------------");
		while(true) {
			System.out.println("Available products in the store");
			System.out.println("1)Fruits");
			System.out.println("2)Vegerables");
			System.out.println("3)Cosmetic");
			System.out.println("4)Masala Powders");
			System.out.println("Please enter your choice:");
			System.out.println("------------------------------------------------");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1: System.out.println("101---Apple---1Kg is 100");
				        System.out.println("102---Banana---1Kg is 25");
				        System.out.println("103---Orange---1Kg is 40");
				        System.out.println("104---Mango---1Kg is 50");
				        System.out.println("105---Grapes---1Kg is 80");
						System.out.println("Please enter your product code:");
						
						switch(sc.nextInt()) {
							case 101: System.out.println("Apple is good for health.How many kgs do you need?");
									  AppleWeight = sc.nextInt();
									  System.out.println("your order is "+AppleWeight+" kg Apple");
									  break;
									  
							case 102: System.out.println("Banana is healthy.How many kgs do you need?");
									  BananaWeight = sc.nextInt();
									  System.out.println("your order is "+BananaWeight+" kg Banana");
									  break;
									  
							case 103: System.out.println("Orange is good choice.How many kgs do you need?");
									  OrangeWeight = sc.nextInt();
									  System.out.println("your order is "+OrangeWeight+" kg Orange");
									  break;
									  
							case 104: System.out.println("Mango is good choice.How many kgs do you need?");
									  MangoWeight = sc.nextInt();
									  System.out.println("your order is "+MangoWeight+" kg Mango");
									  break;
									  
							case 105: System.out.println("Grapes is good choice.How many kgs do you need?");
									  GrapesWeight = sc.nextInt();
									  System.out.println("your order is "+GrapesWeight+" kg Grapes");
									  break;
									  
							default: System.out.println("Please enter valid product code:");
						}
						System.out.println("Press 1 to continue shopping \n Press 2 to exit");

						switch(sc.nextInt()) {
							case 1: continue;
							case 2: break;
						}
						
						break;
						
				case 2: System.out.println("225---Potato---1Kg is 41");
				        System.out.println("226---Brinjal---1Kg is 35");
				        System.out.println("227---Carrots---1Kg is 60");
				        System.out.println("228---Beetroot---1Kg is 44");
				        System.out.println("229---Drumstick---1Kg is 60");
				        System.out.println("230---Mushroom---1Kg is 50");
						System.out.println("Please enter your product code:");
						
						switch(sc.nextInt()) {
							case 225: System.out.println("potato is easy to cook.How many kgs do you need?");
									  PotatoWeight = sc.nextInt();
									  System.out.println("your order is "+PotatoWeight+" kg Potato");
									  break;

							case 226: System.out.println("Brinjal is good choice.How many kgs do you need?");
									  BrinjalWeight = sc.nextInt();
									  System.out.println("your order is "+BrinjalWeight+" kg Brinjal");
									  break;

							case 227: System.out.println("Carrots is good choice.How many kgs do you need?");
									  CarrotsWeight = sc.nextInt();
									  System.out.println("your order is "+CarrotsWeight+" kg Carrots");
									  break;

							case 228: System.out.println("Beetroot is good choice.How many kgs do you need?");
									  BeetrootWeight = sc.nextInt();
									  System.out.println("your order is "+BeetrootWeight+" kg Beetroot");
									  break;

							case 229: System.out.println("Drumstick is good choice.How many kgs do you need?");
									  DrumstickWeight = sc.nextInt();
									  System.out.println("your order is "+DrumstickWeight+" kg Drumstick");
									  break;

							case 230: System.out.println("Mushroom is good choice.How many kgs do you need?");
									  MushroomWeight = sc.nextInt();
									  System.out.println("your order is "+MushroomWeight+" kg Mushroom");
									  break;
									  
							default: System.out.println("Please enter valid product code:");
							
						}
						System.out.println("Press 1 to continue shopping \n Press 2 to exit");

						switch(sc.nextInt()) {
							case 1: continue;
							case 2: break;
						}

						break;

				case 3: System.out.println("301---Hair Shampoo---10g is 50");
				        System.out.println("302---Sunscreen---10g is 250");
				        System.out.println("303---Skin Serum---10g is 300");
				        System.out.println("304---Facial Cream---10g is 100");
				        System.out.println("305---Moisturizing Cream---10g is 250");
						System.out.println("Please enter your product code:");

						switch(sc.nextInt()) {
							case 301: System.out.println("its a good choice.How many much do you need?");
									HairShampooWeight = sc.nextInt();
									System.out.println("your order is "+HairShampooWeight+" gram Hair Shampoo");
									break;

							case 302: System.out.println("its a good choice.How many much do you need?");
									SunscreenWeight = sc.nextInt();
									System.out.println("your order is "+SunscreenWeight+" gram Sunscreen");
									break;
									
							case 303: System.out.println("its a good choice.How many much do you need?");
									SkinSerumWeight = sc.nextInt();
									System.out.println("your order is "+SkinSerumWeight+" gram Sunscreen");
									break;

							case 304: System.out.println("its a good choice.How many much do you need?");
									FacialCreamWeight = sc.nextInt();
									System.out.println("your order is "+FacialCreamWeight+" gram Sunscreen");
									break;

							case 305: System.out.println("its a good choice.How many much do you need?");
									MoisturizingCreamWeight = sc.nextInt();
									System.out.println("your order is "+MoisturizingCreamWeight+" gram Sunscreen");
									break;

							default: System.out.println("Please enter valid product code:");

							}
							System.out.println("Press 1 to continue shopping \n Press 2 to exit");

							switch(sc.nextInt()) {
								case 1: continue;
								case 2: break;
							}

						break;

				case 4: System.out.println("401---Sambar Powder---1kg is 290");
				        System.out.println("402---Rasam Powder---1kg is 100");
				        System.out.println("403---Garam Masala---1kg is 400");
				        System.out.println("404---Pulao Masala---1kg is 350");
				        System.out.println("405---Curry Powder---1kg is 220");
						System.out.println("Please enter your product code:");

						switch(sc.nextInt()) {
							
							case 401: System.out.println("its a good choice.How many much do you need?");
									  MoisturizingCreamWeight = sc.nextInt();
									  System.out.println("your order is "+MoisturizingCreamWeight+" gram Sunscreen");
									  break;

						}
						System.out.println("Press 1 to continue shopping \n Press 2 to exit");

						switch(sc.nextInt()) {
							case 1: continue;
							case 2: break;
						}

						break;
						
				default: System.out.println("Please enter valid input!!!\n\n\n");		
			}
			
			
		}
		//System.out.println("Billing time");
	}
	
}