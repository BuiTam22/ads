document.getElementById('contactForm').addEventListener('submit', function (e) {
    e.preventDefault(); // Ngăn form reload

    // Lấy dữ liệu từ các input
    const data = {
        userCustomer: document.getElementById('name').value,
        teleUser: document.getElementById('tele').value,
        whatsAppUser: document.getElementById('whatsapp').value,
        content: document.getElementById('message').value
    };

    // Gửi request POST đến API của bạn
    fetch('/contact', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
        .then(response => {
            if (!response.ok) {
                throw new Error('Có lỗi khi gửi thông tin');
            }
            return response.text();
        })
        .then(message => {
            alert('Gửi thành công!'); // hoặc hiển thị trong trang
            document.getElementById('contactForm').reset();
        })
        .catch(error => {
            alert('Gửi thất bại: ' + error.message);
        });
});