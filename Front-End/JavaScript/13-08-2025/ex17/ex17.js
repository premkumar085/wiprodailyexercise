const quizData = [
    {
        question: "Which is the fastest land animal?",
        options: ["Cheetah", "Tiger", "Horse", "Leopard"],
        answer: "Cheetah"
    },
    {
        question: "Which planet is known as the 'Blue Planet'?",
        options: ["Earth", "Neptune", "Uranus", "Saturn"],
        answer: "Earth"
    },
    {
        question: "What is 5 + 7?",
        options: ["10", "11", "12", "13"],
        answer: "12"
    }
];

let currentQuestion = 0;
let score = 0;

const questionEl = document.getElementById("question");
const optionsEl = document.getElementById("options");
const feedbackEl = document.getElementById("feedback");
const scoreEl = document.getElementById("score");
const nextBtn = document.getElementById("nextBtn");

function loadQuestion() {
    feedbackEl.textContent = "";
    if (currentQuestion >= quizData.length) {
        questionEl.textContent = "Quiz Completed!";
        optionsEl.innerHTML = "";
        nextBtn.style.display = "none";
        scoreEl.textContent = `Your final score is: ${score} / ${quizData.length}`;
        return;
    }
    const q = quizData[currentQuestion];
    questionEl.textContent = q.question;

    optionsEl.innerHTML = "";
    q.options.forEach(option => {
        const btn = document.createElement("button");
        btn.textContent = option;
        btn.onclick = () => checkAnswer(option);
        optionsEl.appendChild(btn);
    });
}

function checkAnswer(selected) {
    const correct = quizData[currentQuestion].answer;
    if (selected === correct) {
        feedbackEl.textContent = "Correct!";
        feedbackEl.style.color = "green";
        score++;
    } else {
        feedbackEl.textContent = "Wrong!";
        feedbackEl.style.color = "red";
    }

    Array.from(optionsEl.children).forEach(btn => btn.disabled = true);
    scoreEl.textContent = `Score: ${score}`;
}

function nextQuestion() {
    currentQuestion++;
    loadQuestion();
}

loadQuestion();
