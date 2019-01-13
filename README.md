# WordWrite
An app to generate essay style writing from impeded speech

### Inspiration
We thought about helping people with speech impediments so we designed an application that uses special speech recognition software that filters out trivial nonverbal cues from behaviors such as stuttering to provide pure transcripts that are understandable to all parties.

### What it does
This app transcribes imperfect audio with stutters, lisps, and filled pauses - like uh, umh, hmm - and filters those out, constructing coherent sentences from this speech.

### How we built it
We built this using DialogFlow (for audio processing), using Android Studio.

### Challenges we ran into
We ran into problems with DialogFlow's API versioning. We built our app for DialogFlow 1.0 API, but Google had recently phased that version out, which complicated our efforts.

### Accomplishments that we're proud of
We were able to get DialogFlow to accept the beginnings and endings of words as well as a synonym to match it to another word. For instance, we could extract the keywords from a sentence where a user asked for the beginning of a word (maybe "m"), the meaning of the word (maybe "genius"), and might provide additional parameters such as the end of the word (maybe "o"). Although we didn't finish implementing this feature, the main objective of the feature was to output the desired word (maybe "maestro").

### What we learned
We learned how hard it is to transition from an outdated API version to a newer one which deprecates older API features.

### What's next for WordWrite
We want to get this app working with all the features we envisioned.
