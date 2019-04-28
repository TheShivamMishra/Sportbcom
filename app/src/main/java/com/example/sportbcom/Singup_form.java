package com.example.sportbcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Singup_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup_form);

        Spinner dropdown = findViewById(R.id.spinner1);
        String[] items = new String[]{" Select Sport's ", "Abseiling\n" ,
                "Aerobatics\n" ,
                "Aikido\n" ,
                "Air Racing\n" ,
                "Airsoft\n" ,
                "Aquathlon\n" ,
                "Aquatics\n" ,
                "Archery\n" ,
                "Arm Wrestling\n" ,
                "Artistic Billiards\n" ,
                "Autocross\n" ,
                "Autograss\n" ,
                "Automobile Racing\n" ,
                "Ba Game\n" ,
                "Badminton\n" ,
                "Bagatelle\n" ,
                "Ballroom Dancing\n",
                "Bando\n" ,
                "Bandy\n" ,
                "Base Jumping\n" ,
                "Baseball\n" ,
                "Basketball\n" ,
                "Beach Volleyball\n" ,
                "Biathlon\n" ,
                "Bobsleigh\n" ,
                "Bocce Ball\n" ,
                "Body Building\n",
                "Boomerang\n",
                "Bowling\n" ,
                "Boxing\n" ,
                "Bull Fighting\n",
                "Camping\n" ,
                "Canoeing\n" ,
                "Caving\n",
                "Cheerleading\n",
                "Chess\n",
                "Classical Dance\n" ,
                "Cricket\n" ,
                "Cross Country Skiing\n" ,"Cross Country Running\n" , "Curling\n" , "Cycling\n" , "Darts\n" , "Decathlon\n" , "Diving\n" , "Dog Sledding\n" ,"Dog Training\n" , "Down Hill Skiing\n" ,"Equestrianism\n" , "Falconry\n" , "Fencing\n" , "Figure Skating\n" , "Fishing\n" , "Flag Football\n" , "Foosball\n" , "Football\n" , "Fox Hunting\n" , "Golf\n" , "Gymnastics\n" , "Hand Ball\n" , "Hang Gliding\n" , "High Jump\n" , "Hiking\n" , "Hockey\n" , "Horseshoes\n" , "Hot Air Ballooning\n" , "Hunting\n" , "Ice Skating\n" ,"Inline Skating\n" , "Jai Alai\n" , "Judo\n" , "Karate\n" , "Kayaking\n" , "Knee Boarding\n" , "Lacrosse\n" , "Land Sailing\n" , "Log Rolling\n" , "Long Jump\n" , "Luge\n" , "Modern Dance\n" , "Modern Pentathlon\n" , "Motorcycle Racing\n" , "Mountain Biking\n" , "Mountaineering\n" , "Netball\n" , "Paint Ball\n" , "Para Gliding\n" , "Parachuting\n" , "Petanque\n" , "Pool Playing\n" , "Power Walking\n" , "Quad Biking\n", "Racquetball\n", "Remote Control Boating\n", "River Rafting\n" ,"Rock Climbing\n" , "Rodeo Riding\n" , "Roller Skating\n" , "Rowing\n" , "Rugby\n" , "Sailing\n" ,"Scuba Diving\n" , "Shooting\n" , "Shot Put\n" , "Shuffleboard\n" , "Skateboarding\n" , "Skeet Shooting\n" , "Snooker\n" , "Snow Biking\n" , "Snow Boarding\n" , "Snow Shoeing\n" , "Snow Sledding\n" , "Soccer\n" , "Sombo\n" , "Speed Skating\n" , "Sport Fishing\n" , "Sport Guide\n" , "Sprint Running\n" , "Squash\n" , "Stunt Plane Flying\n" , "Sumo Wrestling\n" , "Surfing\n" , "Swimming\n" , "Synchronized Swimming\n" , "Table Tennis\n" , "Taekwondo\n" , "Tchoukball\n" , "Tennis\n" , "Track and Field\n" , "Trampolining\n" , "Triathlon\n" , "Tug of War\n" , "Volleyball\n" , "Water Polo\n" , "Water Skiing\n" , "Weight Lifting\n" , "Wheelchair Basketball\n" , "White Water Rafting\n" , "Wind Surfing\n" , "Wrestling\n" , "Wushu\n" , "Yachting\n" , "Yoga"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

    }
    public void login1(View view) {
        startActivity(new Intent(getApplicationContext(),Main2Activity.class) );
    }
}
