package implementations;

import java.util.ArrayList;

import utilities.DictionaryADT;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;
	
	@Override
	public void createDictionary()
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertKVPair(Object key, Object value)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeKVPair(Object key)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateValue(Object key, Object newValue)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getValue(Object key)
	{
		// TODO Auto-generated method stub
		
	}

}
