# PhoneNumberCorrecting
To correct give number to US E.164 format

Method: 
The method in this program takes user input (String) and compares first with regular expression and then replaces 
the string with desired format(E.164 format).

If the entered number is valid it formats and returns the formatted number, else it returns null.

Solution Decided:-
example: 
if user enters : 1231231230
it formats to : (123) 123-1230

It is not mentioned for international or local. Hence, it is limited to number with area code as prefix. 

# WebsiteReferenceForRegularExpressions
https://www.freeformatter.com/java-regex-tester.html
