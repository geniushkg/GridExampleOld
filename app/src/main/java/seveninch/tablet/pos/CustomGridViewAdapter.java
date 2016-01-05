package seveninch.tablet.pos;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by geniushkg on 1/4/2016.
 */
public class CustomGridViewAdapter extends ArrayAdapter<Item> {
    Context context;
    int layoutResourceId;
    ArrayList<Item> data = new ArrayList<Item>();
    public CustomGridViewAdapter(Context context, int layoutResourceId, ArrayList<Item> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RecordHolder holder = null;
        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new RecordHolder();
            holder.txtTitle = (TextView) row.findViewById(R.id.tvDesc);
            holder.btn = (Button) row.findViewById(R.id.gbtn);
          //  holder.imageItem = (ImageView) row.findViewById(R.id.item_image);
            row.setTag(holder);
        } else { holder = (RecordHolder) row.getTag();
        } Item item = data.get(position);
        holder.txtTitle.setText(item.getDesc());
        Integer tmp = item.getC();
        Integer resID = null;
        switch (tmp){

            case 1:
                resID = R.drawable.ckp;
                break;
            case 2:
                resID = R.drawable.goan;
                break;
            case 3:
                resID = R.drawable.guj;
                break;
            case 4:
                resID = R.drawable.kashmiri;
                break;
            case 5:
                resID = R.drawable.nagpuri;
                break;

        }
        holder.btn.setBackgroundResource(resID);

        row.setId(position);
        // Now set the onClickListener
        final View finalRow = row;
        row.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "Clicked" + finalRow.getId() + "!!",
                        Toast.LENGTH_SHORT).show();
                Toast.makeText(context,"click"+ finalRow.getId() +"!",Toast.LENGTH_SHORT).show();
            }
        });
        //holder.imageItem.setImageBitmap(item.getImage());
        return row;
    }
    static class RecordHolder {
        TextView txtTitle;
        Button btn;
        //ImageView imageItem;
    }




}
