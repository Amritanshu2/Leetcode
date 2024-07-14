class Solution {
    
    
    HashSet<String> atomSymbols = new HashSet<>();

        
        String[] atomSymbolsArray = {
            "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", 
            "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", 
            "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", 
            "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", 
            "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", 
            "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", 
            "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", 
            "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", 
            "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", 
            "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", 
            "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", 
            "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"
        };
        
    
    public String countOfAtoms(String formula) {
        HashMap<String, Integer> hm = new HashMap<>();
        Stack<String> st = new Stack<>();

        for (int i = 0; i < formula.length(); i++) {
            char ch = formula.charAt(i);
            if (ch == '(') {
                st.push("(");
                continue;
            }
            if (Character.isDigit(ch)) {
                if (!st.isEmpty() && isNumeric(st.peek())) {
                    st.push(st.pop() + ch);
                } else {
                    st.push(ch + "");
                }
                continue;
            }
            if (ch == ')') {
                i++;
                String s = "";
                while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
                    s += formula.charAt(i);
                    i++;
                }
                int num = s.isEmpty() ? 1 : Integer.parseInt(s);
                Stack<String> temp = new Stack<>();
                while (!st.peek().equals("(")) {
                    if (isNumeric(st.peek())) {
                        int a = Integer.parseInt(st.peek());
                        st.pop();
                        temp.push(a * num + "");
                    } else {
                        temp.push(st.pop());
                    }
                }
                st.pop();
                while (!temp.isEmpty()) {
                    st.push(temp.pop());
                }
                i--; // decrement i to adjust for the upcoming increment in the loop
            } else {
                StringBuilder element = new StringBuilder("" + ch);
                while (i + 1 < formula.length() && Character.isLowerCase(formula.charAt(i + 1))) {
                    element.append(formula.charAt(++i));
                }
                st.push(element.toString());

                // Add 1 to stack if no number follows the atom symbol
                int j = i + 1;
                if (j >= formula.length() || !Character.isDigit(formula.charAt(j))) {
                    st.push("1");
                }
            }
        }

        // Build the final atom count map
        while (!st.isEmpty()) {
            String element = st.pop();
            if (isNumeric(element)) {
                int count = Integer.parseInt(element);
                element = st.pop();
                hm.put(element, hm.getOrDefault(element, 0) + count);
            } else {
                hm.put(element, hm.getOrDefault(element, 0) + 1);
            }
        }

        
        StringBuilder result = new StringBuilder();
        hm.entrySet().stream()
          .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
          .forEach(e -> result.append(e.getKey()).append(e.getValue() > 1 ? e.getValue() : ""));

        return result.toString();
    }

    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}