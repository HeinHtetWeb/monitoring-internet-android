public class Connection {
   public static boolean isConnected(Context context){
       ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
       if(connectivityManager != null){
           NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
           if(info != null){
               for (int i=0; i<info.length; i++){
                   if(info[i].getState() == NetworkInfo.State.CONNECTED){
                       return true;
                   }
               }
           }
       }
       return false;
   }
}
