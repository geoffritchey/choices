import React from 'react';
const List = (props) => {
  const { repos } = props;
  if (!repos || repos.length === 0) return <p></p>;
  return (
    <table>
      <h2 className='list-head'>Please select an instructor for chapel sessions split out by instructor.</h2>
      {repos.map((repo) => {
        return (
          <tr><td>
          	<input type="radio" name="mentor" value="{repo.id}"/>
            <span className='repo-description'>{repo.label}</span>
          </td></tr>
        );
      })}
    </table>
  );
};
export default List;
