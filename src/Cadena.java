public class Cadena {
    public static void main(String[] args) {
       // String [] my_Array = {"FirstWord", "SecondWord", "THIRDWORD"};
      //  String [] my_Array = {"FirstWord", "SecondWord", "THIRDWORD","FoUrThwORd","fIfTHwORD"};
       // String [] my_Array = {"FirstWord", "SecondWord", "THIRDWORD","FoUrThwORd","fIfTHwORD","SIXTHword","SEVenthword"};
        String [] my_Array = {"FirstWord", "SecondWord", "THIRDWORD","FoUrThwORd","fIfTHwORD","SIXTHword","SEVenthword","EightWORD","NiNETHWORD"};
        String cadena="";
        int ce = my_Array.length;

        for (int i=0;i<ce;i++)
        {
            cadena+=my_Array[i].toString().toLowerCase();
            if(i!=ce-1) cadena+=" ";
        }

        System.out.println(cadena.toString());
    }
}
