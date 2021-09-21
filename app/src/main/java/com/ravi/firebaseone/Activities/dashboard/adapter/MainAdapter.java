package com.ravi.firebaseone.Activities.dashboard.adapter;



import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ravi.firebaseone.Activities.dashboard.DashboardActivity;
import com.ravi.firebaseone.Activities.dashboard.model.Main_Recycle_list;
import com.ravi.firebaseone.DiabeticPlan;
import com.ravi.firebaseone.Diet_plan;
import com.ravi.firebaseone.PaleoPlan;
import com.ravi.firebaseone.R;
import com.ravi.firebaseone.VeganPlan;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{
    Main_Recycle_list[]  myDietData;
    Context context;


    public MainAdapter(Main_Recycle_list[] myDietData, DashboardActivity activity) {
        this.myDietData = myDietData;
        this.context = activity;

    }

    @NonNull
//    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.dashboard_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        final Main_Recycle_list myDietDataList = myDietData[position];
        holder.txtViewName.setText(myDietDataList.getDietName());
//        holder.txtViewDuration.setText(myFitnessDataList.getExerDuration());
        holder.dietImage.setImageResource(myDietDataList.getdietImage());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myDietDataList.getDietName(), Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:

                        Intent Diet_plan_intent = new Intent(context, Diet_plan.class);
                        context.startActivity(Diet_plan_intent);
                        break;
                    case 1:
                        Intent Diabetic_Plan_intent = new Intent(context, DiabeticPlan.class);
                        context.startActivity(Diabetic_Plan_intent);
                        break;

                    case 2:
                        Intent paleo_plan_intent = new Intent(context, PaleoPlan.class);
                        context.startActivity(paleo_plan_intent);
                        break;

                    case 3:
                        Intent Vegan_plan_intent = new Intent(context, VeganPlan.class);
                        context.startActivity(Vegan_plan_intent);
                        break;






                }



            }

        });


    }

    @Override
    public int getItemCount() {
        return myDietData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        ImageView dietImage;
        TextView txtViewName;
//        TextView txtViewDuration;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            dietImage =itemView.findViewById(R.id.imageview);
            txtViewName = itemView.findViewById(R.id.txtname);
//            txtViewDuration = itemView.findViewById(R.id.txtduration);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
//            int position =getAbsoluteAdapterPosition();
//            Intent intent = new Intent(context,Strength.class);
//            context.startActivity(intent);
        }
    }

}