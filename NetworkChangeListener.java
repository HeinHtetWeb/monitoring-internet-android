public class NetworkChangeListener extends BroadcastReceiver {
   public void onReceive(Context context, Intent intent) {
       if(!Connection.isConnected(context)){
           AlertDialog.Builder builder = new AlertDialog.Builder(context);
           View dialog = LayoutInflater.from(context).inflate(R.layout.connection_layout,null);
           builder.setView(dialog);
           Dialog noInternetDialog = new Dialog(context);
           noInternetDialog.setContentView(R.layout.connection_layout);
           noInternetDialog.getWindow().setBackgroundDrawable(null);
           noInternetDialog.show();
           Button btnOk = noInternetDialog.findViewById(R.id.btn_ok);
           btnOk.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   noInternetDialog.dismiss();
                   onReceive(context,intent);
               }
           });
       }
   }
}

