class Template<T>
{
    private T value;
    public Template()
    {

    }
    public Template(T value)
    {
        this.value = value;
    }
    public T getValue()
    {
        return value;
    }
    public long SizeOf()
    {
        return SizeFetcher.getObjectSize(this);
    }
}
