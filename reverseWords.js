function reverseWords(sentence) {
    let words = [];
    let word = '';
    let reversedSentence = '';

    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ' || i === sentence.length - 1) {
            // If a space is encountered or it's the last character, reverse the word
            if (i === sentence.length - 1) {
                word += sentence[i];
            }
            let reversedWord = '';
            for (let j = word.length - 1; j >= 0; j--) {
                reversedWord += word[j];
            }
            words.push(reversedWord);
            word = '';
        } else {
            word += sentence[i];
        }
    }

    // Join the reversed words to form the reversed sentence
    reversedSentence = words.join(' ');
    return reversedSentence;
}

// Example usage:
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);