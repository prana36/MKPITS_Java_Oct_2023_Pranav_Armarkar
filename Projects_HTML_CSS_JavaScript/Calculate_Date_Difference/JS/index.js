document.addEventListener('DOMContentLoaded', function() {
    // Function to calculate date difference
    function calculateDateDifference() {
        var date1 = new Date(document.getElementById('Test_Date1').value);
        var date2 = new Date(document.getElementById('Test_Date2').value);
        
        // Calculate the difference in milliseconds
        var difference = Math.abs(date2 - date1);
        
        // Convert milliseconds to days
        var differenceInDays = Math.ceil(difference / (1000 * 3600 * 24));
        
        return differenceInDays;
    }
    
    // Function to update count based on checkboxes
    function updateCount() {
        var count = calculateDateDifference();
        
        if (document.getElementById('exsat1').checked) {
            count = count - Math.floor(count / 7);
        }
        
        if (document.getElementById('exsun1').checked) {
            count = count - Math.floor(count / 7);
        }
        
        document.getElementById('output').textContent = "Difference in days: " + count;
    }
    
    // Event listeners for reset buttons
    document.getElementById('reset_date1').addEventListener('click', function() {
        document.getElementById('Test_Date1').value = '';
        updateCount();
    });

    document.getElementById('reset_date2').addEventListener('click', function() {
        document.getElementById('Test_Date2').value = '';
        updateCount();
    });

    // Event listeners for checkboxes
    document.getElementById('exsat1').addEventListener('click', updateCount);
    document.getElementById('exsun1').addEventListener('click', updateCount);

    // Event listener for form submission
    document.getElementById('formdate').addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent default form submission
        updateCount(); // Update count
    });
});
