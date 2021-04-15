In this experiment, you are supposed to develop a program that implements some of given design patterns mentioned above. The story is about a real estate which has a lot of houses to hire, sell or reserve. A house consists of room, bath, wc and pool. A room’s cost is 1000. Bath, wc and pool’s costs are 800, 500 and 2500 respectively. A house may have a lot of rooms, a lot of baths etc. Opposite also true, a house may have no room, bath etc.
The real estate have orders given by customers. There are four type of order, “rent”, “buy”, “reserve” and “cancel”.
rent <max cost> <house attributes>: This is the most common order. With these order the real estate choose the house ,which has the maximum profit, for given “max cost” and “attributes of house”. For example;
rent 10000 room room wc
10000 is the customer’s maximum cost to rent a house. 2 room and a wc are the house attributes that customer wanted. 
buy <max cost> <house attributes>: This order is very similar to “rent” order. But real estate must calculate the house cost multiply with 10. The second most common order is “buy” order.
reserve <reserve no> <max cost> <house attributes>: This order is used for reserve the house. But in the future this can be canceled by using “reserve no”.
cancel <reserve no>: This order ccancels the reserve by given “reserve no”. The “reserve” and “cancel” type orders are rarely processes.
You have to design the problem by considering some important modifications and in the future these modification should cause minimal coding reqirements:
•	new attribute of house may be added, 
•	new order type may be added.

INPUT, OUTPUT:
The name of the input and output files will be given from the command line.
<program> <input> <output>

	reserve <reserve no> <max cost> <house attributes>: This order is used for reserve the house. But in the future this can be canceled by using “reserve no”.
cancel <reserve no>: This order ccancels the reserve by given “reserve no”. The “reserve” and “cancel” type orders are rarely processes.
You have to design the problem by considering some important modifications and in the future these modification should cause minimal coding reqirements:
•	new attribute of house may be added, 
•	new order type may be added.

INPUT, OUTPUT:
The name of the input and output files will be given from the command line.
<program> <input> <output>

 
	
	
The first line determine the house count (4). The next four line are houses attributes. For example second line “room room pool wc wc bath” is a house attributes. This hoouse have 2 rooms, 2 wcs, a bath and a pool. The cost of this house for renting is 2*1000 + 2*500 + 1*800 + 1*2500 = 6300. For sell cost is 6300*10 = 63000.

The next line after the house attributes finished, is determine the order count (7). The first order line ,which is “rent 2500 room bath”, means the customer wants to rent a house with minimum attribute that is a room and a bath, but customer can give maximum 2500. With this order real estate searches the houses which have minimum a room and a bath. Also you can see all houses have these attributes. So real estate chooses the maximum profit house, but this house’s cost has to be  lower than 2500. The house with “room bath wc” is choosen by the real estate. Result of this, real estate hires this house to customer with 2300 cost. 

The next line is “rent 4000 room room pool”. You can see there are 2 houses which have “pool” attribute. But both of them have higher cost than the customer’s have. So real estate can’t hire a house. “buy” types order are similar to “rent” order. The sixth line of orders is “reserve 1 500 room room room bath bath”. Except the “reserve no” (1), the process is the same with “rent” process. The “reserve no” is unique for all “reserve” orders. This “reserve no” is used in the next line “cancel 1”. With “reserve” order real estate chooses the appropriate house. With “cancel” order’s result, real estate can use that house to rent, to sell or to reserve again.

Every order’s result must be written to output file. For example the first order’s result is 2300 (mentioned above). “cancel” order’s result must be minus result.


Your application will be executed by a linux script. For automated test procedures, you have to submit your work with a main class codded in “Main.java” file in the default package.
The most important part of this experiment is applying design patterns to the given problem. Most of points will be given to the design of the application. You have to report the problems, your solution way and how the design patterns are applied to the problems.

	
The first line determine the house count (4). The next four line are houses attributes. For example second line “room room pool wc wc bath” is a house attributes. This hoouse have 2 rooms, 2 wcs, a bath and a pool. The cost of this house for renting is 2*1000 + 2*500 + 1*800 + 1*2500 = 6300. For sell cost is 6300*10 = 63000.

The next line after the house attributes finished, is determine the order count (7). The first order line ,which is “rent 2500 room bath”, means the customer wants to rent a house with minimum attribute that is a room and a bath, but customer can give maximum 2500. With this order real estate searches the houses which have minimum a room and a bath. Also you can see all houses have these attributes. So real estate chooses the maximum profit house, but this house’s cost has to be  lower than 2500. The house with “room bath wc” is choosen by the real estate. Result of this, real estate hires this house to customer with 2300 cost. 

The next line is “rent 4000 room room pool”. You can see there are 2 houses which have “pool” attribute. But both of them have higher cost than the customer’s have. So real estate can’t hire a house. “buy” types order are similar to “rent” order. The sixth line of orders is “reserve 1 500 room room room bath bath”. Except the “reserve no” (1), the process is the same with “rent” process. The “reserve no” is unique for all “reserve” orders. This “reserve no” is used in the next line “cancel 1”. With “reserve” order real estate chooses the appropriate house. With “cancel” order’s result, real estate can use that house to rent, to sell or to reserve again.

Every order’s result must be written to output file. For example the first order’s result is 2300 (mentioned above). “cancel” order’s result must be minus result.

 

Your application will be executed by a linux script. For automated test procedures, you have to submit your work with a main class codded in “Main.java” file in the default package.
The most important part of this experiment is applying design patterns to the given problem. Most of points will be given to the design of the application. You have to report the problems, your solution way and how the design patterns are applied to the problems.
