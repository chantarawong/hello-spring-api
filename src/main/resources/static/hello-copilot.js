function calculateDaysBetweenDate(date1, date2) {
    const diffTime = Math.abs(date2 - date1);
    const diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24));
    return diffDays;
}


// find all images without alternate text
// and give them a red border
function processImagesWithoutAltText() {
    const images = document.querySelectorAll('img');
    images.forEach((image) => {
        if (!image.alt) {
            image.style.border = '2px solid red';
        }
    });
}

// express server on port 3000

const express = require('express');
const app = express();
const port = 3000;

app.get('/', (req, res) => {
    res.sendFile(__dirname + '/index.html');
});

app.listen(port, () => {  
    console.log(`Server running on http://localhost:${port}`);
});

// return the current time  
function getCurrentTime()
{
    return new Date().toLocaleTimeString();
}

// return the current date  
function getCurrentDate()
{
    return new Date().toLocaleDateString();
}

// return the current date and time
function getCurrentDateTime()
{
    return new Date().toLocaleString();
}
