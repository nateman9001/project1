window.onload = () => {
	//document.getElementById("createTodoBtn").addEventListener("onclick", getAllEmployees);
	//getAllReems();
	//document.getElementById("createTodoBtn").addEventListener("click", createTodo);
}


function myFunction() {
	  location.replace("http://localhost:8088/ServletExample/login")
	}




const getAllReems = () => {
	// Step 1: Create an XMLHttpRequest object
	const xhr = new XMLHttpRequest();
	
	// Step 2: Assign a callback function to xhr.onreadystatechange
	xhr.onreadystatechange = () => {
		// Step 5: We handle each of the different possible outcomes from making this request
		if (xhr.status === 200 && xhr.readyState === 4) {
			const json = xhr.responseText;
			console.log(json);
			populateReemsTable(JSON.parse(json));
		}
	};
	
	// Step 3: We call xhr.open(), passing in 2 strings for the HTTP Method and URL
	xhr.open("GET", "http://localhost:8088/ServletExample/api/todos");
	
	// Step 4: We call xhr.send() to actually fire off your HTTP Request
	xhr.send();
}





const populateReemsTable = (listOfTodos) => {
	// The for...of loop is Javascript's version of the enchanced for loop
	// The for...in loop, this iterates over every property of a JS object
	for (let todo of listOfTodos) {
		// Create a table cell for each property of our object
		const tdReemId = document.createElement("td");
		const tdAmount = document.createElement("td");
		const tdDescription = document.createElement("td");
		const tdStatus = document.createElement("td");
		const tdManager = document.createElement("td");
		
		// Set the value of each cell
		tdReemId.textContent = todo.reemId;
		tdAmount.textContent = todo.amount;
		tdDescription.textContent = todo.description;
		tdStatus.textContent = todo.status;
		tdManager.textContent = todo.manager;
		
		// Create a row to be appended onto our table
		const row = document.createElement("tr");
		
		// Set the td's to the corresponding order of our table header
		row.appendChild(tdReemId);
		row.appendChild(tdAmount);
		row.appendChild(tdDescription);
		row.appendChild(tdStatus);
		row.appendChild(tdManager);

		
		
		// Append our row onto our table of todos
		document.getElementById("reemTable").appendChild(row);
	}
}


