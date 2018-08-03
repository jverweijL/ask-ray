package ai.config;

import aQute.bnd.annotation.metatype.Meta;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;


@ExtendedObjectClassDefinition(category = "Artificial Intelligence", scope = ExtendedObjectClassDefinition.Scope.GROUP)
@Meta.OCD(  
        id = "ai.config.AiConfiguration"
    )
public interface AiConfiguration {
    @Meta.AD(deflt="4304414ee84640ef8267ea82c383d6e9",required = false)
    public String authorisationToken(); 
    
    @Meta.AD(deflt="6",required = false)
    public String numberOfRecordsDisplayed();
    
    @Meta.AD(deflt="asc",required = false)
    public String sortOrder();  
    
    @Meta.AD(deflt="bg-success text-light",required = false)
    public String youClass();
    
    @Meta.AD(deflt="bg-primary text-light", required = false)
    public String rayClass();
    
    @Meta.AD(deflt="true", required = false)
    public String useTimeline();
    
    @Meta.AD(deflt="true", required = false)
    public String centerTimeline();
    
}


