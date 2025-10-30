questions = [ {"question": "Who is the favorite facilitator in Semicolon?",
        	"choices": ["A. Sir. SK", "B. Mr. femi", "C. Sir Evans", "D. Miss Kim"],
        	"correct_answer": "B"},   
	{"question": "Who is the prettiest in Cohort 27?",
        	"choices": ["A. Fatia", "B. Oyinade", "C. Eniife", "D. Cassy"],
        	"correct_answer": "D"},
	{"question": "Who is the most sophisticated in Cohort 27",
        	"choices": ["A. Beny", "B. Dotun", "C. Nissi", "D. Michael"],
        	"correct_answer": "B"},
	{"question": "Who is the lousiest in Cohort 27?",
        	"choices": ["A. Fatia", "B. Martins", "C. Emmanuel", "D. Nelson"],
        	"correct_answer": "D"},
	{"question": "Who is the best all round cohort member in Cohort 27?",
		"choices": ["A. Ekw-e", "B. Dotun", "C. Oyinade", "D. Eniife"],
		"correct_answer": "B"},
	{"question": "Who is the wisest?", "choices": ["A. Nelson", "B. Moses", "C. Nissi", "D. Dotun"],
		"correct_answer": "B"},
	{"question": "Who is the most annoying in Cohort 27?",
		"choices": ["A. Nelson", "B. Fatia", "C. Beny", "D. Me I don't know"],
		"correct_answer": "A"},	
	{"question": "Who dey face gate in Cohort 27?",
		"choices": ["A. Nelson", "B. Eniife", "C. Nobody dey face gate jor", "D. Unbelievers"],
		"correct_answer": "C"} ]


score = 0
print("Welcome to the appraisal quiz!")

for variable in questions:
	print(questions)

for option in questions["choices"]:
	print(option)

answer = input("Enter your answer (A, B, C, or D): ").upper()

if answer == questions["correct_answer"]:
	print("Correct!")
score += 1

#Elif answer != q["wrong_answer"]:
	#print(f"Wrong! The correct answer was {q['correct_answer']}")
#else :

#print(f"\nYour final score is {score}/{len(questions))
