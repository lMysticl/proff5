package hwWeek2;

public class CalcCase extends Abstractcalc {
	Integer tmp;
	int tmp1;
	int tmp2;
	int res;
	
	public void inChar(char ch) {
		switch (ch){
		
		case '1':
			 setTemp1(getTemp1()+"1");
			break;
			
		case '2':
			setTemp1(getTemp1()+"2");
			break;
		case '3':
			setTemp1(getTemp1()+"3");
			break;
		case '4':
			setTemp1(getTemp1()+"4");
			break;
		case '5':
			setTemp1(getTemp1()+"5");
			break;
		case '6':
			setTemp1(getTemp1()+"6");
			break;
		case '7':
			setTemp1(getTemp1()+"7");
			break;
		case '8':
			setTemp1(getTemp1()+"8");
			break;
		case '9':
			setTemp1(getTemp1()+"9");
			
			break;
		case '0':
			if (getTemp1().equals(""))
				break;
			if (!getTemp1().equals("")) setTemp1(getTemp1()+"0");
		case '+':
			setOperand('+');
			swap();
				
			break;
		case '-':
			setOperand('-');
			swap();
			break;
		case '*':
			setOperand('*');
			swap();
			break;
		case '/':
			setOperand('/');
			swap();
			break;
		case '=':
			if (getOperand() == '+'){ res = (toInt(getTemp1()) + toInt(getTemp2())); 			}
			if (getOperand() == '-'){res = (toInt(getTemp2()) - toInt(getTemp1()));}
			if (getOperand() == '*'){res = (toInt(getTemp1()) * toInt(getTemp2()));}
			if (getOperand() == '/')
				{
					
				
				if (toInt(getTemp1())!=0)
				{	
				res = (toInt(getTemp1()) / toInt(getTemp2()));
				}
				if (toInt(getTemp1())==0) 
				{
				System.out.println("Делить на нУль какбэ нельзя"); break;
				}
				}
			Integer res1 =res;
			setTemp1(res1.toString());
			System.out.println(res);
			break;
		}
		
		
		}
	
	private void swap (){
		setTemp2(getTemp1());
		setTemp1("");
		//String Temp3 = getTemp1();
		//setTemp2(getTemp1());
		
		
		
	}
			
			
			
		
		private int toInt(String str ){
			tmp = Integer.valueOf(str);
			return  tmp;
			
		}
	}


