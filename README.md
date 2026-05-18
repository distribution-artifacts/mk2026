# Proflog miniKanren 2026 Paper

Drafting workflow:

- Raw notes and author thoughts go in `paper.txt`.
- The submission source is `paper.tex`.
- References go in `references.bib`.
- Build with `make`, which prefers `latexmk` and falls back to
  `pdflatex`/`bibtex`.

Local toolchain note: this repository uses the workshop-required `acmart`
document class. On Debian-like systems, install the class through the TeX Live
publishers collection, for example `texlive-publishers`, or otherwise make
`acmart.cls` available to TeX.

miniKanren 2026 submission constraints from the CFP:

- Use `acmart` with `acmsmall`.
- Submission preamble: `\documentclass[acmsmall,screen,review,anonymous]{acmart}`.
- Submissions are lightweight double-blind and must omit author names and institutions.
- Short papers are roughly 2-7 pages; long papers are roughly 8-25 pages.
