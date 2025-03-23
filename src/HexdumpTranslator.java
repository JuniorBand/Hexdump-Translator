package src;

/**
 * Translator of Hexdump to ASCII (0-127 characters)
 * This does not include extended ASCII character (0-255 characters)
 **/



import java.io.FileReader;
import java.io.IOException;

public class HexdumpTranslator {

    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("./testtxt2.txt");
            int counter = 0;
            int c = 0;
            String[] hex = new String[2];

            int data = reader.read();

            //This reads every character
            while (data != -1) {

                Character x = (char) data;
                //System.out.print(counter);
                String y = x.toString().toUpperCase();


                if (y.equals(" ") || y.equals("#")) {
                    data = reader.read();

                } else {
                    //System.out.print(counter);
                    hex[counter] = y;
                    if (counter == 1) {
                    //Calling the translator
                        transfHex(hex[0], hex[1]);
                        counter = 0;
                    } else {counter++;}

                    //Breaks line after 91 characters
                    if(c == 91){
                        System.out.print("\n");
                        c = 0;
                    }else{c++;}

                    //reads the next character
                    data = reader.read();

                }

            }
            reader.close();
        } catch (IOException e){
            System.out.println(e);
        }

    }

    //Translating every 2 numbers to an ASCII character
    static void transfHex(String a, String b){

        String par = a + b;


        switch(par){
//            case "00":
//                System.out.print(".");
//                break;
//            case "01":
//                System.out.print(".");
//                break;
//            case "02":
//                System.out.print(".");
//                break;
//            case "03":
//                System.out.print(".");
//                break;
//            case "04":
//                System.out.print(".");
//                break;
//            case "05":
//                System.out.print(".");
//                break;
//            case "06":
//                System.out.print(".");
//                break;
//            case "07":
//                System.out.print(".");
//                break;
//            case "08":
//                System.out.print(".");
//                break;
//            case "09":
//                System.out.print(".");
//                break;
//            case "A":
//                System.out.print(".");
//                break;
//            case "B":
//                System.out.print(".");
//                break;
//            case "C":
//                System.out.print(".");
//                break;
//            case "D":
//                System.out.print(".");
//                break;
//            case "E":
//                System.out.print(".");
//                break;
//            case "F":
//                System.out.print(".");
//                break;
//            case "11":
//                System.out.print(".");
//                break;
//            case "12":
//                System.out.print(".");
//                break;
//            case "13":
//                System.out.print(".");
//                break;
//            case "14":
//                System.out.print(".");
//                break;
//            case "15":
//                System.out.print(".");
//                break;
//            case "16":
//                System.out.print(".");
//                break;
//            case "17":
//                System.out.print(".");
//                break;
//            case "18":
//                System.out.print(".");
//                break;
//            case "19":
//                System.out.print(".");
//                break;
//            case "1A":
//                System.out.print(".");
//                break;
//            case "1B":
//                System.out.print(".");
//                break;
//            case "1C":
//                System.out.print(".");
//                break;
//            case "1D":
//                System.out.print(".");
//                break;
//            case "1E":
//                System.out.print(".");
//                break;
//            case "1F":
//                System.out.print(".");
//                break;
            case "20":
                System.out.print(" ");
                break;
            case "21":
                System.out.print("!");
                break;
            case "22":
                System.out.print("\"");
                break;
            case "23":
                System.out.print("#");
                break;
            case "24":
                System.out.print("$");
                break;
            case "25":
                System.out.print("%");
                break;
            case "26":
                System.out.print("&");
                break;
            case "27":
                System.out.print("'");
                break;
            case "28":
                System.out.print("(");
                break;
            case "29":
                System.out.print(")");
                break;
            case "2A":
                System.out.print("*");
                break;
            case "2B":
                System.out.print("+");
                break;
            case "2C":
                System.out.print(",");
                break;
            case "2D":
                System.out.print("-");
                break;
//            case "2E":
//                System.out.print(".");
//                break;
            case "2F":
                System.out.print("/");
                break;
            case "30":
                System.out.print("0");
                break;
            case "31":
                System.out.print("1");
                break;
            case "32":
                System.out.print("2");
                break;
            case "33":
                System.out.print("3");
                break;
            case "34":
                System.out.print("4");
                break;
            case "35":
                System.out.print("5");
                break;
            case "36":
                System.out.print("6");
                break;
            case "37":
                System.out.print("7");
                break;
            case "38":
                System.out.print("8");
                break;
            case "39":
                System.out.print("9");
                break;
            case "3A":
                System.out.print(":");
                break;
            case "3B":
                System.out.print(";");
                break;
            case "3C":
                System.out.print("<");
                break;
            case "3D":
                System.out.print("=");
                break;
            case "3E":
                System.out.print(">");
                break;
            case "3F":
                System.out.print("?");
                break;
            case "40":
                System.out.print("@");
                break;
            case "41":
                System.out.print("A");
                break;
            case "42":
                System.out.print("B");
                break;
            case "43":
                System.out.print("C");
                break;
            case "44":
                System.out.print("D");
                break;
            case "45":
                System.out.print("E");
                break;
            case "46":
                System.out.print("F");
                break;
            case "47":
                System.out.print("G");
                break;
            case "48":
                System.out.print("H");
                break;
            case "49":
                System.out.print("I");
                break;
            case "4A":
                System.out.print("J");
                break;
            case "4B":
                System.out.print("K");
                break;
            case "4C":
                System.out.print("L");
                break;
            case "4D":
                System.out.print("M");
                break;
            case "4E":
                System.out.print("N");
                break;
            case "4F":
                System.out.print("O");
                break;
            case "50":
                System.out.print("P");
                break;
            case "51":
                System.out.print("Q");
                break;
            case "52":
                System.out.print("R");
                break;
            case "53":
                System.out.print("S");
                break;
            case "54":
                System.out.print("T");
                break;
            case "55":
                System.out.print("U");
                break;
            case "56":
                System.out.print("V");
                break;
            case "57":
                System.out.print("W");
                break;
            case "58":
                System.out.print("X");
                break;
            case "59":
                System.out.print("Y");
                break;
            case "5A":
                System.out.print("Z");
                break;
            case "5B":
                System.out.print("[");
                break;
            case "5C":
                System.out.print("\\");
                break;
            case "5D":
                System.out.print("]");
                break;
            case "5E":
                System.out.print("^");
                break;
            case "5F":
                System.out.print("-");
                break;
            case "60":
                System.out.print("`");
                break;
            case "61":
                System.out.print("a");
                break;
            case "62":
                System.out.print("b");
                break;
            case "63":
                System.out.print("c");
                break;
            case "64":
                System.out.print("d");
                break;
            case "65":
                System.out.print("e");
                break;
            case "66":
                System.out.print("f");
                break;
            case "67":
                System.out.print("g");
                break;
            case "68":
                System.out.print("h");
                break;
            case "69":
                System.out.print("i");
                break;
            case "6A":
                System.out.print("j");
                break;
            case "6B":
                System.out.print("k");
                break;
            case "6C":
                System.out.print("l");
                break;
            case "6D":
                System.out.print("m");
                break;
            case "6E":
                System.out.print("n");
                break;
            case "6F":
                System.out.print("o");
                break;
            case "70":
                System.out.print("p");
                break;
            case "71":
                System.out.print("q");
                break;
            case "72":
                System.out.print("r");
                break;
            case "73":
                System.out.print("s");
                break;
            case "74":
                System.out.print("t");
                break;
            case "75":
                System.out.print("u");
                break;
            case "76":
                System.out.print("v");
                break;
            case "77":
                System.out.print("w");
                break;
            case "78":
                System.out.print("x");
                break;
            case "79":
                System.out.print("y");
                break;
            case "7A":
                System.out.print("z");
                break;
            case "7B":
                System.out.print("{");
                break;
            case "7C":
                System.out.print("|");
                break;
            case "7D":
                System.out.print("}");
                break;
            case "7E":
                System.out.print("~");
                break;
            case "7F":
                System.out.print("[DEL]");
                break;
            default:
                System.out.print(".");
                break;
        }

    }


}
