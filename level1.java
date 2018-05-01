 for (char ch: plaintext.toCharArray()){
            if (Character.isUpperCase(ch)){
                answerStrBuilder.append("000001");
            };
			
			private final String upperCase = "000001";
			private final String space = "000000";
            
            switch (Character.toLowerCase(ch)){
                case 'a':{
                    answerStrBuilder.append("100000");
                    break;
				}
                case 'b':
                    answerStrBuilder.append("110000");
                    break;
				}
                case 'c':{
                    answerStrBuilder.append("100100");
                    break;
				}
                case 'd':{
                    answerStrBuilder.append("100110");
                    break;
				}
                case 'e':{
                    answerStrBuilder.append("100010");
                    break;
				}
                case 'f':{
                    answerStrBuilder.append("110100");
                    break;
				}
                case 'g':{
                    answerStrBuilder.append("110110");
                    break;
				}
                case 'h':{
                    answerStrBuilder.append("110010");
                    break;
				}
                case 'i':{
                    answerStrBuilder.append("010100");
                    break;
				}
                case 'j':{
                    answerStrBuilder.append("010110");
                    break;
				}
                case 'k':{
                    answerStrBuilder.append("101000");
                    break;
				}
                case 'l':{
                    answerStrBuilder.append("111000");
                    break;
				}
                case 'm':{
                    answerStrBuilder.append("101100");
                    break;
				}
                case 'n':{
                    answerStrBuilder.append("101110");
                    break;
				}
                case 'o':{
                    answerStrBuilder.append("101010");
                    break;
				}
                case 'p':{
                    answerStrBuilder.append("111100");
                    break;
				}
                case 'q':{
                    answerStrBuilder.append("111110");
                    break;
				}
                case 'r':{
                    answerStrBuilder.append("111010");
                    break;
				}
                case 's':{
                    answerStrBuilder.append("011100");
                    break;
				}
                case 't':{
                    answerStrBuilder.append("011110");
                    break;
				}
                case 'u':{
                    answerStrBuilder.append("101001");
                    break;
				}
                case 'v':{
                    answerStrBuilder.append("111001");
                    break;
				}
                case 'w':{
                    answerStrBuilder.append("010111");
                    break;
				}
                case 'x':{
                    answerStrBuilder.append("101101");
                    break;
				}
                case 'y':{
                    answerStrBuilder.append("101111");
                    break;
				}
                case 'z':{
                    answerStrBuilder.append("101011");
                    break;
				}
                default:{
                    answerStrBuilder.append("000000");
                    break;
				}
            }
        };
        
        return answerStrBuilder.toString();
} 