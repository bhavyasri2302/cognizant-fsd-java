SET SERVEROUTPUT ON;

DECLARE
    CURSOR c_senior_loans IS
        SELECT l.LoanID, l.InterestRate, c.DOB
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID;
        
    v_age NUMBER;
BEGIN
    FOR rec IN c_senior_loans LOOP
        -- Calculate age in years
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12);
        
        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;
            
            DBMS_OUTPUT.PUT_LINE('Discount applied for Loan ID: ' || rec.LoanID || '. New Interest Rate: ' || (rec.InterestRate - 1));
        END IF;
    END LOOP;
    COMMIT;
END;
/