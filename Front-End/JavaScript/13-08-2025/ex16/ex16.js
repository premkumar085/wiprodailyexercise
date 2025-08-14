const images = [
    "img1.jpeg",
    "img2.jpeg",
    "img3.jpeg",
    "img4.jpeg"
];

let currentIndex = 0;

const galleryImage = document.getElementById("galleryImage");

galleryImage.src = images[currentIndex];

function nextImage() {
    currentIndex++;
    if (currentIndex >= images.length) {
        currentIndex = 0; 
    }
    galleryImage.src = images[currentIndex];
}

function prevImage() {
    currentIndex--;
    if (currentIndex < 0) {
        currentIndex = images.length - 1; 
    }
    galleryImage.src = images[currentIndex];
}
