Feature: Book a flight from Flyaway 
Scenario: Book a flight from Flyaway

Given Navigate to the landing page of Flyaway "http://localhost:8080/FlyAway/signup"
When Enter Registration Details
Then Validate Registration Page
And Direct Login Page
Then Validate Login Page
And Enter Login Details
And Click on Home Button
Then Validate Home Page
And Select Source and Destination 
And Book Flight
Then Verify Booking Page
And Click To Complete Booking Link
Then Varify Booking Confirmation Page 
And Click on See Your Booking



