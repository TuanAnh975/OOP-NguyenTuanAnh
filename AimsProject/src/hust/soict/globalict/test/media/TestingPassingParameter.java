package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestingPassingParameter {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		 DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		  swap(jungleDVD, cinderellaDVD);
		 System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		 System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		 changeTitle(jungleDVD, cinderellaDVD.getTitle());
		 System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		 
		 Wrapper<DigitalVideoDisc> _jungleDVD = new Wrapper<>(new DigitalVideoDisc("Jungle"));
	        Wrapper<DigitalVideoDisc> _cinderellaDVD = new Wrapper<>(new DigitalVideoDisc("Cinderella"));

	        System.out.println("Before swap:");
	        System.out.println("jungle dvd title: " + _jungleDVD.value.getTitle());
	        System.out.println("cinderella dvd title: " + _cinderellaDVD.value.getTitle());

	        _swap(_jungleDVD, _cinderellaDVD);

	        System.out.println("After swap:");
	        System.out.println("jungle dvd title: " + _jungleDVD.value.getTitle());
	        System.out.println("cinderella dvd title: " + _cinderellaDVD.value.getTitle());
		
	}
	
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	
        
    

    public static <T> void _swap(Wrapper<T> obj1, Wrapper<T> obj2) {
        T temp = obj1.value;
        obj1.value = obj2.value;
        obj2.value = temp;
    }
    

        public static class Wrapper<T> {
            public T value;

            public Wrapper(T value) {
                this.value = value;
            }
       
        }
	

}
