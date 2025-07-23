document.addEventListener("DOMContentLoaded", function () {
    const elements = document.querySelectorAll('.animate-on-scroll');

    function isInViewport(el) {
        const rect = el.getBoundingClientRect();
        return (
            rect.top <= (window.innerHeight || document.documentElement.clientHeight)
        );
    }

    function handleScroll() {
        elements.forEach(el => {
            if (isInViewport(el)) {
                el.classList.add('visible');
            }
        });
    }

    window.addEventListener('scroll', handleScroll);
    window.addEventListener('resize', handleScroll);
    handleScroll(); // gọi khi vừa load để hiển thị phần tử đã nằm sẵn trong viewport
});