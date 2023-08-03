package cn.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.original.KyarakutaTable;
import cn.itcast.ssm.service.kyarakutaService;
@Controller
public class KyarakutaController {
	        @Autowired
	        private kyarakutaService kyarakutaService;
	
	        @RequestMapping("kyarakutaInit")
	        public String kyarakutaInit()
	                         throws Exception{
	        	return "kyarakutaInfo/kyarakutaList";
	        }
	        
	        @RequestMapping("kyarakutaInitInsert")
	        public String kyarakutaInitInsert()
	                         throws Exception{
	        	return "kyarakutaInfo/kyarakutaInsert";
	        }
	        
	        @RequestMapping("kyarakutainsert")
	        public String kyarakutainsert(KyarakutaTable kyarakuta)
	                         throws Exception{
	        	
	                   kyarakutaService.inserkyarakuta(kyarakuta);
	        	return "redirect:/kyarakutaInit.action";
	        }
	        	
	        @RequestMapping("querykyarakuta")
		    public String querykyarakuta(KyarakutaTable kyarakuta,Model model)
		                         throws Exception{
		        	
	        	List<KyarakutaTable> lst = kyarakutaService.findkyarakutaList(kyarakuta);
		                
		                model.addAttribute("kyarakutaLst", lst);
		                
		                model.addAttribute("kyarakutax", kyarakuta);
		        return "kyarakutaInfo/kyarakutaList";
	        }
	        
	        @RequestMapping("editkyarakuta")
		    public String editkyarakuta(KyarakutaTable kyarakuta,Model model)
		                         throws Exception{
		        	
	        	KyarakutaTable kyarakutaDb = kyarakutaService.findkyarakutaByID(kyarakuta.getKyarakutaId());
		                
		                model.addAttribute("kyarakuta", kyarakutaDb);
		                
		    
		        return "kyarakutaInfo/kyarakutaUpdate";
	        }

	        @RequestMapping("deletekyarakuta")
		    public String deletekyarakuta(String[] kyarakuta_id) 
		                         throws Exception{
		        	
	        	kyarakutaService.deleteItems(kyarakuta_id);
		                
		                
		                
		    
		        return "redirect:/querykyarakuta.action";
	        }

}
