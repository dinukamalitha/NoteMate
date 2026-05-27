# NoteMate 🧠✨

NoteMate is an AI-driven academic notes management platform designed to help students unify scattered learning materials, instantly summarize dense lecture PDFs, and generate intelligent study aids like flashcards and semantic search indexes.

---

## 🎯 The Problem & Solution

Students waste hours navigating fragmented notes across Notion, local PDFs, and physical notebooks, often spending more time re-reading long lecture slides than actually studying. 

**NoteMate** solves this by centralizing study materials into structured, module-based repositories and leveraging NLP to generate instant summaries, definitions, and revision tools.

---

## 🚀 Key Features

### 🗂️ Academic Organization
* **Module-Based Management:** Organize study materials cleanly by course codes (e.g., *CS301 – Operating Systems*).
* **Unified Workspace:** Link your manual rich-text notes side-by-side with uploaded lecture PDFs and AI summaries.
* **Semantic Search:** Find exactly what you need instantly across all your notes, PDFs, and summaries using keyword and contextual search.

### 🤖 AI Study Assistant
* **Intelligent PDF Processing:** Upload dense lecture slides or textbooks to instantly extract core text.
* **Smart Summarization:** Generate high-impact bullet points, exam-focused cheat sheets, and key definitions.
* **NLP Keyword Extraction:** Automatically extract critical concepts and tag them for quick filtering.
* **Active Recall (Study Mode):** Automatically spin up interactive flashcards and Q&A pairs directly from your summary data.

---

## 🛠️ Tech Stack

### Backend
* **Language & Framework:** Java 21 + Spring Boot 4
* **ORM & Database:** Spring Data JPA + PostgreSQL
* **AI & NLP Pipeline:** OpenAI API / Custom NLP Embeddings (for summaries & semantic search)

### Frontend
* **Core Framework:** React.js
* **Document Handling:** TipTap / Quill (Rich Text) + React PDF Viewer
* **Styling:** Modern, responsive UI components

---

## 🧱 Architecture Overview

```text
User Workspace
└── Modules (e.g., CS301)
    ├── Written Notes (Rich Text)
    ├── Uploaded PDFs (Lecture Slides)
    ├── AI Summaries (Bullet points / Exam Prep)
    └── Keywords & Tags (NLP Generated)

System Pipelines
├── Frontend (React) ──> UI Dashboards, Text Editors, & PDF Rendering
└── Backend (Spring Boot) ──> REST APIs, PDF Extraction, AI & Embedding Services, DB Layer
