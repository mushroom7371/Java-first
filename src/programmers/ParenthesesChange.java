package programmers;

//괄호 변환
class ParenthesesChange {
	public String solution(String p) {
		int index = splitString(p);
        String u = p.substring(0, index);
        String v = p.substring(index);
        StringBuilder sb = new StringBuilder();

        if(validateString(u)) {
        	sb.append(u);
        }
        else {
            sb.append("(");
            if(!v.equals("")){
            	solution(v);
               v = "";
            }
            sb.append(")");
            sb.append(setValidateGrammer(u));
        }
        if(!v.equals("")){
        	solution(v);
        }

        return sb.toString();
	}
	
	public int splitString(String p) {
		int balanceChk = 0;
		int index = 0;
		
		for(int i = 0; i < p.length(); i++){
			
			if(p.charAt(i) == "(".charAt(0)) {
				balanceChk++;
				index++;
			}else if(p.charAt(i) == ")".charAt(0)) {
				balanceChk--;
				index++;
			}
			
			if(balanceChk == 0) {
				break;
			}
		}
		
		return index;
	}
	
	public boolean validateString(String p) {
		
		if(p.charAt(0) != "(".charAt(0)) {
			return false;
		}
		
		return true;		
	}
	
	public String setValidateGrammer(String p){
	      String [] split = p.split("");
	      StringBuilder sb = new StringBuilder();
	      
	      for(int i = 1; i < split.length - 1; i++) {
	          if(split[i].equals("(")) {
	        	  sb.append(")");
	          }else {
	        	  sb.append("(");
	          }
	      }
	      
	      return sb.toString();
	  }
}
