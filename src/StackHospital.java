import java.util.ArrayList;
import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType>
{

	public StackHospital()
	{
		stackHospital = new ArrayList<PatientType>();
	}

	ArrayList<PatientType> stackHospital; 

	@Override
	public void addPatient(PatientType patient) 
	{			
		stackHospital.add(patient);
	}

	@Override
	public PatientType nextPatient() 
	{
		int nextPatientIndex = stackHospital.size()-1;	
		return stackHospital.get(nextPatientIndex);
	}

	@Override
	public PatientType treatNextPatient() 
	{	
		int nextPatientIndex = stackHospital.size()-1;	
		
		if (!(stackHospital.isEmpty()))
		{
			stackHospital.remove(nextPatientIndex);
			return stackHospital.get(nextPatientIndex);
		}
		else {
			return null; 
		}
	}
	@Override
	public int numPatients() 
	{
		int numPatients = stackHospital.size();
		return numPatients; 
	}

	@Override
	public String hospitalType() 
	{
		return "StackHospital"; 
	}

	@Override
	public String allPatientInfo() 
	{
		String patientRecord  = ""; 
		for (int i = 0; i < stackHospital.size(); i++)
		{
			patientRecord += stackHospital.get(i).toString(); 
		}

		return patientRecord; 
	}
}




/*
LinkedList<String> authorsList = new LinkedList<String>();

authorsList.add("Gamow");
authorsList.add("Penrose");
authorsList.add("Hawking");

authorsList.add(1, "Greene");

-----------------

import java.util.*;
class TestCollection1{
 public static void main(String args[]){

  ArrayList<String> al=new ArrayList<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");
  al.add("Ajay");

  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());

   ---------------

   public E getFirst()
   public E getLast()
   public E removeFirst()
   public E removeLast()
   Throws:
NoSuchElementException - if this list is empty

--------------------

 contains(value){
    let node = this._head;
    while(node){
      if(node.value === value){
        return true;
      }
      node = node.next;
    }
    return false;
  }

  size() {
    return this._length;
  }

  }
 }
}

 */