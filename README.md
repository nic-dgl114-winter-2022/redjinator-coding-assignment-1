# LapTracker

Author : Reginald McPherson

Course: DGL 114

Assignment: Coding Assignment 1

Submitted on: Feb. 5, 2022

## Project description
Lately I haven't been keeping track of my time in a way that's allowing me to be really creative with an idea for this coding assignment.
I followed closely with the example provided to the class but changed the way time was tracked and displayed and renamed the app.

## Code description
Two private `:Long` variables `begin` and `end` are declared to hold lap timestamps when the buttons are pressed. The `startButton` & `endButton` are set with `setOnClickListener` in `onCreate()` and call `startLap()` and `endLap()` respectively. When the `endButton` is pressed the timestamps are calculated and converted to variables `minutes = ((end-begin)/1000)/60` and `seconds = ((end-begin)/1000)%60` before being displayed.

includes use of:
    * `findViewById()`
    * `setOnClickListener`
    * `startLap()`
    * `endLap()`
    

* includes the following ui elements
    * Buttons
    * TextView
    * EditView

## Challenges
There were no major challenges during this assignment.
