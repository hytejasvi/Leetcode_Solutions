class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for (String email : emails) {
            // Split the email into local and domain parts
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            
            // Process the local part: remove everything after '+' and all '.'
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replace(".", "");
            
            // Combine the processed local part with the domain
            String normalizedEmail = local + "@" + domain;
            
            // Add the normalized email to the set
            uniqueEmails.add(normalizedEmail);
        }             

        // The size of the set is the number of unique emails
        return uniqueEmails.size();
    }
}
