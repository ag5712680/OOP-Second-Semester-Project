import javax.swing.JOptionPane;

public class ProductMangement {
	private ListJframe ln;
	Product[] p = new Product[100];
	private int total_products = 0;
	
	public ProductMangement(ListJframe ln ) {
		this.ln=ln;
		
	}
	


    public void deleteItem() {
    	
            boolean found = false;
            if(total_products > 0){
                int id = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Enter the ID of the products to delete:", "Process Del", JOptionPane.QUESTION_MESSAGE
                ));
                for(int i = 0; i < total_products; i++) {
                    if(p[i].itemcode== id) {
                        found = true;
                        for(int j = i; j < total_products - 1; j++) {
                            p[j] = p[j+1];
                        }
                        total_products--;
                    }
                }
                
                
                listOfItem ();
            } else {
                JOptionPane.showMessageDialog(null, "No product id found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if(found==false) {
                JOptionPane.showMessageDialog(null, "product id  does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
    }
    public void listOfItem() {
    	
    	ln.resetBox();
    	
    	for (int i =0 ; i < total_products ; i++) {
       
        	ln.display (p[i]) ;
        	
        }
    	
    
    }

    

        public void add_item() {
        	p[total_products] = new Product();
        	String name=JOptionPane.showInputDialog(null,"enter product name " );
        	float price =Float.parseFloat(JOptionPane.showInputDialog(null,"enter price " ));
        	float quantity=Float.parseFloat(JOptionPane.showInputDialog(null,"enter quantity " ));
        	p[total_products].itemcode = total_products +1;
            p[total_products].itemname=name;
            p[total_products].itemprice=price;
            p[total_products].quantity=quantity;
            total_products++;
            listOfItem();
        }
        
        public void PurchaseItems() {
        	listOfItem();

            boolean found = false;
            if(total_products > 0){
                int id = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Enter the ID of the products to Purchase:", "Process Pur", JOptionPane.QUESTION_MESSAGE
                ));
                for(int i = 0; i < total_products; i++) {
                    if(p[i].itemcode== id) {
                        found = true;
                        int q = Integer.parseInt(JOptionPane.showInputDialog(
                                null, "Enter the ID of the quantity to Purchase:", "Process Pur", JOptionPane.QUESTION_MESSAGE
                            ));
                        if (p[i].quantity>q) {
                        	p[i].quantity-=q;
                        float bill=p[i].itemprice*q;
                        JOptionPane.showMessageDialog(null, " TOTAL BILL IS : "+ bill , "Error", JOptionPane.ERROR_MESSAGE);
                        listOfItem ();     
                        }
                        else {
                        	JOptionPane.showMessageDialog(null, "NOT ENOUGH QUANTIYTY .", "Error", JOptionPane.ERROR_MESSAGE);
                        	
                        }
                
                    }
                    
                }
                
                
            
            } else {
                JOptionPane.showMessageDialog(null, "No product id found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if(found==false) {
                JOptionPane.showMessageDialog(null, "product id  does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        	
        	
        	
        	
        	
        }
     
        



}
