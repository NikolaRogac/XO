package com.example.iksoksassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity
{
    ArrayList<ImageButton> list = new ArrayList<>();
    Random randomChoice = new Random();

     ImageButton prvi;
     ImageButton drugi;
     ImageButton treci;
     ImageButton cetvrti;
     ImageButton peti;
     ImageButton sesti;
     ImageButton sedmi;
     ImageButton osmi;
     ImageButton deveti;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        prvi = (ImageButton) findViewById(R.id.c0r0);
        drugi = (ImageButton) findViewById(R.id.c0r1);
        treci = (ImageButton) findViewById(R.id.c0r2);
        cetvrti = (ImageButton) findViewById(R.id.c1r0);
        peti = (ImageButton) findViewById(R.id.c1r1);
        sesti = (ImageButton) findViewById(R.id.c1r2);
        sedmi = (ImageButton) findViewById(R.id.c2r0);
        osmi = (ImageButton) findViewById(R.id.c2r1);
        deveti = (ImageButton) findViewById(R.id.c2r2);

        prvi.setOnClickListener(lis1);
        drugi.setOnClickListener(lis2);
        treci.setOnClickListener(lis3);
        cetvrti.setOnClickListener(lis4);
        peti.setOnClickListener(lis5);
        sesti.setOnClickListener(lis6);
        sedmi.setOnClickListener(lis7);
        osmi.setOnClickListener(lis8);
        deveti.setOnClickListener(lis9);

        list.add(prvi);
        list.add(drugi);
        list.add(treci);
        list.add(cetvrti);
        list.add(peti);
        list.add(sesti);
        list.add(sedmi);
        list.add(osmi);
        list.add(deveti);
    }

    View.OnClickListener lis1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (prvi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
            {
                prvi.setEnabled(false);
            }
            if (prvi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.wall_foreground).getConstantState()))
            {
            prvi.setImageResource(R.mipmap.blackx_foreground);
            }
            kompIgra();
            pobeda();
            pobedakomp();
            prvi.setEnabled(false);
        }
    };

    View.OnClickListener lis2 = new View.OnClickListener() {
        @Override
        public void onClick(View q) {
            if (drugi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
            {
                drugi.setEnabled(false);
            }
            if (drugi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.wall_foreground).getConstantState()))
            {
                drugi.setImageResource(R.mipmap.blackx_foreground);
            }
            kompIgra();
            pobeda();
            pobedakomp();
            drugi.setEnabled(false);
        }
    };

    View.OnClickListener lis3 = new View.OnClickListener() {
        @Override
        public void onClick(View w) {
            if (treci.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
            {
                treci.setEnabled(false);
            }
            if (treci.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.wall_foreground).getConstantState()))
            {
                treci.setImageResource(R.mipmap.blackx_foreground);
            }
            kompIgra();
            pobeda();
            pobedakomp();
            treci.setEnabled(false);
        }
    };

    View.OnClickListener lis4 = new View.OnClickListener() {
        @Override
        public void onClick(View r) {
            if (cetvrti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
            {
                cetvrti.setEnabled(false);
            }
            if (cetvrti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.wall_foreground).getConstantState()))
            {
                cetvrti.setImageResource(R.mipmap.blackx_foreground);
            }
            kompIgra();
            pobeda();
            pobedakomp();
            cetvrti.setEnabled(false);
        }
    };

    View.OnClickListener lis5 = new View.OnClickListener() {
        @Override
        public void onClick(View t) {
            if (peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
            {
                peti.setEnabled(false);
            }
            if (peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.wall_foreground).getConstantState()))
            {
                peti.setImageResource(R.mipmap.blackx_foreground);
            }
            kompIgra();
            pobeda();
            pobedakomp();
            peti.setEnabled(false);
        }
    };

    View.OnClickListener lis6 = new View.OnClickListener() {
        @Override
        public void onClick(View y) {
            if (sesti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
            {
                sesti.setEnabled(false);
            }
            if (sesti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.wall_foreground).getConstantState()))
            {
                sesti.setImageResource(R.mipmap.blackx_foreground);
            }
            kompIgra();
            pobeda();
            pobedakomp();
            sesti.setEnabled(false);
        }
    };

    View.OnClickListener lis7 = new View.OnClickListener() {
        @Override
        public void onClick(View u) {
            if (sedmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
            {
                sedmi.setEnabled(false);
            }
            if (sedmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.wall_foreground).getConstantState()))
            {
                sedmi.setImageResource(R.mipmap.blackx_foreground);
            }
            kompIgra();
            pobeda();
            pobedakomp();
            sedmi.setEnabled(false);
        }
    };

    View.OnClickListener lis8 = new View.OnClickListener() {
        @Override
        public void onClick(View i) {
            if (osmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
            {
                osmi.setEnabled(false);
            }
            if (osmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.wall_foreground).getConstantState()))
            {
                osmi.setImageResource(R.mipmap.blackx_foreground);
            }
            kompIgra();
            pobeda();
            pobedakomp();
            osmi.setEnabled(false);
        }
    };

    View.OnClickListener lis9 = new View.OnClickListener() {
        @Override
        public void onClick(View o) {
            if (deveti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
            {
                deveti.setEnabled(false);
            }
            if (deveti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.wall_foreground).getConstantState()))
            {
                deveti.setImageResource(R.mipmap.blackx_foreground);
            }
            kompIgra();
            pobeda();
            pobedakomp();
            deveti.setEnabled(false);
        }
    };

    private void pobeda()
    {
        if (prvi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&drugi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&treci.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.pobeda1_foreground);
        }
        else if (cetvrti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&sesti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.pobeda1_foreground);
        }
        else if (sedmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&osmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&deveti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.pobeda1_foreground);
        }
        else if (prvi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&cetvrti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&sedmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.pobeda1_foreground);
        }
        else if (drugi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&osmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.pobeda1_foreground);
        }
        else if (treci.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&sesti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&deveti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.pobeda1_foreground);
        }
        else if (prvi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&deveti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.pobeda1_foreground);
        }
        else if (treci.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())
                &&sedmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.pobeda1_foreground);
        }
    }

    private void pobedakomp()
    {
        if (prvi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&drugi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&treci.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.poraz00_foreground);
        }
        else if (cetvrti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&sesti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.poraz00_foreground);
        }
        else if (sedmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&osmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&deveti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.poraz00_foreground);
        }
        else if (prvi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&cetvrti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&sedmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.poraz00_foreground);
        }
        else if (drugi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&osmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.poraz00_foreground);
        }
        else if (treci.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&sesti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&deveti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.poraz00_foreground);
        }
        else if (prvi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&deveti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.poraz00_foreground);
        }
        else if (treci.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState())
                &&sedmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            deveti.setImageResource(R.mipmap.poraz00_foreground);
        }

    }

    private void kompIgra()
    {
        if (prvi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())&&
                prvi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            list.remove(prvi);
        }
        if (drugi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())&&
                drugi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            list.remove(drugi);
        }
        if (treci.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())&&
                treci.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            list.remove(treci);
        }
        if (cetvrti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())&&
                cetvrti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            list.remove(cetvrti);
        }
        if (peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())&&
                peti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            list.remove(peti);
        }
        if (sesti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())&&
                sesti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            list.remove(sesti);
        }
        if (sedmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())&&
                sedmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            list.remove(sedmi);
        }
        if (osmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())&&
                osmi.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            list.remove(osmi);
        }
        if (deveti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.blackx_foreground).getConstantState())&&
                deveti.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.orangeo_foreground).getConstantState()))
        {
            list.remove(deveti);
        }
        ImageButton izabranoPolje;
        int randomPolje=randomChoice.nextInt(list.size());
        izabranoPolje = list.get(randomPolje);


        if (izabranoPolje.getDrawable().getConstantState().equals(getResources().getDrawable(R.mipmap.wall_foreground).getConstantState()))
        {
        izabranoPolje.setImageResource(R.mipmap.orangeo_foreground);
        }
    }

}
