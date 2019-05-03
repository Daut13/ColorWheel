package com.example.colorwheel;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public TextView colorCode;
    public TextView rgbCode;
    public ImageView colorWheel;
    public ImageView selectedColor;
    public ImageView[] historyColor = new ImageView[4];
    public int[] intColors = new int[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ID definitions
        colorCode = findViewById(R.id.colorCode);
        rgbCode = findViewById(R.id.rgbCode);
        colorWheel = findViewById(R.id.colorWheel);
        selectedColor = findViewById(R.id.selectedColor);
        historyColor[0] = findViewById(R.id.historyColor1);
        historyColor[1] = findViewById(R.id.historyColor2);
        historyColor[2] = findViewById(R.id.historyColor3);
        historyColor[3] = findViewById(R.id.historyColor4);

        colorWheel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //Grab the action from the motion event
                final int action = motionEvent.getAction();
                //Grab x coordinate on the ImageView
                final int x = (int)motionEvent.getX();
                //Grab y coordinate on the ImageView
                final int y = (int)motionEvent.getY();
                //Create an int that stores the color value
                int touchedColor = getColor(colorWheel, x, y);

                if (action == MotionEvent.ACTION_UP) {
                    if (touchedColor != 0) {
                        //Change the selected color to the touched color
                        changeColor(selectedColor, touchedColor);
                        //set hex value
                        colorCode.setText(getHex(touchedColor));
                        //set rgb value
                        rgbCode.setText(getRGB(touchedColor));
                        //History storage
                        intColors[3] = intColors[2];
                        intColors[2] = intColors[1];
                        intColors[1] = intColors[0];
                        intColors[0] = touchedColor;
                        for (int i = 0; i < intColors.length; i++) {
                            changeColor(historyColor[i], intColors[i]);
                        }
                    }
                    else {
                        //Error check
                        Toast.makeText(getApplicationContext(),
                                "Press the Color Wheel", Toast.LENGTH_LONG).show();
                    }
                }
                return true;
            }
        });

        historyColor[0].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //Grab the action from the motion event
                final int action = motionEvent.getAction();
                //Grab x coordinate on the ImageView
                final int x = (int)motionEvent.getX();
                //Grab y coordinate on the ImageView
                final int y = (int)motionEvent.getY();
                //Create an int that stores the color value
                int touchedColor = getColor(historyColor[0], x, y);
                if (action == MotionEvent.ACTION_UP) {
                    if (touchedColor != 0) {
                        //Change the selected color to the touched color
                        changeColor(selectedColor, touchedColor);
                        //set hex value
                        colorCode.setText(getHex(touchedColor));
                        //set rgb value
                        rgbCode.setText(getRGB(touchedColor));
                        //History storage
                        intColors[3] = intColors[2];
                        intColors[2] = intColors[1];
                        intColors[1] = intColors[0];
                        intColors[0] = touchedColor;
                        for (int i = 0; i < intColors.length; i++) {
                            changeColor(historyColor[i], intColors[i]);
                        }
                    }
                    else {
                        //Error check
                        Toast.makeText(getApplicationContext(),
                                "Press a Color", Toast.LENGTH_LONG).show();
                    }
                }
                return true;
            }
        });

        historyColor[1].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //Grab the action from the motion event
                final int action = motionEvent.getAction();
                //Grab x coordinate on the ImageView
                final int x = (int)motionEvent.getX();
                //Grab y coordinate on the ImageView
                final int y = (int)motionEvent.getY();
                //Create an int that stores the color value
                int touchedColor = getColor(historyColor[1], x, y);
                if (action == MotionEvent.ACTION_UP) {
                    if (touchedColor != 0) {
                        //Change the selected color to the touched color
                        changeColor(selectedColor, touchedColor);
                        //set hex value
                        colorCode.setText(getHex(touchedColor));
                        //set rgb value
                        rgbCode.setText(getRGB(touchedColor));
                        //History storage
                        intColors[3] = intColors[2];
                        intColors[2] = intColors[1];
                        intColors[1] = intColors[0];
                        intColors[0] = touchedColor;
                        for (int i = 0; i < intColors.length; i++) {
                            changeColor(historyColor[i], intColors[i]);
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(),
                                "Press a Color", Toast.LENGTH_LONG).show();
                    }
                }
                return true;
            }
        });

        historyColor[2].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //Grab the action from the motion event
                final int action = motionEvent.getAction();
                //Grab x coordinate on the ImageView
                final int x = (int)motionEvent.getX();
                //Grab y coordinate on the ImageView
                final int y = (int)motionEvent.getY();
                //Create an int that stores the color value
                int touchedColor = getColor(historyColor[2], x, y);
                if (action == MotionEvent.ACTION_UP) {
                    if (touchedColor != 0) {
                        //Change the selected color to the touched color
                        changeColor(selectedColor, touchedColor);
                        //set hex value
                        colorCode.setText(getHex(touchedColor));
                        //set rgb value
                        rgbCode.setText(getRGB(touchedColor));
                        //History storage
                        intColors[3] = intColors[2];
                        intColors[2] = intColors[1];
                        intColors[1] = intColors[0];
                        intColors[0] = touchedColor;
                        for (int i = 0; i < intColors.length; i++) {
                            changeColor(historyColor[i], intColors[i]);
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(),
                                "Press a Color", Toast.LENGTH_LONG).show();
                    }
                }
                return true;
            }
        });

        historyColor[3].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //Grab the action from the motion event
                final int action = motionEvent.getAction();
                //Grab x coordinate on the ImageView
                final int x = (int)motionEvent.getX();
                //Grab y coordinate on the ImageView
                final int y = (int)motionEvent.getY();
                //Create an int that stores the color value
                int touchedColor = getColor(historyColor[3], x, y);
                if (action == MotionEvent.ACTION_UP) {
                    if (touchedColor != 0) {
                        //Change the selected color to the touched color
                        changeColor(selectedColor, touchedColor);
                        //set hex value
                        colorCode.setText(getHex(touchedColor));
                        //set rgb value
                        rgbCode.setText(getRGB(touchedColor));
                        //History storage
                        intColors[3] = intColors[2];
                        intColors[2] = intColors[1];
                        intColors[1] = intColors[0];
                        intColors[0] = touchedColor;
                        for (int i = 0; i < intColors.length; i++) {
                            changeColor(historyColor[i], intColors[i]);
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(),
                                "Press a Color", Toast.LENGTH_LONG).show();
                    }
                }
                return true;
            }
        });
    }

    //grabs the specific pixel that is pressed on the image
    private int getColor(ImageView imageView, int x, int y) {
        imageView.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(imageView.getDrawingCache());
        imageView.setDrawingCacheEnabled(false);
        return bitmap.getPixel(x,y);
    }

    //takes the touched color and converts it into an RGB value
    private String getRGB(int touchedColor) {
        int r = (touchedColor>>16)& 0xFF;
        int g = (touchedColor>>8)& 0xFF;
        int b = (touchedColor>>0)& 0xFF;
        String rgbText = "RGB: ";
        return rgbText + r + "," + g + "," + b;
    }

    //takes the touched color and converts it into a hex value
    private String getHex(int touchedColor) {
        String hexColor = Integer.toHexString(touchedColor);
        if (hexColor.length() > 2) {
            hexColor = hexColor.substring(2);
        }
        return "Hex: #" + hexColor;
    }

    //changes the displayed color to a new color
    private void changeColor(ImageView selectedColor, int touchedColor) {
        selectedColor.setBackgroundColor(touchedColor);
    }
}
