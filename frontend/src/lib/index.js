import moneyIcon from '$lib/assets/money.svg?raw';

export let data = {
    title: "Sales Management",
    icon: moneyIcon,
    modules: {
        admin: [{
            title: "Summary",
            ref: "/admin/summary",
        }],
        user: []
    }
}