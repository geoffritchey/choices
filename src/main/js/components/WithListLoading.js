import React from 'react';

function WithListLoading(Component) {
  return function WihLoadingComponent({ message, isLoading, ...props }) {
    if (message != null) return (<p>{message}</p>);
    if (!isLoading) return <Component {...props} />;
    return (
      <p style={{ textAlign: 'center', fontSize: '30px' }}>
        Hold on, fetching data may take some time :)
      </p>
    );
  };
}
export default WithListLoading;
