def count_character_occurrences(word, letter):

  return word.count(letter)

word = "Hello World"
letter = "o"
count = count_character_occurrences(word, letter)
print(f"The character '{letter}' appears {count} times in '{word}'.")