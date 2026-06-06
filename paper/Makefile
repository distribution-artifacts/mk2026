LATEXMK ?= latexmk
PDFLATEX ?= pdflatex
BIBTEX ?= bibtex

.PHONY: all clean
.PHONY: pdflatex

all: paper.pdf

paper.pdf: paper.tex references.bib
	@if command -v $(LATEXMK) >/dev/null 2>&1; then \
	  $(LATEXMK) -pdf -interaction=nonstopmode -halt-on-error paper.tex; \
	else \
	  $(MAKE) pdflatex; \
	fi

pdflatex: paper.tex references.bib
	$(PDFLATEX) -interaction=nonstopmode -halt-on-error paper.tex
	-$(BIBTEX) paper
	$(PDFLATEX) -interaction=nonstopmode -halt-on-error paper.tex
	$(PDFLATEX) -interaction=nonstopmode -halt-on-error paper.tex

clean:
	-rm -f paper.aux paper.bbl paper.bcf paper.blg paper.fdb_latexmk \
	       paper.fls paper.log paper.out paper.run.xml paper.synctex.gz \
	       paper.toc paper.pdf
