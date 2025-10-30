	let correct = 0;
	let CorrectAnswer = 0;
	CorrectAnswer += correct;
	Console.log("Who is the favorite facilitator in Semicolon? ");
	Console.log(" (a)  sir sk");
	Console.log(" (b)  mr femi");
	Console.log(" (c)  sir evans");
	Console.log(" (d)  miss kim");


	Console.log(" Select your answer from the above options");
	String select = input.nextLine();


	if (select.equals("a") || select.equals("b") || select.equals("d") || select.equals(" "))
	Console.log("Incorrect Answer");
	
	
	else if (select.equals("b"))
	Console.log("correct" + CorrectAnswer);

	else {
	Console.log("Invalid input");
	}

		//CorrectAnswer++;


		input.nextLine();	

Console.log("Who is the most sophisticated in Cohort 27? ");
Console.log(" (a)  Beny");
Console.log(" (b)  Dotun");
Console.log(" (c)  Nissi");
Console.log(" (d)  Michael");

Console.log(" Select your answer from the above options");
	String pick = input.nextLine();


	if (select.equals("a") || select.equals("c") || select.equals("d") || select.equals(" "))
	Console.log("Incorrect Answer");
	
	else if (pick.equals("b"))
	Console.log("correct" + CorrectAnswer);

	else {
	Console.log("Invalid input");
	}

	//CorrectAnswer++;

	input.nextLine();	

Console.log("Who is the best all round cohort member in Cohort 27?");
Console.log(" (a) Ekwe");
Console.log(" (b)  Dotun");
Console.log(" (c)  Oyinade");
Console.log(" (d)  Eniife");

Console.log(" Select your answer from the above options");
	String choice = input.nextLine();


	if (choice.equals("a") || choice.equals("c") || choice.equals("d") || choice.equals(" "))
	Console.log("Incorrect Answer");
	
	
	else if (choice.equals("b"))
	Console.log("correct" + CorrectAnswer);

	else {
	Console.log("Invalid input");
	}

	//CorrectAnswer++;

input.nextLine();	

Console.log("Who is the prettiest in Cohort 27");
Console.log(" (a) Fatia ");
Console.log(" (b)  Oyinade");
Console.log(" (c)  Eniife");
Console.log(" (d)  Cassy");

Console.log(" Select your answer from the above options");
	String choose = input.nextLine();


	if (choose.equals("d"))
	Console.log("correct " + CorrectAnswer);
	
	else if (choose.equals("a") || choose.equals("b") || choose.equals("c") || choose.equals(" "))
	Console.log("Incorrect Answer");

	else {
	Console.log("Invalid input");
	}
	
	//CorrectAnswer++;

	input.nextLine();	

Console.log("Who is the most annoying in Cohort 27?");
Console.log(" (a) Nelson");
Console.log(" (b)  Fatia");
Console.log(" (c)  Beny");
Console.log(" (d)  Me i don't know");

Console.log(" Select your answer from the above options");
	String click = input.nextLine();


	if (click.equals("a"))
	Console.log("correct " + CorrectAnswer);
	
	else if (click.equals("b") || click.equals("c") || click.equals("d") || click.equals(" "))
	Console.log("Incorrect Answer");

	else {
	Console.log("Invalid input");
}

	//CorrectAnswer++;
	CorrectAnswer++;

	Console.log("You scored:" + CorrectAnswer + " " + "of 5!");
        	
}
}
}