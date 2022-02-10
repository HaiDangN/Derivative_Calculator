public class DerivativeCalculator {
    public DerivativeCalculator() {
    }
    //  worry about input later

    // input Formatting: ex. (x + 1)
    public String derive(String input) {
        input = input.replaceAll(" ", "");
        // base cases
        if ( input.matches("[0-9]+")) { // if the input is constant
            return "0";
        }
        else if (input.contains("x")) {//
            try  {
                return "" + input.charAt(input.indexOf("x") - 1);
            }
            catch(StringIndexOutOfBoundsException e){
                return "1";
            }
        }

        else {
            String result = "";
            String[] terms = input.split("\\+");
            for(int i = 0; i < terms.length; i++) {
                result += derive(terms[i]);
                if (i != terms.length - 1) {
                    result += " + ";
                }
            }
            return result;
        }


    }



    private String powerRule(String input) {
        return "";

    }

    private String productRule(String input) {
        return "";
    }

    private String quotientRule(String input) {
        return "";
    }



}
