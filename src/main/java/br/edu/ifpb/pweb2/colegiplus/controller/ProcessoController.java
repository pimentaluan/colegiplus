package br.edu.ifpb.pweb2.colegiplus.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.colegiplus.model.Assunto;
import br.edu.ifpb.pweb2.colegiplus.model.Processo;
import br.edu.ifpb.pweb2.colegiplus.repository.AssuntoRepository;
import br.edu.ifpb.pweb2.colegiplus.service.ProcessoService;

@Controller
@RequestMapping("/processos")
public class ProcessoController {

    @Autowired
    private AssuntoRepository assuntoRepository;

    @Autowired
    private ProcessoService processoService;

    @RequestMapping("/form")
    public ModelAndView getForm(ModelAndView modelAndView) {
        modelAndView.setViewName("processos/form");
        modelAndView.addObject("processo", new Processo());
        return modelAndView;
    }

    @ModelAttribute("assuntos")
    public List<Assunto> getAssuntos() {
        return assuntoRepository.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView adicionaProcesso(Processo processo, ModelAndView modelAndView) {
        processoService.save(processo);
        modelAndView.setViewName("processos/list");
        modelAndView.addObject("processos", processoService.findAll());
        return modelAndView;
    }

}
