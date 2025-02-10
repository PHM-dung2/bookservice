const findAll = () => {

	option = { method: 'GET' }

	fetch(`/bookservice/book`, option)
		.then(r => r.json())
		.then(data => {
			console.log(data);

			const booklist = document.querySelector('.booklist>tbody');
			let html = ``;
			data.forEach((book) => {
				html += `<tr>
				<td>${book.bno}</td>
				<td><a href="view.jsp?bno=${book.bno}" >${book.bname}</td>
				<td>${book.bwriter}</td>
				<td>${book.bpublisher}</td>
				<td><button class="btn btn-primary" onclick="bookdelete(${book.bno})">삭제하기</button></td>`

			})
			booklist.innerHTML = html;
		})
		.catch(e => { console.log(e) })
}
findAll();

const bookdelete = (bno) => {
	let result = confirm('정말 삭제 하실건가요?');
	if (result == false) return;
	const option = { method: 'DELETE' }
	fetch(`/bookservice/book?bno=${bno}`, option)
		.then(r => r.json())
		.then(data => {
			if (data == true) {
				alert('도서 삭제 성공했습니다.');
				findAll();
			} else {
				alert('도서 삭제 실패했습니다.');
			}
		})
		.catch(e => { console.log(e) })

}
