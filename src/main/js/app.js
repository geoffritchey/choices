import React, {Component, useCallback} from "react";
import ReactDOM from "react-dom";

class App extends React.Component { 

	constructor(props) {
		super(props);
	}

	render() { 
		return (
			<div><h1>HERE</h1></div>
		)
	}
}

export default App;

ReactDOM.render(<App />, document.getElementById("react"));
