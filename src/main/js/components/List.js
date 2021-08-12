import React from 'react';


class List extends React.Component {
	constructor(props) {
		super(props);
		this.state = {
			value: null,
			error: false,
		};
	}
	

  	render() {
  		
  if (!this.props.repos || this.props.repos.length === 0) return <p>No Data available</p>;
  
	  return (
	  	<form onSubmit={this.handleSubmit} >
	      <h2 className={this.state.error ? 'list-head-error' : 'list-head'}>Please select an instructor for chapel sessions split out by instructor.</h2>
	      <table>
	      <tbody>
	      {this.props.repos.map((repo) => {
	        return (
	          <tr  key={repo.id}><td>
	          	<input type="radio" name="mentor" value={repo.id} onChange={this.handleChange} />
	            <span className='repo-description'>{repo.label}</span>
	          </td></tr>
	        );
	      })}
	      </tbody>
	    </table>
	    <input class="submit-button" type="submit" value="Submit" />
	    </form> 
	  );
	}

  handleChange=(event) => {
    console.log('A name was chosen: ' + event.target.value);
        this.setState({
    	value: event.target.value,
    	});
    	//event.preventDefault();
  }
  
   handleSubmit=(event) => {
    console.log('A name was submitted: ' + this.state.value);
    event.preventDefault();

	if (this.state.value == null) {
		this.setState({error: true});
		return this.render();
	}
    
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify("")
    };
    fetch('/choices/leaders/' + this.state.value, requestOptions)
        .then(response => response.json())
        .then(data => this.props.post(data.label));
    
  }
  

}



export default List;
