
const createTodo = () => {
	// Step 1: Create the XHR object
	const xhr = new XMLHttpRequest();
	
	// Step 1a: Create a helper variable for your form data
	const formData = parseForm();
	
	// Step 2: Assign the callback function to xhr.onreadystatechange
	xhr.onreadystatechange = () => {
		if (xhr.status === 200 && xhr.readyState === 4) {
			const json = xhr.responseText;
			
			console.log(json);
		}
	}
	
	// Step 3: Open up the request
	xhr.open("POST", "http://localhost:8088/ServletExample/api/todos");
	
	// Step 4: We send off the request
	xhr.send(JSON.stringify(formData));
}

const parseForm = () => {
	//comment this out for alt
	//const userIdNumber = document.getElementById("userId").value;
	//
	const nameText = document.getElementById("name").value;
	const passwordText = document.getElementById("password").value;
	const emailText = document.getElementById("email").value;
	const departmentText = document.getElementById("department").value;
	const employeeTypeText = document.getElementById("employeeType").value;
	return {
		//comment this out for alt
		//userId: userIdNumber,
		//
		name: nameText,
		password: passwordText,
		email: emailText,
		department: departmentText,
		employeeType: employeeTypeText
	}
}



















