document.getElementById('celebrate-btn').addEventListener('click', function() {
    // Hide the welcome message and show the birthday popup
    document.getElementById('welcome-message').style.display = 'none';
    document.getElementById('birthday-popup').style.display = 'block';
    
    // Set the age dynamically (replace with actual age)
    const age = 20; // Replace with her actual age
    document.getElementById('age').textContent = age;

    // Trigger confetti and balloons (you can replace with real animations if desired)
    const confetti = document.getElementById('confetti');
    const balloons = document.getElementById('balloons');
    
    setTimeout(function() {
        confetti.style.animation = 'confetti 2s infinite';
        balloons.style.animation = 'balloons 3s infinite';
    }, 1000);
});
