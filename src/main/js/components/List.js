import React from 'react';


class List extends React.Component {
	constructor(props) {
		super(props);
		this.state = {value: null};
	}

  	render() {
  		
  if (!this.props.repos || this.props.repos.length === 0) return <p>No Data available</p>;
  
	  return (
	  	<form onSubmit={this.handleSubmit} >
	      <h2 className='list-head'>Please select an instructor for chapel sessions split out by instructor.</h2>
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
	    <input type="submit" value="Submit" />
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
    
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ title: 'React POST Request Example' })
    };
    const response = await fetch('https://reqres.in/api/posts', requestOptions);
    const data = await response.json();
    this.setState({ postId: data.id });
    
    
  }
}



export default List;
