package com.stupid58fly.bank;

public enum TransactionStatus {
    Success {
        @Override
        public String toString() {
            return "Success";
        }
    },
    InvalidCardNumber {
        public String toString() {
            return "Invalid Card Number";
        }
    },
    InvalidCardValidity {
        public String toString() {
            return "Invalid Card Validity";
        }
    },
    InvalidCardData {
        public String toString() {
            return "Invalid Card Data";
        }
    },
    InsufficientFunds {
        public String toString() {
            return "Insufficient Funds";
        }
    }
}
